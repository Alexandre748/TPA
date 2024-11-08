package vetores;
import java.util.Scanner;
public class VetoresComRegras_questao14 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);
		
		int i = 0, max = 10;
		int[] a = new int[max], b = new int[max], c = new int[max]; 
		
	
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o " +(i + 1) + "º" + " elemento/valor de A");
			a[i] = ler.nextInt();
		}
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o " +(i + 1) + "º" + " elemento/valor de B");
			b[i] = ler.nextInt();
		}
		
		System.out.print("Os elementos do vetor C são: [ ");
		
		for(i = 0; i < max; i = i + 1) {
			if(a[i] > b[i]) {
				c[i] = 1;
				System.out.print(+ c[i] + ", ");
			}
			if(a[i] == b[i]) {
				c[i] = 0;
				System.out.print(+ c[i] + ", ");
			}
			if(a[i] < b[i]) {
				c[i] = -1;
				System.out.print(+ c[i] + ", ");
			}
		}
		System.out.print("]");

	}
}

			