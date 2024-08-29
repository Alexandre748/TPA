package Leitura;
import java.util.Scanner;

public class SalarioDependentes {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
	    double  salario, salarioFinal;
	    int dependentes;
	    
		
		System.out.println("Digite seu salário atual: ");
		salario = ler.nextDouble();
		
		System.out.println("Digite quantos dependentes você possui: ");
		dependentes = ler.nextInt();
		
		salarioFinal =  salario + (dependentes * 55);	
		
		System.out.println("Seu salário final é de " + salarioFinal + " reais.");
		
		ler.close();
	}

}
