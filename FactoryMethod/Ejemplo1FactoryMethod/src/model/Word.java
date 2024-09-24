package model;

import model.abstracto.Documento;

public class Word extends Documento {

	public Word(int propositoDocumento, String nombreDocumento) {
		super(propositoDocumento, nombreDocumento);
		// TODO Auto-generated constructor stub
	}

	public String describir() {
		// TODO Auto-generated method stub
		return "Este documento es de tipo: ...EDITOR DE TEXTO... \nSe llama: " + this.nombre;
	}
}
