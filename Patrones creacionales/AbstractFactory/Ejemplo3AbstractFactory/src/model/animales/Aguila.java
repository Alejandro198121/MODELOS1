package model.animales;

import model.fabricaAbstracta.Animal;

public class Aguila implements Animal {

    @Override
    public String emitirSonido() {
        return "El águila emite un grito agudo.";
    }
}
