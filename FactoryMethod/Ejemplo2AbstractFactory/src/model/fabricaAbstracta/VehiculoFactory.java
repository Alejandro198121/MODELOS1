package model.fabricaAbstracta;

public interface VehiculoFactory {
    Vehiculo crearAuto();
    Vehiculo crearMoto();
    Vehiculo crearCamion();
}
