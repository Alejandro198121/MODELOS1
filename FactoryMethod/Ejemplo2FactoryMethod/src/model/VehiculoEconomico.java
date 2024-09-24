package model;

import model.abstracto.Vehiculo;

public class VehiculoEconomico extends Vehiculo {

    public VehiculoEconomico() {
        this.nombre = "Vehículo Económico";
    }

    @Override
    public String describir() {
        return "Vehículo Económico con un costo accesible y buen rendimiento de combustible.";
    }

    @Override
    public double calcularCosto() {
        return 20000.00;
    }
}
