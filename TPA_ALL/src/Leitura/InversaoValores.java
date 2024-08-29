package Leitura;
import java.util.Scanner;

public class InversaoValores {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor A");
		a = ler.nextInt();
		
		System.out.println("Digite o valor B");
		b = ler.nextInt();
		
		c = b;
		b = a;
		a = c;
		
		System.out.println("Os valores invertidos são: A: " + a + " B: " + b);
		ler.close();
	}

}
