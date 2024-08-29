package If;
import java.util.Scanner;
public class IMC {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float altura, peso, imc;
		
		System.out.println("Digite o seu peso");
				
		peso = ler.nextFloat();
		
		System.out.println("Digite a sua altura");

		altura = ler.nextFloat() / 100;
		
		imc = peso / (altura * altura);
		
		System.out.println("O seu IMC é " + imc);
		
		if(imc < 18.5) {
			System.out.println("Excesso de Magreza");
			
		}
		else if(imc < 25) {
			System.out.println("Peso Normal");
		}
		else if(imc < 30) {
			System.out.println("Excesso de Peso");
			
		}
		else if(imc < 35) {
			System.out.println("Obesidade Grau 1");
			
		}
		else if(imc<40) {
			System.out.println("Obesidade Grau 2");
			
		}
		else {
			System.out.println("Obesidade Grau 3");
			
		}
			
	
		
		ler.close();
}
}
