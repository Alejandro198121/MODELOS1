package model.fabricaConcreta;

import model.fabricaAbstracta.Vehiculo;

public class MotoEconomica implements Vehiculo {

    @Override
    public String mostrarDetalles() {
        return "Moto económica: 150cc, diseño sencillo, tecnología básica.";
    }
}
