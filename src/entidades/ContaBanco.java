package entidades;

public class ContaBanco {

	private int conta;
	private String nome;
	private double saldo = 0;
	
	public ContaBanco() {
		
	}
	
	public ContaBanco(int conta, String nome, double valorInicial) {
		this.conta = conta;
		this.nome = nome;
		this.saldo = valorInicial;
	}
	
	public ContaBanco(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	public void Deposito(double valor) {
		this.saldo += valor;
	}
	
	public void Saque(double valor) {
		this.saldo -= (valor + 5);
	}
	
	public String toString() {
		return "Dados da conta: \n" +
				"Número: " + this.conta + 
				", Titular: " + this.nome +
				", Saldo: R$" + this.saldo;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorInicial() {
		return saldo;
	}

	public void setValorInicial(double valorInicial) {
		this.saldo = valorInicial;
	}
	
}
