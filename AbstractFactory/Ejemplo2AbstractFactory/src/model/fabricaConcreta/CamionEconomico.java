package model.fabricaConcreta;

import model.fabricaAbstracta.Vehiculo;

public class CamionEconomico implements Vehiculo {

    @Override
    public String mostrarDetalles() {
        return "Camión económico: capacidad de 10 toneladas, motor eficiente.";
    }
}
