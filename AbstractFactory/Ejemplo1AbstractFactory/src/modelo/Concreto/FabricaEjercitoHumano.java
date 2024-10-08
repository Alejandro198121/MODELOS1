package modelo.Concreto;

import modelo.fabricaAbstracta.Arquero;
import modelo.fabricaAbstracta.FabricaEjercito;
import modelo.fabricaAbstracta.Mago;
import modelo.fabricaAbstracta.Soldado;

public class FabricaEjercitoHumano implements FabricaEjercito {
    @Override
    public Soldado crearSoldado() {
        return new SoldadoHumano();
    }

    @Override
    public Arquero crearArquero() {
        return new ArqueroHumano();
    }

    @Override
    public Mago crearMago() {
        return new MagoHumano();
    }
}