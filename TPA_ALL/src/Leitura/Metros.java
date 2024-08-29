package Leitura;
import java.util.Scanner;

public class Metros {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double metros, quilometros;
		System.out.println("Digite o número de metros: ");
		metros = ler.nextDouble();
		
		quilometros = metros / 1000;
		
		System.out.print("Existem " + quilometros + " quilômetros em " + metros + " metros");
		
		
		
		
		
		
		
		ler.close();
	}

}
