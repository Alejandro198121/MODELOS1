public class DeDosEnDos implements Series {
	private int numActual;

	// Constructor que inicia en un valor específico
	public DeDosEnDos(int inicio) {
		this.numActual = inicio;
	}

	// Constructor que inicia en 0
	public DeDosEnDos() {
		this(0); // Llama al otro constructor con inicio en 0
	}

	// Método que devuelve el siguiente número en la secuencia
	public int getSiguiente() {
		int valor = numActual;
		numActual += 2;
		return valor;
	}

	// Método para reiniciar la secuencia desde un nuevo valor inicial
	public void reiniciar() {
		this.numActual = 0;
	}

	public void setComenzar(int x) {
		this.numActual = x;
	}
}
