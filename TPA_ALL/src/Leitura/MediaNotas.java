package Leitura;
import java.util.Scanner;
public class MediaNotas {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
				double n1, n2, media;
		System.out.println("Digite a primeira nota");
		n1 = ler.nextDouble();
		System.out.println("Digite a segunda nota");
		n2 = ler.nextDouble();
		
		media = (n1+n2)/2;
		
		System.out.println("A média entre as duas notas é igual a " + media);
		
		ler.close();
	}

}
