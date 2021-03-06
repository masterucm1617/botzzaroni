package icaro.aplicaciones.recursos.persistenciaAccesoBD.imp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;

import icaro.aplicaciones.informacion.gestionPizzeria.Ingrediente;
import icaro.aplicaciones.informacion.gestionPizzeria.Pedido;
import icaro.aplicaciones.informacion.gestionPizzeria.Pizza;
import icaro.aplicaciones.informacion.gestionPizzeria.Usuario;
import icaro.aplicaciones.recursos.persistenciaAccesoBD.ItfUsoPersistenciaAccesoBD;
import icaro.infraestructura.patronRecursoSimple.imp.ImplRecursoSimple;
import icaro.infraestructura.recursosOrganizacion.recursoTrazas.imp.componentes.InfoTraza;

public class ClaseGeneradoraPersistenciaAccesoBD extends ImplRecursoSimple
		implements ItfUsoPersistenciaAccesoBD {

	private static final long serialVersionUID = 1L;
	// private ItfUsoRecursoTrazas trazas;
	// private ConsultaBBDD consulta;
	private PersistenciaAccesoImp accesoBD;

	public ClaseGeneradoraPersistenciaAccesoBD(String id) throws Exception {

		super(id);
		/*
		 * try{ trazas =
		 * (ItfUsoRecursoTrazas)this.itfUsoRepositorioInterfaces.obtenerInterfaz
		 * ( NombresPredefinidos.ITF_USO+NombresPredefinidos.RECURSO_TRAZAS);
		 * }catch(Exception e){ this.itfAutomata.transita("error");
		 * System.out.println("No se pudo usar el recurso de trazas"); }
		 */
		try {
			accesoBD = new PersistenciaAccesoImp();
			PersistenciaAccesoImp.crearEsquema(id);
			trazas.aceptaNuevaTraza(new InfoTraza(this.getId(),
					"Creando el esquema " + id, InfoTraza.NivelTraza.debug));
			// Se hace una consulta de prueba para ver si funciona lo creado
			try {
				compruebaUsuario("prueba", "prueba");

			} catch (Exception e) {
				e.printStackTrace();
				this.trazas
						.aceptaNuevaTraza(new InfoTraza(
								id,
								"El script de Creacion de la BD y de las Tablas se ha ejecutado satisfactoriamente, pero al realizar la prueba de acceso a la BD Se ha producido un error: "
										+ e.getMessage()
										+ ": Verificar el que el nombre de la BD definido en el Scrip de creacion Coincida con"
										+ "el nombre de la BD definido en la propiedad: MYSQL_NAME_BD",
								InfoTraza.NivelTraza.error));
				this.itfAutomata.transita("error");
				throw e;
			}

		} catch (Exception e) {
			this.trazas
					.aceptaNuevaTraza(new InfoTraza(
							id,
							" Se ha producido un error en la creación del esquema de la BD : "
									+ e.getMessage()
									+ ": Verificar el que el nombre de la BD definido en el Scrip de creacion Coincida con"
									+ "el nombre de la BD definido en la propiedad: MYSQL_NAME_BD",
							InfoTraza.NivelTraza.error));
			this.itfAutomata.transita("error");
			throw e;
		}

	}

	@Override
	public boolean compruebaUsuario(String usuario, String password)
			throws ErrorEnRecursoException {
		try {

			// Boolean resconsulta = consulta.compruebaUsuario(usuario,
			// password);
			Boolean resconsulta = accesoBD.compruebaUsuario(usuario, password);
			this.trazas.aceptaNuevaTraza(new InfoTraza(id,
					"Comprobando usuario " + usuario + " Resultado consulta = "
							+ resconsulta, InfoTraza.NivelTraza.debug));
			return resconsulta;
		} catch (Exception e) {
			e.printStackTrace();
			this.trazas.aceptaNuevaTraza(new InfoTraza(id,
					"Comprobando usuario " + usuario
							+ " Se ha producido un error: " + e.getMessage(),
					InfoTraza.NivelTraza.error));
			this.itfAutomata.transita("error");
			return false;

		}

	}

	@Override
	public boolean compruebaNombreUsuario(String usuario)
			throws ErrorEnRecursoException {
		trazas.aceptaNuevaTraza(new InfoTraza(this.getId(),
				"Comprobando nombre de usuario " + usuario,
				InfoTraza.NivelTraza.debug));
		// return consulta.compruebaNombreUsuario(usuario);
		return accesoBD.compruebaNombreUsuario(usuario);

	}

	@Override
	public void insertaUsuario(String usuario, String password)
			throws ErrorEnRecursoException {
		trazas.aceptaNuevaTraza(new InfoTraza(this.getId(),
				"Insertando usuario " + usuario, InfoTraza.NivelTraza.debug));
		// consulta.insertaUsuario(usuario, password);
		accesoBD.insertaUsuario(usuario, password);

	}

	@Override
	public void termina() {
		trazas.aceptaNuevaTraza(new InfoTraza(this.getId(),
				"Terminando recurso", InfoTraza.NivelTraza.debug));
		// AccesoBBDD.desconectar();
		PersistenciaAccesoImp.desconectar();
		try {
			super.termina();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Usuario obtenerUsuario(String usuario) throws ErrorEnRecursoException {
			trazas.aceptaNuevaTraza(new InfoTraza(this.getId(),
					"Obteniendo datos de usuario " + usuario,
					InfoTraza.NivelTraza.debug));
			return accesoBD.obtenerDatosUsuario(usuario);

	}
	
	@Override
	public ArrayList<Pizza> obtenerPersonalizadasUsuario(String usuario) throws ErrorEnRecursoException {
			trazas.aceptaNuevaTraza(new InfoTraza(this.getId(),
					"Obteniendo pizzas personalizadas de usuario " + usuario,
					InfoTraza.NivelTraza.debug));
			return accesoBD.obtenerPersonalizadasUsuario(usuario);

	}
	
	@Override
	public  ArrayList<Pizza> obtenerMasPedidaCarta(String usuario) throws ErrorEnRecursoException {
			trazas.aceptaNuevaTraza(new InfoTraza(this.getId(),
					"Obteniendo pizzas más pedidas de usuario " + usuario,
					InfoTraza.NivelTraza.debug));
			return accesoBD.obtenerMasPedidaUsuario(usuario);

	}

	@Override
	public boolean existePizzaPersonalizadaNombre(String username, String nombrePizza) throws  ErrorEnRecursoException {
		trazas.aceptaNuevaTraza(new InfoTraza(this.getId(),
				"Comprobando si ya estaba ese nombre de pizza personalizada: " + nombrePizza,
				InfoTraza.NivelTraza.debug));
		return accesoBD.existePizzaPersonalizada(username, nombrePizza);
	}

	@Override
	public void insertaPizzaPersonalizada(Pizza pizza) throws  ErrorEnRecursoException {
			trazas.aceptaNuevaTraza(new InfoTraza(this.getId(),
				"Insertando pizza personalizada " + pizza.toString(), InfoTraza.NivelTraza.debug));
		// consulta.insertaUsuario(usuario, password);
		accesoBD.insertaPizzaPersonalizada(pizza);
	}

	@Override
	public ArrayList<SimpleDateFormat> consultaPedidos(SimpleDateFormat sdf) throws Exception {
		GregorianCalendar gc = (GregorianCalendar) sdf.getCalendar();
		trazas.aceptaNuevaTraza(new InfoTraza(this.getId(),
				"Obteniendo pedidos de la fecha " + sdf.format(gc.getTime()),
				InfoTraza.NivelTraza.debug));
		return accesoBD.consultaPedidosFecha(sdf);
	}

	@Override
	public void insertaPedido(Pedido pedido) throws Exception {
		trazas.aceptaNuevaTraza(new InfoTraza(this.getId(),
				"Insertando el pedido",
				InfoTraza.NivelTraza.debug));
		accesoBD.insertaPedido(pedido);
}

	@Override
	public void insertaDatosUsuario(Usuario gr) throws Exception {
		trazas.aceptaNuevaTraza(new InfoTraza(this.getId(),
				"Actualizando datos usuario",
				InfoTraza.NivelTraza.debug));
		accesoBD.insertaDatosUsuario(gr);
	}
	
	

}