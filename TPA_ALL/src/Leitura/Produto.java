package Leitura;
import java.util.Scanner;

public class Produto {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double precoProduto, precoFinal;
		
		
		System.out.println("Digite o preço do produto: ");
		precoProduto = ler.nextFloat();
		
		precoFinal = precoProduto * (1 - 0.05);
		
		System.out.println("O preço final do produto é de " + precoFinal + " reais.");
		
		
		ler.close();
	}

}
