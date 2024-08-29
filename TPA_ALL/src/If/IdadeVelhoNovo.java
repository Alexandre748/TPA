package If;
import java.util.Scanner;
public class IdadeVelhoNovo {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade1, idade2, idade3, idade4, idade5;
		String nome1, nome2, nome3, nome4, nome5;
		
		System.out.println("Usuário 1, digite a sua idade");
				
		idade1 = ler.nextInt();
		ler.nextLine();
		
		System.out.println("Usuário 1, digite o seu nome");
		
		nome1 = ler.nextLine();
		
		
		
		System.out.println("Usuário 2, digite a sua idade");
		
		idade2 = ler.nextInt();
		ler.nextLine();
		
		System.out.println("Usuário 2, digite o seu nome");
		
		nome2 = ler.nextLine();
		
		
	
		System.out.println("Usuário 3, digite a sua idade");
		
		idade3 = ler.nextInt();
		ler.nextLine();
		
		System.out.println("Usuário 3, digite o seu nome");
		
		nome3 = ler.nextLine();
		

		
		System.out.println("Usuário 4, digite a sua idade");
		
		idade4 = ler.nextInt();
		ler.nextLine();
		
		System.out.println("Usuário 4, digite o seu nome");
		
		nome4 = ler.nextLine();
				
		
				
		System.out.println("Usuário 5, digite a sua idade");
		
		idade5 = ler.nextInt();
		ler.nextLine();
		
		System.out.println("Usuário 5, digite o seu nome");
		
		nome5 = ler.nextLine();
		
		
		if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4 && idade1 > idade5) {
			System.out.println("O Usuário 1: " + nome1 + ", é o mais velho com: " + idade1 + " anos.");
		}
		else if (idade2 > idade1 && idade2 > idade3 && idade2 > idade4 && idade2 > idade5) {
			System.out.println("O Usuário 2: " + nome2 + ", é o mais velho com: " + idade2 + " anos.");
		}
		else if (idade3 > idade2 && idade3 > idade1 && idade3 > idade4 && idade3 > idade5) {
			System.out.println("O Usuário 1: " + nome3 + ", é o mais velho com: " + idade3 + " anos.");
		}
		else if (idade4 > idade2 && idade4 > idade3 && idade4 > idade1 && idade4 > idade5) {
			System.out.println("O Usuário 1: " + nome4 + ", é o mais velho com: " + idade4 + " anos.");
		}
		else {
			System.out.println("O Usuário 5: " + nome5 + ", é o mais velho com: " + idade5 + " anos.");
		}
	
		ler.close();
		
}
}
