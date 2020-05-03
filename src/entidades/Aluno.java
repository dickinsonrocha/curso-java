package entidades;

public class Aluno {
	public String nome;
	public double notaTrimestre1, notaTrimestre2, notaTrimestre3, notaAnual;

	public String resultado() {
		String resposta;
		notaAnual = notaTrimestre1 + notaTrimestre2 + notaTrimestre3;

		if (notaAnual / 100 >= 60) {
			resposta = "Nota final: " + notaAnual + "\nAluno aprovado!";
		} else {
			resposta = "Nota final: " + notaAnual + "\nAluno reprovado!";
		}
		return resposta;
	}

	public String toString() {
		return "Aluno: " + nome + "\nNota do 1º Trimestre: " + notaTrimestre1 + "\nNota do 2º Trimestre: "
				+ notaTrimestre2 + "\nNota do 3º Trimestre: " + notaTrimestre3;
	}

}
