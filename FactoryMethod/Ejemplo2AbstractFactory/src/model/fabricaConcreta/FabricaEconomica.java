package model.fabricaConcreta;

import model.fabricaAbstracta.Vehiculo;
import model.fabricaAbstracta.VehiculoFactory;


public class FabricaEconomica implements VehiculoFactory {

    @Override
    public Vehiculo crearAuto() {
        return new AutoEconomico();
    }

    @Override
    public Vehiculo crearMoto() {
        return new MotoEconomica();
    }

    @Override
    public Vehiculo crearCamion() {
        return new CamionEconomico();
    }
}
