package model.concretoCreador;

import model.Excel;
import model.Presentacion;
import model.Word;
import model.abstracto.Documento;
import model.abstracto.DocumentoFactory;

public class DocumentoCreador implements DocumentoFactory {

	@Override
	public Documento crearDocumento(int proposito, String nombre) {
		if (proposito == 1) {
			return new Word(1, nombre);
		} else if (proposito == 2) {
			return new Excel(2, nombre);
		} else {
			return new Presentacion(3, nombre);
		}
	}
}
