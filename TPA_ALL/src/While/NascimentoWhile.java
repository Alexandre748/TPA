package While;
import java.util.Scanner;
public class NascimentoWhile {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int an, aa, idade, i;
		
		i = 0;
		
		System.out.println("Digite o ano atual");
		
		aa = ler.nextInt();
		
	
		while(i <= 6) {
			System.out.println("Digite o seu ano de nascimento");
			an = ler.nextInt();
			idade = aa - an;
			if(idade >= 18) {
				System.out.println("Maior de idade");
			}
			else {
				System.out.println("Menor de idade");
			
			}
			i = i + 1;
		}
		
		ler.close();
	}
}

