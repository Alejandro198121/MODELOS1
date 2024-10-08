package model.concretoCreador;

import model.VehiculoDeLujo;
import model.VehiculoDeportivo;
import model.VehiculoEconomico;
import model.abstracto.Vehiculo;
import model.abstracto.VehiculoFactory;

public class VehiculoCreador implements VehiculoFactory {

	@Override
	public Vehiculo crearVehiculo(int tipo) {
		switch (tipo) {
		case 1:
			return new VehiculoDeLujo();
		case 2:
			return new VehiculoDeportivo();
		case 3:
			return new VehiculoEconomico();
		default:
			throw new IllegalArgumentException("Tipo de vehículo no válido.");
		}
	}
}
