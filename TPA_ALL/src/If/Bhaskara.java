package If;
import java.util.Scanner;
public class Bhaskara {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, delta;
		
		System.out.println("Digite o valor A:");
				
		a = ler.nextInt();
		
		System.out.println("Digite o valor B:");
		
		b = ler.nextInt();
		
		System.out.println("Digite o valor C:");
		
		c = ler.nextInt();
		
		delta = (b * b) - 4 * a * c;
		
		if (delta == 0) {
			System.out.println("Uma raiz real");
		}
		else if (delta > 0){
			System.out.println("Duas raizes reais");
		}
		else {
			System.out.println("Nenhuma raiz real");
		}
		
		ler.close();
	}
}
