package modelo.Concreto;

import modelo.fabricaAbstracta.Mago;

public class MagoOrco implements Mago {
    @Override
    public void lanzarHechizo() {
        System.out.println("El mago orco lanza un hechizo de veneno.");
    }
}