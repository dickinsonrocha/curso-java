package entidades;

public class Retangulo {

public double largura, altura = 0.0;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	public double diagonal() {
		return Math.sqrt(largura * largura + altura * altura);

	}
	
	public String toString() {
		return "largura: " + largura
				+ "\n altura: " + altura;
	}
}
