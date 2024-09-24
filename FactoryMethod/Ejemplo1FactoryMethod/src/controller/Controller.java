package controller;

import model.abstracto.Documento;
import model.abstracto.DocumentoFactory;
import model.concretoCreador.DocumentoCreador;
import view.VistaConsola;

public class Controller {

	private VistaConsola vista;

	public Controller() {
		vista = new VistaConsola();
	}

	public void run() {
		int proposito = 0;
		String nombre = "documentoSinNombre";
		int opcion = 0;
		boolean opcionValida = false;

		while (!opcionValida) {
			vista.mostrarInformacion("Proposito del documento?" + "\n1:editor de texto" + "\n2:hacer hojas de calculo"
					+ "\n3:hacer presentaciones en diapositivas");
			opcion = vista.leerDatoEntero("");

			switch (opcion) {
			case 1:
				proposito = 1;
				opcionValida = true;
				break;
			case 2:
				proposito = 2;
				opcionValida = true;
				break;
			case 3:
				proposito = 3;
				opcionValida = true;
				break;
			default:
				System.out.println("Opción no válida, por favor intenta de nuevo.");
				break;
			}
		}

		DocumentoFactory fabrica = new DocumentoCreador();
		Documento documento = fabrica.crearDocumento(proposito, nombre);

		vista.mostrarInformacion(documento.describir());
		opcionValida = false;
		
		while (!opcionValida) {
			vista.mostrarInformacion("cambiar nombre?" + "\n1: si" + "\n2: no");
			opcion = vista.leerDatoEntero("");

			switch (opcion) {
			case 1:
				documento.cambiarNombreDocumento(vista.leerString("nuevo nombre del documento:"));
				vista.mostrarInformacion("..........DOCUMENTO FINAL..........");
				opcionValida = true;
				break;
			case 2:
				vista.mostrarInformacion("..........DOCUMENTO FINAL..........");
				opcionValida = true;
				break;
			default:
				System.out.println("Opción no válida, por favor intenta de nuevo.");
				break;
			}
		}
		vista.mostrarInformacion(documento.describir());
	}
}
