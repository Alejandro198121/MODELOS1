package model;

import model.abstracto.Documento;

public class Presentacion extends Documento {

	public Presentacion(int propositoDocumento, String nombreDocumento) {
		super(propositoDocumento, nombreDocumento);
		// TODO Auto-generated constructor stub
	}

	public String describir() {
		// TODO Auto-generated method stub
		return "Este documento es de tipo: ...POWERPOINT... \nSe llama: " + this.nombre;
	}
}
