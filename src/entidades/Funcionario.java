package entidades;

public class Funcionario {

	public int id;
	public String nome;
	public double salarioBruto, imposto, percentual, salarioLiquido = 0.0;
	
	public Funcionario() {
		
	}
	
	public Funcionario(int id, String nome, double salarioBruto) {
		this.id = id;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
	}
	
	public String Imprimir() {
		return id + ", " + nome + ", " + salarioBruto;
	}
	
	public double aumento(double percentual) {
		return this.salarioBruto += ((this.salarioBruto * percentual) / 100);
	}
	
	/* ------------------------------------------------------------------------------- */

	public double aumentoSalarial() {
		salarioBruto += ((salarioBruto * percentual) / 100);
		return salarioBruto;
	}
	
	public void calculoLiquido() {
		salarioLiquido = salarioBruto - imposto;
	}
	
	public String toString() {
		return "Funcionário: " + nome
				+ "\nSalário Líquido: R$ " + salarioLiquido;
	}
	
	/* -------------------------------------------------------------------------------- */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
}
