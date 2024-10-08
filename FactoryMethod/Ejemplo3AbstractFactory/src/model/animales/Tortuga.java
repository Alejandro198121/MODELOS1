package model.animales;

import model.fabricaAbstracta.Animal;

public class Tortuga implements Animal {

    @Override
    public String emitirSonido() {
        return "La tortuga hace un sonido suave y lento.";
    }
}
