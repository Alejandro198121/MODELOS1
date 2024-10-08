package model.fabricaConcreta;

import model.fabricaAbstracta.Vehiculo;

public class AutoDeLujo implements Vehiculo {

	@Override
	public String mostrarDetalles() {
		return "Auto de lujo: motor V8, interiores de cuero, tecnología avanzada.";
	}
}
