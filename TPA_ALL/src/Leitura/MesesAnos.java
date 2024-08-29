package Leitura;
import java.util.Scanner;
public class MesesAnos {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int dia;
		float mes, ano;
		
		System.out.println("Digite a quantidade de dias: ");
		dia = ler.nextInt();
		mes = dia / 30;
		ano = dia / 365;
		
		System.out.println("Em " + dia + " dias, existem " + mes + " meses, e " + ano + " anos.");
				
		
		
		ler.close();
	}
 
}
