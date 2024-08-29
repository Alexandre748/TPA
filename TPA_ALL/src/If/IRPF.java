package If;
import java.util.Scanner;
public class IRPF {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double salario, irpf;
		
		System.out.println("Digite o seu salário");
				
		salario = ler.nextDouble();
		


		
		if(salario <= 1434.59) {
			irpf = 0;
			System.out.println("O desconto no seu salário será de " + irpf + " reais.");
		}
		else if(salario <= 2150) {
			irpf = (salario * 7.5/100) - 107.59;
			System.out.println("O desconto no seu salário será de " + irpf + " reais.");
		}
		else if(salario <= 2866.70) {
			irpf = (salario * 15/100) - 268.84;
			System.out.println("O desconto no seu salário será de " + irpf + " reais.");
		}
		else if(salario <= 3582) {
			irpf = (salario * 22.5/100) - 483.84;
			System.out.println("O desconto no seu salário será de " + irpf + " reais.");
		}
		else{
			irpf = (salario * 27.5/100) - 662.94;
			System.out.println("O desconto no seu salário será de " + irpf + " reais.");
		}
	
		
		ler.close();
	}
}
