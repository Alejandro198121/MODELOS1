package model.animales;

import model.fabricaAbstracta.Animal;

public class Gallina implements Animal {

    @Override
    public String emitirSonido() {
        return "La gallina cacarea tranquilamente.";
    }
}
