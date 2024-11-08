package vetores;
import java.util.Scanner;
public class ParesDiferenciado_questao13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);
		
		int i = 0, max = 10;
		int[] a = new int[max], b = new int[max]; 
		
	
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o elemento/valor");
			a[i] = ler.nextInt();
		}
		
		if(i == max) {
			System.out.print("Os elementos do vetor B são: [ ");
		}
		
		for(i = 0; i < max; i = i + 1) {
			if(a[i] % 2 == 0) {
				b[i] = 1;
				System.out.print(+ b[i] + ", ");
			} else {
				b[i] = 0;
				System.out.print(+ b[i] + ", ");
			}
			
		}
		
		System.out.print("]");

	}
}

			
