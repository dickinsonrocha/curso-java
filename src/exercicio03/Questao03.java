package exercicio03;

import java.util.Scanner;

import entidades.Aluno;

public class Questao03 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = dados.nextLine();
		
		System.out.print("Digite a nota total do primemiro Trimestre: ");
		aluno.notaTrimestre1 = dados.nextDouble();
		
		System.out.print("Digite a nota total do segundo Trimestre: ");
		aluno.notaTrimestre2 = dados.nextDouble();
		
		System.out.print("Digite a nota total do terceiro Trimestre: ");
		aluno.notaTrimestre3 = dados.nextDouble();
		
		dados.close();
		
		System.out.println("");
		System.out.println(aluno.toString());
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("");
		
		System.out.println(aluno.resultado());
	}
}
