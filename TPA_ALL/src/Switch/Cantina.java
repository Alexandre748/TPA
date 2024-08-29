package Switch;
import java.util.Scanner;

public class Cantina {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c;
		
		System.out.println("Digite o código do produto");
		c = ler.nextInt();
		
		switch(c) {
		
		case 1:
			System.out.println("O seu produto é o cachorro quente e o seu valor é de 8,00 reais");
			break;
		case 2:
			System.out.println("O seu produto é o Cheeseburger e o seu valor é de 12,00 reais");
			break;
		case 3:
			System.out.println("O seu produto é o X-Salada e o seu valor é de 15,00 reais");
			break;
		case 4:
			System.out.println("O seu produto é o Misto quente e o seu valor é de 11,00 reais");
			break;
		case 5:
			System.out.println("O seu produto é o Pão na Chapa e o seu valor é de 6,00 reais");
			break;
		default:
			System.out.println("Dado inválido");
		}
		ler.close();
	}
}