package icaro.aplicaciones.agentes.AgenteAplicacionBebida.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConversacionBebida {
	
	private static HashMap<String,List<String>> conversacion;
	
	static{		
		conversacion = new HashMap<String, List<String>>();
				
		List<String> cartaBebida = new ArrayList<String>();
		cartaBebida.add("Genial. Disponemos de las siguientes bebidas: \n - Coca-cola (Light, Zero) \n - Fanta (Naranja y Limon) \n - Cerveza (Con y sin alcohol) \n - Nestea");
		
		List<String> preguntarBebidas = new ArrayList<String>();
		preguntarBebidas.add("¿Deseas acompañar tu pedido con alguna bebida?");

		List<String> preguntarNumeroBebidas = new ArrayList<String>();
		preguntarNumeroBebidas.add("¿Cuántas bebidas deseas?");

		List<String> noQuiereBebidas = new ArrayList<String>();
		noQuiereBebidas.add("Bueno, no importa, otra vez será");
		
		List<String> noSabeSiQuiereBebidas = new ArrayList<String>();
		noSabeSiQuiereBebidas.add("En serio, necesito saber si vas a querer bebidas para poder continuar");
		noSabeSiQuiereBebidas.add("Perdona, no te he entendido. ¿Quieres bebidas?");
		noSabeSiQuiereBebidas.add("Quieres bebidas, ¿sí o no?");

		List<String> quiereBebidas = new ArrayList<String>();
		quiereBebidas.add("¿Cuál deseas?");
		
		List<String> bebidaExisteYPreguntaCantidad = new ArrayList<String>();
		bebidaExisteYPreguntaCantidad.add("Genial, ¿Y de esta bebida cuántas unidades deseas?");
		
		List<String> bebidaExiste = new ArrayList<String>();
		bebidaExiste.add("Genial, añadido a tu pedido.");
		
		List<String> muchasBebidas = new ArrayList<String>();
		muchasBebidas.add("No has pedido tantas bebidas, introduce una cantidad menor");
		
		List<String> masBebidas = new ArrayList<String>();
		masBebidas.add("¿Quieres algo mas?");
		masBebidas.add("¿Te apetece algo mas de beber?");
		masBebidas.add("Bueno sigamos, ¿Quieres algo mas de beber?");
		
		List<String> noSeSabeSiQuiereMas = new ArrayList<String>();
		noSeSabeSiQuiereMas.add("Por favor indica si quieres mas bebidas");
		noSeSabeSiQuiereMas.add("Necesito que nos digas si quieres o no mas bebidas");
		noSeSabeSiQuiereMas.add("Inidica si o no");
		
		List<String> bebidaNoExiste = new ArrayList<String>();
		bebidaNoExiste.add("Esa bebida no está disponible.");
		
		List<String> cantidadNoValida = new ArrayList<String>();
		cantidadNoValida.add("Por favor, introduce una cantidad válida");
		
		conversacion.put("preguntarBebidas", preguntarBebidas);
		conversacion.put("preguntarNumeroBebidas", preguntarNumeroBebidas);
		conversacion.put("noQuiereBebidas", noQuiereBebidas);
		conversacion.put("noSabeSiQuiereBebidas", noSabeSiQuiereBebidas);
		conversacion.put("quiereBebidas", quiereBebidas);
		conversacion.put("bebidaExiste", bebidaExiste);
		conversacion.put("bebidaNoExiste", bebidaNoExiste);	
		conversacion.put("cartaBebida", cartaBebida);
		conversacion.put("cantidadNoValida", cantidadNoValida);
		conversacion.put("muchasBebidas", muchasBebidas);
		conversacion.put("bebidaExisteYPreguntaCantidad", bebidaExisteYPreguntaCantidad);
		conversacion.put("masBebidas", masBebidas);
		conversacion.put("noSeSabeSiQuiereMas", noSeSabeSiQuiereMas);
		
	}
	
	
	public static String msg(String tipo){

		String msg = null;
		if(conversacion.get(tipo) != null && conversacion.get(tipo).size() > 0){
			int index = (int)(System.currentTimeMillis() % conversacion.get(tipo).size());
			msg = conversacion.get(tipo).get(index);
		}
		return msg;
	}
	

}
