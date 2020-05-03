package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;

public class Exercicio_Listas {
	
	public static void main (String[] args) {
		
		int id, quantidadeFuncionarios; String nome; double salarioBruto, percentual;
		
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		quantidadeFuncionarios = entrada.nextInt();
		System.out.println("");
		entrada.nextLine();	
		
		for(int i=1; i <= quantidadeFuncionarios; i++) {
			
			System.out.println("Cadastro: #" + i);
			
			System.out.print("Id: ");
			id = entrada.nextInt();
			entrada.nextLine();
			
			System.out.print("Nome: ");
			nome = entrada.nextLine();
			
			System.out.print("Salário: ");
			salarioBruto = entrada.nextDouble();
			System.out.println("");
			
			lista.add(new Funcionario(id, nome, salarioBruto));
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.print("Digite o Id do funcionário para o aumento salarial: ");
		int busca = entrada.nextInt();
		System.out.println("");
		
		Funcionario funcionario = lista.stream().filter(x -> x.id == busca).findFirst().orElse(null);
		
		if(funcionario != null) {
			System.out.print("Digite o percentual de aumento: ");
			percentual = entrada.nextDouble();
			
			funcionario.salarioBruto = funcionario.aumento(percentual);
		}
		else 
		{
			System.out.println("Funcionário não encontrado!");
		}
		
		System.out.println("");
		System.out.println("Lista de funcionários:");
		for (Funcionario func : lista) {
			System.out.println(func.Imprimir());
		}
		
		entrada.close();
	}

}
