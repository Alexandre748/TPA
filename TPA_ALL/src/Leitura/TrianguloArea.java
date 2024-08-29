package Leitura;
import java.util.Scanner;
public class TrianguloArea {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.println("Digite a base do triângulo");
		base = ler.nextDouble();
		System.out.println("Digite a altura do triângulo");
		altura = ler.nextDouble();
		
		area = (base * altura)/2;
		
		System.out.println("A área do triângulo é " + area);
		
		ler.close();
	}

}
