package If;

import java.util.Scanner;
public class INSS{
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double salario, salarioLiquido, imposto;
		
		System.out.println("Digite o sálario");
		
		salario = ler.nextDouble();
		
		
		if (salario >= 2500) {
					imposto = salario * (0.11);
					salarioLiquido = salario - imposto;
					System.out.println(salarioLiquido);
		}
		else {
				imposto = salario * (0.09);
				salarioLiquido = salario - imposto;
				System.out.println(salarioLiquido);
	}
		ler.close();
	}
}