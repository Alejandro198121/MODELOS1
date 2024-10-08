package modelo.Concreto;

import modelo.fabricaAbstracta.Mago;

public class MagoElfo implements Mago {
    @Override
    public void lanzarHechizo() {
        System.out.println("El mago elfo lanza un hechizo de curación.");
    }
}