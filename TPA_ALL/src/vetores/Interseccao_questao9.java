package vetores;
import java.util.Scanner;
public class Interseccao_questao9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, max = 10, j;
		int[] a = new int[max], b = new int[max], c = new int[max];
		
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o elemento A");
			a[i] = ler.nextInt();
		}
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o elemento B");
			b[i] = ler.nextInt();
		}
		
		for(i = 0; i < max; i = i + 1) {
			for(j = 0; j < max; j = j + 1) {
				if(a[i] == b[j]) {
					c[i] = a[i];
					System.out.println("O elemento " + c[i] + " existe tanto no vetor " + " a[i] " + " na posição " + i + " quanto no vetor " + " b[j] " + " que está posição " + j ) ;
				}
			}
		}
		
		
		
	}
}
		
		


	
