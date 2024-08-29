package Leitura;
import java.util.Scanner;

public class Salario {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double salario, novoSalario;

		System.out.println("Digite seu salário atual");
		salario = ler.nextDouble();		
		
		novoSalario = salario * 1.12;
		
		System.out.println("Seu novo salário é igual a: " + novoSalario);
		ler.close();
	}

}
