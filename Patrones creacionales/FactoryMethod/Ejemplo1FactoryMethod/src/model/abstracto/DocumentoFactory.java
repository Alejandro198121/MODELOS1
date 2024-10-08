package model.abstracto;

public interface DocumentoFactory {

	Documento crearDocumento(int proposito, String nombre);
}
