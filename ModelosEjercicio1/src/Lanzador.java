
public class Lanzador {

	public static void main(String[] args) {
		DeDosEnDos ob = new DeDosEnDos();
		for (int i = 0; i < 5; i++) {
			System.out.println("Siguiente valor es: " + ob.getSiguiente());
		}
		System.out.println("\nReiniciando");
		ob.reiniciar();
		for (int i = 0; i < 5; i++) {
			System.out.println("Siguiente valor es: " + ob.getSiguiente());
		}
		System.out.println("\nIniciando en 100");
		ob.setComenzar(100);
		for (int i = 0; i < 5; i++) {
			System.out.println("Siguiente valor es: " + ob.getSiguiente());
		}
	}

}
