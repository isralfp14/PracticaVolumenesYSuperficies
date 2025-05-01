package clases;

public class Cilindro {
	int radio;
	int altura;
	final double pi;
	
	public Cilindro(int r, int alt) {
		this.radio = r;
		this.altura = alt;
		this.pi = Math.PI; 
	}
	
	public Cilindro() {
		this.radio = 1;
		this.altura = 1;
		this.pi = Math.PI; 
	}
	
	/**
	 * Calcula la superficie del cilindro
	 * @return superficie calculada
	 * */
	
	public int superficie() {
		int sup = 0;
		sup =  (int) (2* pi* Math.pow(radio, 2)) +  (int) (2 *pi* this.radio * this.altura);
		return sup;
	}
	
	/**
	 * Calcula el volumen del cilindro
	 * @return volumen calculado
	 * */
	
	public int volumen() {
		int area = (int) (pi* Math.pow(radio, 2));
		return area * this.altura;
	}
	
	
}