package If;
import java.util.Scanner;

public class Bissexto {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int nascimento;
		
		System.out.println("Digite a data de nascimento");
		
		nascimento = ler.nextInt();
		
		if(nascimento %4 == 0) {
			System.out.println("O ano é bissexto");
			
		}
		
		else {
			System.out.println("O ano não é bissexto");
		}
			
				
		ler.close();
	}
}
