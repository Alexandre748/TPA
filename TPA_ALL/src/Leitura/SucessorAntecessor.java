package Leitura;
import java.util.Scanner;

public class SucessorAntecessor {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
        double numero, antecessor, sucessor;
        
        System.out.print("Digite o número que deseja ver o sucessor e antecessor: ");
        numero = ler.nextDouble();
        
        antecessor = numero - 1;
        sucessor = numero + 1;
        
        System.out.println("O antecessor de " + numero + " é: " + antecessor + ", e o seu sucessor é: " + sucessor + " .");
	
        ler.close();
	}

}
