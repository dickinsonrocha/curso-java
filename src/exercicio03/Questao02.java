package exercicio03;

import java.util.Scanner;

import entidades.Funcionario;

public class Questao02 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.print("Digite o nome do funcionário: ");
		funcionario.nome = entrada.nextLine();

		System.out.print("Digite o salário bruto: R$");
		funcionario.salarioBruto = entrada.nextDouble();

		System.out.print("Digite o valor de imposto: R$");
		funcionario.imposto = entrada.nextDouble();

		funcionario.calculoLiquido();
		
		System.out.println("");
		System.out.println(funcionario);
		
		System.out.println("");
		System.out.print("Digite o percentual de aumento salarial do funcion�rio: ");
		funcionario.percentual = entrada.nextDouble();
		
		funcionario.aumentoSalarial();
		funcionario.calculoLiquido();
		
		System.out.println("");
		System.out.println("Informações atualizadas: \n" + funcionario);
		
		entrada.close();
	}
}
