package modelo.Concreto;

import modelo.fabricaAbstracta.Mago;

public class MagoHumano implements Mago {
    @Override
    public void lanzarHechizo() {
        System.out.println("El mago humano lanza un hechizo de fuego.");
    }
}