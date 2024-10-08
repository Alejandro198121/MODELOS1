package model.fabricaConcreta;

import model.fabricaAbstracta.Animal;
import model.fabricaAbstracta.AnimalFactory;
import model.animales.Leon;
import model.animales.Aguila;
import model.animales.Cocodrilo;

public class FabricaAnimalesSalvajes implements AnimalFactory {

    @Override
    public Animal crearMamifero() {
        return new Leon();
    }

    @Override
    public Animal crearAve() {
        return new Aguila();
    }

    @Override
    public Animal crearReptil() {
        return new Cocodrilo();
    }
}
