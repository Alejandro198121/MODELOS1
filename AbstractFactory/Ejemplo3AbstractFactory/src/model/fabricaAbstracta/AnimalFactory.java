package model.fabricaAbstracta;

public interface AnimalFactory {
    Animal crearMamifero();
    Animal crearAve();
    Animal crearReptil();
}
