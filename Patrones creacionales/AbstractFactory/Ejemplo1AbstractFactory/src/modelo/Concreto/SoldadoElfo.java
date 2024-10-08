package modelo.Concreto;

import modelo.fabricaAbstracta.Soldado;

public class SoldadoElfo implements Soldado {
    @Override
    public void atacar() {
        System.out.println("El soldado elfo ataca con espada ligera.");
    }
}