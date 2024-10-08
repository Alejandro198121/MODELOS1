package model.fabricaConcreta;

import model.fabricaAbstracta.Vehiculo;

public class CamionDeLujo implements Vehiculo {

    @Override
    public String mostrarDetalles() {
        return "Camión de lujo: capacidad de 20 toneladas, motor de alto rendimiento.";
    }
}
