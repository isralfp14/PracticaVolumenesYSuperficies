package clases;

public class Cubo {
	int lado;
	
	public Cubo(int lado) {
		this.lado = lado;
		if (this.lado <= 0) {
			try {
				this.lado = lado;
			}
			catch (IllegalArgumentException fallo) {
				System.out.println("Error. El lado debe ser mayor a 0");
			}
		}
	}
	
	public Cubo() {
		this.lado = 1;
	}
	
	/**
	 *Calcula la superficie de un cubo
	 * @return superficie calculada
	 * */
	public int superficie() {
		return (this.lado * this.lado) * 6;
	}
	
	/**
	 *Calcula el volumen de un cubo
	 * @return volumen calculado
	 * */
	
	public int volumen() {
		return (int) Math.pow(this.lado, 3);
	}
}