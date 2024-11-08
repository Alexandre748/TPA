package vetores;
import java.util.Scanner;
public class RelacaoPares_questao4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int i, max = 10, somador;
		int[] valor = new int[max];
	
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o elemento/valor");
			valor[i] = ler.nextInt();
		}
		
		for(i = 0; i < max; i = i + 1) {
			System.out.print("Os números pares de 0 até " + valor[i] + " são: ");
			for(somador = 0; somador <= valor[i]; somador = somador + 2) {
				 System.out.print(somador + ", " );
			}
			 System.out.println( );
		}
		
		
		
	}
}


