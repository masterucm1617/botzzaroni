package icaro.aplicaciones.agentes.AgenteAplicacionIdentificadorBotzza.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConversacionBotzza {
	
	private static HashMap<String,List<String>> conversacion;
	
	static{
		conversacion = new HashMap<String, List<String>>();
		
		List<String> saludoInicialDesconocido = new ArrayList<String>();
		saludoInicialDesconocido.add("¡Hola! Soy Botzzaroni, gracias por darnos la oportunidad de hacer de su comida un momento único de felicidad.");

		List<String> saludoInicialConocido = new ArrayList<String>();
		saludoInicialConocido.add("¡Hola! Qué alegría verte de nuevo por aquí :)");
		saludoInicialConocido.add("Oh, ¡cuánto tiempo! Me alegro de verte otra vez.");
		saludoInicialConocido.add("¡Buenas! ¡Te he echado de menos! ¿Qué quieres pedir hoy?");

		List<String> saludoInicialNoSaludo = new ArrayList<String>();
		saludoInicialNoSaludo.add("Me gusta que me saluden antes, ¿sabes..? jeje ;)");
		saludoInicialNoSaludo.add("En primer lugar, ¡hola!. Soy un bot educado :(. ¡Es broma! Soy una máquina, pero tengo sentido del humor :)");
		saludoInicialNoSaludo.add("Se te ha olvidado saludarme :(");

		List<String> solicitarNombre = new ArrayList<String>();
		solicitarNombre.add("Todavía no te conocemos, ¿me dices tu nombre?");
		solicitarNombre.add("Para comenzar, ¿me puedes decir tu nombre?");
		solicitarNombre.add("Empecemos... ¿me dices tu nombre?");
		
		List<String> solicitarApellido = new ArrayList<String>();
		solicitarApellido.add("Ahora necesito que me digas tu apellido.");
		solicitarApellido.add("¿Y cuál es tu apellido?");
		
		List<String> solicitarApellidoImperativo = new ArrayList<String>();
		solicitarApellidoImperativo.add("En serio, necesito que me digas tu apellido.");
		solicitarApellidoImperativo.add("No te desvíes del tema... ¿cuál es tu apellido?");

		List<String> solicitarNombreImperativo = new ArrayList<String>();
		solicitarNombreImperativo.add("Para continuar, le recuerdo que necesito su nombre.");
		solicitarNombreImperativo.add("Por favor, coopere, dígame su nombre :)");
		solicitarNombreImperativo.add("Realmente necesito su nombre, por favor.");

		List<String> inactividad = new ArrayList<String>();
		inactividad.add("¡Qué solo estoy! ¡¡Qué solo!! Decidme algo ;(");
		inactividad.add("Soy un robot muy ocupado, ¡¡no puedo esperar eternamente!!");

		List<String> volverASaludar = new ArrayList<String>();
		volverASaludar.add("Jajaja, ¡pero si ya nos hemos saludado antes!");
		volverASaludar.add("¡Ya nos hemos saludado antes! Recuerda que soy una máquina, me acuerdo de todo. Jajaja :)");
			
		List<String> sincontexto = new ArrayList<String>(); 
		sincontexto.add("Disculpa que sea tan cortito, pero no te estoy entendiendo ;(");
		sincontexto.add("No me estarás vacilando, ¿no? Es que no entiendo de que me estás hablando :(");
		sincontexto.add("Lo siento, pero no os entiendo. Estoy preparado especialmente para pedir pizzas ;(");

		List<String> despedida = new ArrayList<String>(); 
		despedida.add("Espero que volváis pronto. ¡¡Ciaooo!! ");
		despedida.add("¡¡Hasta pronto!!");
		despedida.add("¡¡Adiós!! Espero que os hayáis llevado una buena impresión de mí :)");
		despedida.add("¡¡Hasta la próxima!! :)");

		List<String> peticionTelefono = new ArrayList<String>(); 
		peticionTelefono.add("¿Me puedes indicar tu teléfono móvil? Lo usaremos en caso de que haya algún problema con vuestro pedido.");
			
		List<String> noTelefono = new ArrayList<String>(); 
		noTelefono.add("Lo siento pero para mí eso no es un teléfono, escribidme un teléfono que yo entienda.");
			
		List<String> peticionTelefonoImperativo = new ArrayList<String>(); 
		peticionTelefonoImperativo.add("Por favor, necesitamos tu número de teléfono");
		peticionTelefonoImperativo.add("Si no nos das tu número de teléfono no podemos seguir :(");
		peticionTelefonoImperativo.add("Si no nos das tu número de teléfono no podemos continuar con tu pedido.");


		List<String> fechaAnterior = new ArrayList<String>(); 
		fechaAnterior.add("Disculpa, pero la fecha en la que quieres tu pedido es anterior a la fecha actual. Dime una fecha posterior, por favor :)");

		List<String> desconocido = new ArrayList<String>();
		desconocido.add("Perdona, creo que me he perdido...");
		desconocido.add("No sé muy bien de qué me estás hablando...");
		desconocido.add("Todavía no me han enseñado a hablar de eso. Quizás en el futuro... :)");

		List<String> tengoTuPizza = new ArrayList<String>();
		tengoTuPizza.add("Ok, tengo tu pizza.");
		tengoTuPizza.add("De acuerdo, apunto esa pizza.");
		tengoTuPizza.add("Mmh, ¡esa pizza está deliciosa!");

		
		List<String> tengoTuMasa = new ArrayList<String>();
		tengoTuMasa.add("Apunto esa masa entonces.");
		tengoTuMasa.add("Oh, ¡es mi masa favorita!");
		tengoTuMasa.add("¡Mi masa favorita!");

		List<String> tengoTuSalsa = new ArrayList<String>();
		tengoTuSalsa.add("¡Qué salsa más rica! Buena elección :)");
		tengoTuSalsa.add("¡Esa salsa está muy buena!");
		tengoTuSalsa.add("Salsa anotada.");
		
		List<String> tengoTuNombre = new ArrayList<String>();
		tengoTuNombre.add("¡Gracias! Apunto tu nombre ;)");
		tengoTuNombre.add("Vale, usaré ese nombre de ahora en adelante :)");
		
		List<String> tengoTuApellido = new ArrayList<String>();
		tengoTuApellido.add("De acuerdo. Apunto también tu apellido.");
		tengoTuApellido.add("Gracias. Ya he apuntado tu apellido");
		
		List<String> solicitaConfirmarDireccion = new ArrayList<String>();
		solicitaConfirmarDireccion.add("Tenemos una dirección ya almacenada, ¿Quieres usar la misma dirección?");
		
		List<String> direccionConfirmada = new ArrayList<String>();
		direccionConfirmada.add("Genial, usaremos esa dirección :)");
		direccionConfirmada.add("Ok, usaremos la dirección que tenemos guardada ;)");

		
		List<String> solicitaCalle = new ArrayList<String>();
		solicitaCalle.add("Muy bien, dinos el nombre de la calle, por favor.");
		
		List<String> solicitarConfirmarDireccionImperativo = new ArrayList<String>();
		solicitarConfirmarDireccionImperativo.add("Necesitamos saber si quieres usar esa dirección...");
		solicitarConfirmarDireccionImperativo.add("Si no nos dices si quieres esa dirección o no sabemos a dónde mandar tus pizzas.");

		List<String> solicitaTelefono = new ArrayList<String>();
		solicitaTelefono.add("Ahora necesitamos un teléfono para poder ponernos en contacto si es necesario.");
		solicitaTelefono.add("Muy bien, ahora facilítanos un teléfono de contacto");
		
		List<String> tengoTuTelefono = new ArrayList<String>();
		tengoTuTelefono.add("Apuntamos ese teléfono entonces.");
		tengoTuTelefono.add("Genial, ya podemos ponernos en contacto contigo.");
		tengoTuTelefono.add("¡Teléfono listo!");
		
		List<String> peticionCalleImperativo = new ArrayList<String>();
		peticionCalleImperativo.add("Si no nos dices el nombre de la calle no podemos mandarte el pedido :(");
		peticionCalleImperativo.add("Necesitamos saber el nombre de la calle donde quieres recibir el pedido...");


		List<String> tengoTuCalle = new ArrayList<String>();
		tengoTuCalle.add("Vale, apunto esa calle.");
		tengoTuCalle.add("Guardo esa calle entonces.");

		List<String> solicitaPortal = new ArrayList<String>();
		solicitaPortal.add("¿Y cuál es tu portal?");
		solicitaPortal.add("¿Me dices el portal?");
		
		List<String> peticionPortalImperativo = new ArrayList<String>();
		peticionPortalImperativo.add("Necesito que me digas tu portal :(");
		peticionPortalImperativo.add("Quizás no me has entendido. Necesito apuntar tu portal...");
		
		List<String> tengoTuPortal = new ArrayList<String>();
		tengoTuPortal.add("¡Portal apuntado!");
		tengoTuPortal.add("Ya tengo el portal :)");
		
		List<String> solicitaPiso = new ArrayList<String>();
		solicitaPiso.add("¿Y cuál es tu piso?");
		solicitaPiso.add("¿Y el piso?");
		
		List<String> peticionPisoImperativo = new ArrayList<String>();
		peticionPisoImperativo.add("Necesito saber el piso :(");
		peticionPisoImperativo.add("Por favor, necesito saber el piso...");
		
		List<String> tengoTuPiso = new ArrayList<String>();
		tengoTuPiso.add("¡Piso apuntado!");
		tengoTuPiso.add("Vale, ya tengo el piso ;)");
		
		List<String> solicitaPuerta = new ArrayList<String>();
		solicitaPuerta.add("¿Y la puerta?");
		solicitaPuerta.add("¿Qué puerta?");
		
		List<String> peticionPuertaImperativo = new ArrayList<String>();
		peticionPuertaImperativo.add("Necesito saber la puerta :(");
		peticionPuertaImperativo.add("Por favor, necesito saber la puerta...");
		
		List<String> tengoTuPuerta = new ArrayList<String>();
		tengoTuPuerta.add("¡Tengo la puerta!");
		tengoTuPuerta.add("Vale, ya tengo la puerta ;)");
		
		List<String> tengoTusDatos = new ArrayList<String>();
		tengoTusDatos.add("Ya tengo todos tus datos :) Vamos con tu pedido...");
		tengoTusDatos.add("Ya he guardado tus datos de contacto. Vamos con lo importante ;)");
		
		conversacion.put("saludoInicialDesconocido", saludoInicialDesconocido);
		conversacion.put("saludoInicialConocido", saludoInicialConocido);
		conversacion.put("saludoInicial", saludoInicialConocido);

		conversacion.put("saludoInicialNoSaludo", saludoInicialNoSaludo);
		conversacion.put("solicitarNombre", solicitarNombre);
		conversacion.put("inactividad", inactividad);
		conversacion.put("volverASaludar", volverASaludar);
		conversacion.put("sincontexto", sincontexto);
		conversacion.put("despedida", despedida);
		conversacion.put("peticionTelefono", peticionTelefono);
		conversacion.put("noTelefono", noTelefono);
		conversacion.put("solicitarNombreImperativo", solicitarNombreImperativo);
		conversacion.put("peticionTelefonoImperativo", peticionTelefonoImperativo);
		conversacion.put("fechaAnterior", fechaAnterior);		
		conversacion.put("desconocido", desconocido);		

		conversacion.put("tengoTuPizza", tengoTuPizza);
		conversacion.put("tengoTuMasa", tengoTuMasa);
		conversacion.put("tengoTuSalsa", tengoTuSalsa);
		conversacion.put("tengoTuNombre", tengoTuNombre);
		conversacion.put("solicitarApellido", solicitarApellido);
		conversacion.put("tengoTuApellido", tengoTuApellido);
		conversacion.put("solicitarApellidoImperativo", solicitarApellidoImperativo);
		conversacion.put("solicitaConfirmarDireccion", solicitaConfirmarDireccion);
		conversacion.put("solicitaCalle", solicitaCalle);
		conversacion.put("direccionConfirmada", direccionConfirmada);
		conversacion.put("solicitarConfirmarDireccionImperativo",solicitarConfirmarDireccionImperativo);
		conversacion.put("solicitaTelefono", solicitaTelefono);
		conversacion.put("tengoTuTelefono", tengoTuTelefono);
		
		conversacion.put("peticionCalleImperativo", peticionCalleImperativo);
		conversacion.put("tengoTuCalle", tengoTuCalle);
		conversacion.put("solicitaPortal",  solicitaPortal);
		conversacion.put("peticionPortalImperativo", peticionPortalImperativo);
		conversacion.put("tengoTuPortal", tengoTuPortal);
		conversacion.put("solicitaPiso", solicitaPiso);
		conversacion.put("peticionPisoImperativo", peticionPisoImperativo);
		conversacion.put("tengoTuPiso", tengoTuPiso);
	
		conversacion.put("solicitaPuerta", solicitaPuerta);
		conversacion.put("peticionPuertaImperativo", peticionPuertaImperativo);
		conversacion.put("tengoTuPuerta", tengoTuPuerta);
		conversacion.put("tengoTusDatos", tengoTusDatos);
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
