public class DeDosEnDos implements Series {
	private int numActual;

	public DeDosEnDos() {
		this.numActual = 0;
	}

	public int getSiguiente() {
		int valor = numActual;
		numActual += 2;
		valor = numActual;
		return valor;
	}

	public void reiniciar() {
		this.numActual = 0;
	}

	public void setComenzar(int x) {
		this.numActual = x;
	}
}
