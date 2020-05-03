package main;

import java.util.Scanner;

import entidades.Pensionamento;

public class Exercicio_Vetores {
	
	public static void main (String args[]) {
		
		int quantidadeAlunos, numeroQuarto;
		Pensionamento[] vetor = new Pensionamento[10];
		String nome, email;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos irão alugar os quartos? ");
		quantidadeAlunos = entrada.nextInt();
		System.out.println("");
		entrada.nextLine();	
		
		for(int i = 1; i <= quantidadeAlunos; i++) {
			
			System.out.println("Cadastro: #" + i);
			
			System.out.print("Nome: ");
			nome = entrada.nextLine();
			
			System.out.print("Email: ");
			email = entrada.nextLine();
			
			System.out.print("Quarto: ");
			numeroQuarto = entrada.nextInt();
			entrada.nextLine();
			
			System.out.println("");
			
			vetor[numeroQuarto] = new Pensionamento(nome, email, numeroQuarto);
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Quartos ocupados:");
		for(int i=0; i < vetor.length; i++) {
			if(vetor[i] != null) {
				System.out.println(vetor[i].toString());
			}
		}
		
		entrada.close();
		
	}
}
