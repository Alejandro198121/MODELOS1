package modelo.Concreto;

import modelo.fabricaAbstracta.Arquero;

public class ArqueroOrco implements Arquero {
    @Override
    public void disparar() {
        System.out.println("El arquero orco dispara una flecha envenenada.");
    }
}