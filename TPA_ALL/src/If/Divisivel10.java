package If;
import java.util.Scanner;
public class Divisivel10{
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o numero");
		
		numero = ler.nextInt();
		
		if (numero %10 == 0) {
			System.out.println("O número é múltiplo de 10");
			
		}else {
			System.out.println("O número não é múltiplo de 10");
		}
		ler.close();
	}
}

