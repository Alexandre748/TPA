package Leitura;
import java.util.Scanner;

public class SomaQuadrados {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double numero1, numero2, numero3, quadrado1, quadrado2, quadrado3, somaquadrados;
		
		System.out.println("Digite o primeiro número");
		numero1 = ler.nextDouble();
		
		System.out.println("Digite o segundo número");
		numero2 = ler.nextDouble();
		
		System.out.println("Digite o terceiro número");
		numero3 = ler.nextDouble();
		
		quadrado1 = numero1 * numero1;
		quadrado2 = numero2 * numero2;
		quadrado3 = numero3 * numero3;
		
		somaquadrados = quadrado1 + quadrado2 + quadrado3;
		
		System.out.print("A soma dos três número digitados é: " + somaquadrados);
		
		
		
		
		
		
		
		ler.close();
	}

}
