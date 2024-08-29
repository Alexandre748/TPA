package Leitura;
import java.util.Scanner;

public class IPVA {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double precoVeiculo, ipva, novoPrecoVeiculo;
		ipva = 4;
				
		System.out.println("Digite o preço do veículo: ");
		precoVeiculo = ler.nextDouble();
		
		novoPrecoVeiculo = precoVeiculo * (1 + ipva/100);
		
		System.out.print("O preço do veículo após o IPVA é: " + novoPrecoVeiculo);
		
		
		
		
		
		
		ler.close();
	}

}
