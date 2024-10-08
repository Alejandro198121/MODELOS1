package modelo.Concreto;

import modelo.fabricaAbstracta.Soldado;

public class SoldadoOrco implements Soldado {
    @Override
    public void atacar() {
        System.out.println("El soldado orco ataca con hacha.");
    }
}