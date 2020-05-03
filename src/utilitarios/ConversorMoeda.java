package utilitarios;

public class ConversorMoeda {
	
	public static double cotacao = 3.10;
	
	public static double quantidade = 0;
	
	public static String conversor() {
		double valor = 0;
		valor = cotacao * quantidade;
		valor += valor * 6 /100;
		return "Serão necessários R$" + valor + " para a quantidade solicitada!";
	}
}
