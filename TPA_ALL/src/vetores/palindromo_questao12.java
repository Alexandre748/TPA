package vetores;
import java.util.Scanner;
public class palindromo_questao12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, max = 10, j = max;
		int[] a = new int[max];
		
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o elemento A");
			a[i] = ler.nextInt();
		}
		
		System.out.print("O vetor A ");

		for(i = 0; i < max; i = i + 1) {
			System.out.print(+ a[i]);
			if(a[i] == a[j - 1]) {
				j = j - 1;
				if(j == 0) {
					System.out.print(" é um palíndromo");
					break;
				}
			}
		}
		
		for(i = 0; i < max; i = i + 1) {
			if(a[i] != a[j - 1]) {
				System.out.print(" não é um palíndromo");
				break;
					
				}
			}
		}
		
		
		
		
		
		
}

		
		


	
