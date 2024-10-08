package modelo.Concreto;

import modelo.fabricaAbstracta.Soldado;

public class SoldadoHumano implements Soldado {
    @Override
    public void atacar() {
        System.out.println("El soldado humano ataca con espada.");
    }
}