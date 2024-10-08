package model.fabricaConcreta;

import model.fabricaAbstracta.Vehiculo;

public class MotoDeLujo implements Vehiculo {

    @Override
    public String mostrarDetalles() {
        return "Moto de lujo: 1000cc, diseño aerodinámico, tecnología avanzada.";
    }
}
