package Leitura;
import java.util.Scanner;

public class DescontoProduto {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
	    double precoProduto, desconto, precoFinal;
		
		System.out.println("Digite o preço do produto: ");
		precoProduto = ler.nextDouble();
		
		System.out.println("Digite o desconto aplicado sobre o produto: ");
		desconto = ler.nextDouble();
		
		precoFinal = precoProduto * (1 - (desconto/100));
		
		
		System.out.println("O preço final será de " + precoFinal);
		
		ler.close();
	}

}
