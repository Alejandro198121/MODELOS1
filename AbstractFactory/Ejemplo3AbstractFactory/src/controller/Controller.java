package controller;

import model.fabricaAbstracta.Animal;
import model.fabricaAbstracta.AnimalFactory;
import model.fabricaConcreta.FabricaAnimalesSalvajes;
import model.fabricaConcreta.FabricaAnimalesDomesticos;
import view.VistaConsola;

public class Controller {

    private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
        int opcion = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    mostrarAnimales(new FabricaAnimalesSalvajes());
                    break;
                case 2:
                    mostrarAnimales(new FabricaAnimalesDomesticos());
                    break;
                case 3:
                    vista.mostrarInformacion("Saliendo del programa...");
                    System.exit(0);
                default:
                    vista.mostrarInformacion("Opción inválida...");
            }
        } while (opcion != 3);
    }

    public void mostrarAnimales(AnimalFactory fabrica) {
        Animal mamifero = fabrica.crearMamifero();
        Animal ave = fabrica.crearAve();
        Animal reptil = fabrica.crearReptil();

        vista.mostrarInformacion(mamifero.emitirSonido());
        vista.mostrarInformacion(ave.emitirSonido());
        vista.mostrarInformacion(reptil.emitirSonido());
    }

    public int menu() {
        String menu = "MENU DE OPCIONES\n"
                    + "1. Mostrar animales salvajes\n"
                    + "2. Mostrar animales domésticos\n"
                    + "3. Salir\n"
                    + "Seleccione una opción...";
        return vista.leerDatoEntero(menu);
    }
}
