package modelo.fabricaAbstracta;

public interface FabricaEjercito {
	Soldado crearSoldado();

	Arquero crearArquero();

	Mago crearMago();
}