package model;

import model.abstracto.Vehiculo;

public class VehiculoDeportivo extends Vehiculo {

    public VehiculoDeportivo() {
        this.nombre = "Vehículo Deportivo";
    }

    @Override
    public String describir() {
        return "Vehículo Deportivo con un alto rendimiento y velocidad.";
    }

    @Override
    public double calcularCosto() {
        return 70000.00;
    }
}
