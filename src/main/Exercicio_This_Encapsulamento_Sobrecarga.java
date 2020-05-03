package main;

import java.util.Scanner;

import entidades.ContaBanco;

public class Exercicio_This_Encapsulamento_Sobrecarga {

	public static void main(String[] args) {
		
		int numero; String nome; double saldo = 0; char resp;
		
		ContaBanco conta;
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Digite o número da conta bancária: ");
		numero = entrada.nextInt();
		
		System.out.print("Digite o nome do Titular: ");
		entrada.nextLine();
		nome = entrada.nextLine();
		
		System.out.print("Deseja entrar com um valor inical para a conta? S/N");
		resp = entrada.next().charAt(0);
		
		if(resp == 'S') 
		{
			System.out.print("Digite o valor do depósito: ");
			saldo = entrada.nextDouble();
			
			conta = new ContaBanco(numero, nome, saldo);
		}
		else 
		{
			conta = new ContaBanco(numero, nome);
		}
		
		System.out.println("---------------------------------------------");
		System.out.println(conta.toString());
		System.out.println("---------------------------------------------");
		
		System.out.print("Digite o valor de saque: R$");
		saldo = entrada.nextDouble();
		
		conta.Saque(saldo);
		
		System.out.println("---------------------------------------------");
		System.out.println("Atualização...");
		System.out.println(conta.toString());
		System.out.println("---------------------------------------------");
		
		entrada.close();
	}

}
