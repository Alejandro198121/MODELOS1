package model;

import model.abstracto.Documento;

public class Excel extends Documento {

	public Excel(int propositoDocumento, String nombreDocumento) {
		super(propositoDocumento, nombreDocumento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String describir() {
		// TODO Auto-generated method stub
		return "Este documento es de tipo: ...EXCEL... \nSe llama: " + this.nombre;
	}

}
