package main;

import java.util.Scanner;

import utilitarios.ConversorMoeda;

public class Exercicio_Statico {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual a cota��o do d�lar?");
		ConversorMoeda.cotacao = entrada.nextDouble();
		
		System.out.print("Quantos d�lares deseja? ");
		ConversorMoeda.quantidade = entrada.nextDouble();
		
		entrada.close();
		
		System.out.println(ConversorMoeda.conversor());
	}
}
