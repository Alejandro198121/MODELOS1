package controller;

import model.fabricaAbstracta.*;
import model.fabricaConcreta.*;
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
                    mostrarVehiculos(new FabricaDeLujo());
                    break;
                case 2:
                    mostrarVehiculos(new FabricaEconomica());
                    break;
                case 3:
                    vista.mostrarInformacion("Saliendo del programa...");
                    System.exit(0);
                default:
                    vista.mostrarInformacion("Opción inválida...");
            }
        } while (opcion != 3);
    }

    public void mostrarVehiculos(VehiculoFactory fabrica) {
        Vehiculo auto = fabrica.crearAuto();
        Vehiculo moto = fabrica.crearMoto();
        Vehiculo camion = fabrica.crearCamion();

        vista.mostrarInformacion(auto.mostrarDetalles());
        vista.mostrarInformacion(moto.mostrarDetalles());
        vista.mostrarInformacion(camion.mostrarDetalles());
    }

    public int menu() {
        String menu = "MENU DE OPCIONES\n"
                    + "1. Mostrar vehículos de lujo\n"
                    + "2. Mostrar vehículos económicos\n"
                    + "3. Salir\n"
                    + "Seleccione una opción...";
        return vista.leerDatoEntero(menu);
    }
}
