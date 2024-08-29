package Switch;
import java.util.Scanner;

public class Futebol {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade:");
		idade = ler.nextInt();
		
		switch(idade) {
			case 6:
				System.out.println("Dente de Leite");
				break;
			case 7:
				System.out.println("Júnior");
				break;
			case 8:
				System.out.println("Júnior Max");
				break;
			case 9:
				System.out.println("Jínior Master");
				break;
			case 10:
				System.out.println("Master");
				break;
			default:
				System.out.println("Idade inválida ou não admitida");
		}
		ler.close();
	}
}
