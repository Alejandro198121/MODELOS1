package model.fabricaConcreta;

import model.fabricaAbstracta.Animal;
import model.fabricaAbstracta.AnimalFactory;
import model.animales.Perro;
import model.animales.Gallina;
import model.animales.Tortuga;

public class FabricaAnimalesDomesticos implements AnimalFactory {

    @Override
    public Animal crearMamifero() {
        return new Perro();
    }

    @Override
    public Animal crearAve() {
        return new Gallina();
    }

    @Override
    public Animal crearReptil() {
        return new Tortuga();
    }
}
