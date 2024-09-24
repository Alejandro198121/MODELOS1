package controller;

import model.abstracto.*;
import model.concretoCreador.*;
import view.VistaConsola;

public class Controller {

	private VistaConsola vista;

	public Controller() {
		vista = new VistaConsola();
	}

	public void run() {
		int tipoNotificacion;
		boolean opcionValida = false;

		while (!opcionValida) {
			vista.mostrarInformacion("TIPOS DE NOTIFICACIÓN:" + "\n1. Notificación por Email"
					+ "\n2. Notificación por SMS" + "\n3. Notificación Push");

			tipoNotificacion = vista.leerDatoEntero("Seleccione el tipo de notificación: ");

			try {
				NotificacionFactory fabrica = new NotificacionCreador();
				Notificacion notificacion = fabrica.crearNotificacion(tipoNotificacion);

				vista.mostrarInformacion("HA SELECCIONADO: " + notificacion.enviar());
				opcionValida = true;

			} catch (IllegalArgumentException e) {
				vista.mostrarInformacion("ERROR: Opción no válida. Por favor seleccione una opción entre 1 y 3.");
			}
		}
	}
}
