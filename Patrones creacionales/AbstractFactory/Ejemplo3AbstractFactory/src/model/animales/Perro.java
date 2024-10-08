package model.animales;

import model.fabricaAbstracta.Animal;

public class Perro implements Animal {

    @Override
    public String emitirSonido() {
        return "El perro ladra amigablemente.";
    }
}
