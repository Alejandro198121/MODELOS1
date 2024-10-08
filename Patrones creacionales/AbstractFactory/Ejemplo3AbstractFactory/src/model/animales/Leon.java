package model.animales;

import model.fabricaAbstracta.Animal;

public class Leon implements Animal {

    @Override
    public String emitirSonido() {
        return "El león ruge ferozmente.";
    }
}
