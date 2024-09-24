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
		int tipoVehiculo;
		boolean opcionValida = false;

		while (!opcionValida) {
			vista.mostrarInformacion("TIPOS DE VEHICULO:" + "\n1. Vehículo de Lujo" + "\n2. Vehículo Deportivo"
					+ "\n3. Vehículo Económico");

			tipoVehiculo = vista.leerDatoEntero("Seleccione el tipo de vehículo: ");

			try {
				VehiculoFactory fabrica = new VehiculoCreador();
				Vehiculo vehiculo = fabrica.crearVehiculo(tipoVehiculo);

				vista.mostrarInformacion("HAS SELECCIONADO UN " + vehiculo.describir());
				vista.mostrarInformacion("COSTO: " + vehiculo.calcularCosto());
				opcionValida = true;

			} catch (IllegalArgumentException e) {
				vista.mostrarInformacion("ERROR: Opción no válida. Por favor seleccione una opción entre 1 y 3.");
			}
		}
	}
}
