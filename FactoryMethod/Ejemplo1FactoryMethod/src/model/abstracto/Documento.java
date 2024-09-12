package model.abstracto;

public abstract class Documento {

	protected int proposito;
	
	public Documento(int propositoDocumento) {
		this.proposito = propositoDocumento;
	}
	
	public abstract String describir();


}
