package model.fabricaConcreta;

import model.fabricaAbstracta.*;

public class FabricaDeLujo implements VehiculoFactory {

    @Override
    public Vehiculo crearAuto() {
        return new AutoDeLujo();
    }

    @Override
    public Vehiculo crearMoto() {
        return new MotoDeLujo();
    }

    @Override
    public Vehiculo crearCamion() {
        return new CamionDeLujo();
    }
}
