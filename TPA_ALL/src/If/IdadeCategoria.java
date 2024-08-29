package If;
import java.util.Scanner;
public class IdadeCategoria {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int anoNasci, anoAtual, idade;
		
		System.out.println("Digite o seu ano de nascimento");
				
		anoNasci = ler.nextInt();
		
		System.out.println("Digite o ano atual");

		anoAtual = ler.nextInt();
		
		idade = anoAtual - anoNasci;
		
		System.out.println("a sua idade é " +idade);
		
		if(idade<10) {
			System.out.println("Criança");
			
		}
		else if(idade<18) {
			System.out.println("Adolescente");
		}
		else if(idade<60) {
			System.out.println("Adulto");
			
		}
		else {
			System.out.println("Idoso");
			
		}
			
	
		ler.close();
		
}
}
