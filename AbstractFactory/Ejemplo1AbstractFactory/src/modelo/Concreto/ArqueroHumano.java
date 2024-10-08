package modelo.Concreto;

import modelo.fabricaAbstracta.Arquero;

public class ArqueroHumano implements Arquero {
    @Override
    public void disparar() {
        System.out.println("El arquero humano dispara una flecha.");
    }
}