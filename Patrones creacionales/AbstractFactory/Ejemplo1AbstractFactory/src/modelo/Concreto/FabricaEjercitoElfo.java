package modelo.Concreto;

import modelo.fabricaAbstracta.Arquero;
import modelo.fabricaAbstracta.FabricaEjercito;
import modelo.fabricaAbstracta.Mago;
import modelo.fabricaAbstracta.Soldado;

public class FabricaEjercitoElfo implements FabricaEjercito {
    @Override
    public Soldado crearSoldado() {
        return new SoldadoElfo();
    }

    @Override
    public Arquero crearArquero() {
        return new ArqueroElfo();
    }

    @Override
    public Mago crearMago() {
        return new MagoElfo();
    }
}