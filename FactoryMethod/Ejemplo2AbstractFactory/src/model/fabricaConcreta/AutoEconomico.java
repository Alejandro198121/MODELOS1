package model.fabricaConcreta;

import model.fabricaAbstracta.Vehiculo;

public class AutoEconomico implements Vehiculo {

    @Override
    public String mostrarDetalles() {
        return "Auto económico: motor 1.4L, interiores sencillos, tecnología básica.";
    }
}
