package vetores;
import java.util.Scanner;
public class Pares_questao1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exemplo de como deve ser o vetor A [ 1 2 3 4 5 6 7 8 ]
		//exemplo de como deve ser o vetor B [ 2 4 6 8 1 3 5 7 ]
		
		Scanner ler = new Scanner(System.in);
		
		int i, maximo = 20;
		double[] a = new double[maximo], b = new double[maximo]; // b representa os números pares e o a os números impares//
		
		for(i = 0; i < maximo; i = i + 1) {
			System.out.println("Digite o elemento/valor");
			a[i] = ler.nextDouble();
			if(a[i] % 2 == 0) {
				b[i] = a[i];

			} else {
				a[i] = a[i];
				
			}
	
		}
		
		System.out.print(" Vetor A " + " [ ");
		
		for(i = 0; i < maximo; i = i + 1) {
			if(a[i] % 2 == 0) {
				b[i] = a[i];
				System.out.print(b[i]);
				System.out.print(" , ");
			}
			
			else if(a[i] % 2 != 0) {
				a[i] = a[i];
				System.out.print(+ a[i]);
				System.out.print(" , ");
			}

		}	
		
		System.out.print(" ] ");
		
		System.out.println("  ");
			
		System.out.print(" Vetor B " + " [ ");
		

		for(i = 0; i < maximo; i = i + 1) {
			if(a[i] % 2 == 0) {
				b[i] = a[i];
				System.out.print(b[i]);
				System.out.print(" , ");
				}	
			}
		
		for(i = 0; i < maximo; i = i + 1) {
			if(a[i] % 2 != 0) {
				a[i] = a[i];
				System.out.print(a[i]);
				System.out.print(" , ");
			}
		}
		
		System.out.print(" ] ");

		


	}
}

			
