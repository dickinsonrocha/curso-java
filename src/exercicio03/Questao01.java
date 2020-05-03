package exercicio03;

import java.util.Scanner;

import entidades.Retangulo;

public class Questao01 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a largura do retângulo: ");
		retangulo.largura = entrada.nextDouble();
		
		System.out.println("Digite a altura do retângulo");
		retangulo.altura = entrada.nextDouble();
		
		System.out.println("Digite o número correspondente a ação a ser realizada: \n"
				+ "1 - Área \n"
				+ "2 - Perímetro \n"
				+ "3 - Diagonal");
		
		int op = entrada.nextInt();
		
		switch (op) {
		case 1:
			System.out.printf("área: %.2f%n", retangulo.area());
			break;
			
		case 2:
			System.out.printf("Perímetro: %.2f%n", retangulo.perimetro());
			break;
		
		case 3:
			System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());
			break;

		default:
			break;
		}
		
		entrada.close();
	}
}
