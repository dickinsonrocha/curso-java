package main;

import java.util.Scanner;

public class Exercicio_Matrizes {

	public static void main(String[] args) {
		
		int coluna, linha;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas: ");
		linha = entrada.nextInt();
		
		System.out.print("Digite a quantidade de colunas: ");
		coluna = entrada.nextInt();
		
		int [][] matriz = new int [linha][coluna];
		
		System.out.println();
		System.out.println("Preencha a matriz");
		
		for(int l = 0; l < linha; l++ ) 
		{
			for(int c = 0; c < coluna; c++) 
			{
				matriz[l][c] = entrada.nextInt();
			}
		}
		
		entrada.close();
		
		System.out.println("---------------------------------");
		
		System.out.println();
	}

}
