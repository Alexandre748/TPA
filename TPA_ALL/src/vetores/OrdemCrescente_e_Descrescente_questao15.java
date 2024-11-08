package vetores;
import java.util.Arrays;
import java.util.Scanner;
public class OrdemCrescente_e_Descrescente_questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int i, max = 10, j, menorCont = 0;
		int[] a = new int[max];
		int[] b = new int[max];
		int[] c = new int[max];
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o " +(i + 1) + "º" + " elemento/valor de A");
			a[i] = ler.nextInt();
		
		}
		
		System.out.println("A ordem crescente do vetor A é: ");
		
		for(i = 0; i < max; i = i + 1) {
			b[i] = a[i];
		}
		
		Arrays.sort(b); // Utilizei o método Arrays.sort(b) para ordenar em ordem Crescente
		
		for(i = 0; i < max; i = i + 1) {
			System.out.print(b[i] + ", ");
		}
		
		System.out.println();
		System.out.println("A ordem decrescente do vetor A é: ");
		
		for(i = 0; i < max; i = i + 1) {
			c[i] = b[i];
		}
		
		// A ordem Decrescente é apenas a ordem Crescente(b[i]) sendo mostrada de tráz para frente
		
		for(i = max - 1; i >= 0; i = i - 1) {
			System.out.print(c[i] + ", ");
		}
		
		}
		
}



