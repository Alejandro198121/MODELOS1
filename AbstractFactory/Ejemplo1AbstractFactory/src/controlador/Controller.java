package controlador;

import modelo.Concreto.FabricaEjercitoElfo;
import modelo.Concreto.FabricaEjercitoHumano;
import modelo.Concreto.FabricaEjercitoOrco;
import modelo.fabricaAbstracta.Arquero;
import modelo.fabricaAbstracta.Mago;
import modelo.fabricaAbstracta.Soldado;
import vista.VistaConsola;

public class Controller {

	private VistaConsola vista;

	public Controller() {
		vista = new VistaConsola();
	}

	public void run() {
		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				crearEjercitoHumano();
				break;
			case 2:
				crearEjercitoOrco();
				break;
			case 3:
				crearEjercitoElfo();
				break;
			case 4:
				vista.mostrarInformacion("Cerrando Programa");
				System.exit(0);
			default:
				vista.mostrarInformacion(".....Opcion invalida....");
			}
			vista.mostrarInformacion("");
		} while (op != 4);
	}

	public int menu() {
		String menu = "MENU DE OPCIONES\n" + "1.   Crear ejercito humano. \n" + "2.   Crear ejercito Orco. \n"
				+ "3.   Crear ejercito Elfos. \n" + "4.   Cerrar programa. \n\n" + "Seleccion opcion...";
		return vista.leerDatoEntero(menu);
	}

	private void crearEjercitoHumano() {
		FabricaEjercitoHumano fabrica = new FabricaEjercitoHumano();
		Soldado soldado = fabrica.crearSoldado();
		Arquero arquero = fabrica.crearArquero();
		Mago mago = fabrica.crearMago();
		dibujarHumano();

		vista.mostrarInformacion("Ejército Humano creado:");
		soldado.atacar();
		arquero.disparar();
		mago.lanzarHechizo();
	}

	private void crearEjercitoOrco() {
		FabricaEjercitoOrco fabrica = new FabricaEjercitoOrco();
		Soldado soldado = fabrica.crearSoldado();
		Arquero arquero = fabrica.crearArquero();
		Mago mago = fabrica.crearMago();
		dibujarOrco();

		vista.mostrarInformacion("Ejército Orcos creado:");
		soldado.atacar();
		arquero.disparar();
		mago.lanzarHechizo();
	}

	private void crearEjercitoElfo() {
		FabricaEjercitoElfo fabrica = new FabricaEjercitoElfo();
		Soldado soldado = fabrica.crearSoldado();
		Arquero arquero = fabrica.crearArquero();
		Mago mago = fabrica.crearMago();
		dibujarElfo();

		vista.mostrarInformacion("Ejército Elfo creado:");
		soldado.atacar();
		arquero.disparar();
		mago.lanzarHechizo();
	}

	private void dibujarHumano() {
        vista.mostrarInformacion("   O  \n" +
                                 "  /|\\ \n" +
                                 "  / \\ \n");
    }

	private void dibujarOrco() {
		vista.mostrarInformacion("     ,     ,\n" +
                "    /(     )\\\n" +
                "   (  \\ _ /  )\n" +
                "   /'._/ \\_.'\\\n" +
                "  |  _     _  |\n" +
                "  | (o)   (o) |\n" +
                "  |    | |    |\n" +
                "   \\   ' '   /\n" +
                "    '-.___.-'\n");
}

	private void dibujarElfo() {
	    vista.mostrarInformacion("      /\\    \n" +
	                             "     /__\\   \n" +
	                             "    /____\\   \n" +
	                             "   | o  o |  \n" +
	                             "   |  ~~  |  \n" +
	                             "   |  --  |  \n" +
	                             "    \\____/   \n" +
	                             "    /\\  /\\  \n" +
	                             "   /__\\/__\\ \n");
	}

}
