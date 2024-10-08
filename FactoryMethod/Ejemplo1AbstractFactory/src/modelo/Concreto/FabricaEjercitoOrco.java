package modelo.Concreto;

import modelo.fabricaAbstracta.Arquero;
import modelo.fabricaAbstracta.FabricaEjercito;
import modelo.fabricaAbstracta.Mago;
import modelo.fabricaAbstracta.Soldado;

public class FabricaEjercitoOrco implements FabricaEjercito {
    @Override
    public Soldado crearSoldado() {
        return new SoldadoOrco();
    }

    @Override
    public Arquero crearArquero() {
        return new ArqueroOrco();
    }

    @Override
    public Mago crearMago() {
        return new MagoOrco();
    }
}