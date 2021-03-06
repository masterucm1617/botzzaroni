package icaro.aplicaciones.agentes.AgenteAplicacionPago.tareas;

import icaro.aplicaciones.informacion.gestionPizzeria.Notificacion;
import icaro.infraestructura.entidadesBasicas.procesadorCognitivo.TareaComunicacion;

/**
 *
 * @author SONIAGroup
 */
public class Distribuir extends TareaComunicacion {

	@Override
	public void ejecutar(Object... params) {

		this.getIdentTarea();
		this.getIdentAgente();
		Notificacion notif = (Notificacion) params[0];
		String idAgente = (String) params[1];
		try {
			this.informaraOtroAgente(notif, idAgente);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
