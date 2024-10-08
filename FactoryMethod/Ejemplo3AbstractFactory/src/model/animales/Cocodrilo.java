package model.animales;

import model.fabricaAbstracta.Animal;

public class Cocodrilo implements Animal {

    @Override
    public String emitirSonido() {
        return "El cocodrilo hace un ruido aterrador.";
    }
}
