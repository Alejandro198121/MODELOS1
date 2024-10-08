package modelo.Concreto;

import modelo.fabricaAbstracta.Arquero;

public class ArqueroElfo implements Arquero {
    @Override
    public void disparar() {
        System.out.println("El arquero elfo dispara una flecha mágica.");
    }
}