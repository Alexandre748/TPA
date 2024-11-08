package vetores;
import java.util.Scanner;
public class Divisores_questao5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int i, max = 10, divisor, inteiros;
		int[] valor = new int[max];
	
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o elemento/valor");
			valor[i] = ler.nextInt();
		}
		
		for(i = 0; i < max; i = i + 1) {
			System.out.print("Os divisores do número " + valor[i] + " são: ");
			for(inteiros = 1; inteiros <= valor[i]; inteiros = inteiros + 1) {
				if(valor[i] % inteiros == 0) {
					System.out.print(inteiros + ", " );
				
				}
			}
			 System.out.println( );
		}
		
		
		
	}
}


