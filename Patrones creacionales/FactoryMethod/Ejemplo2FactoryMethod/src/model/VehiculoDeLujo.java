package model;

import model.abstracto.Vehiculo;

public class VehiculoDeLujo extends Vehiculo {

    public VehiculoDeLujo() {
        this.nombre = "Vehículo de Lujo";
    }

    @Override
    public String describir() {
        return "Vehículo de Lujo con las mejores características y acabados premium.";
    }

    @Override
    public double calcularCosto() {
        return 100000.00;
    }
}
