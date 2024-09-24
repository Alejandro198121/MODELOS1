package model.abstracto;

public abstract class Documento {

	protected int proposito;
	protected String nombre;

	public Documento(int propositoDocumento, String nombreDocumento) {
		this.proposito = propositoDocumento;
		this.nombre = nombreDocumento;
	}

	public abstract String describir();

	public void cambiarNombreDocumento(String newName) {
		nombre = newName;
	}

}
