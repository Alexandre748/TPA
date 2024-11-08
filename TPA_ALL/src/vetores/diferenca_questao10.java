package vetores;
import java.util.Scanner;
public class diferenca_questao10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, max = 10, j, diferentes = 0;
		int[] a = new int[max], 
			  b = new int[max],
			  c = new int[max], //diferentes
			  d = new int[max]; //iguais
		
		
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o elemento A");
			a[i] = ler.nextInt();
		}
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o elemento B");
			b[i] = ler.nextInt();
		}
		

		
		for(i = 0; i < max; i = i + 1) {
			diferentes = 0;
			for(j = 0; j < max; j = j + 1) {
				if(a[i] == b[j]) {
					diferentes = diferentes + 1;
					d[i] = a[i];
					if(d[i] == max) {
						System.out.println("Não há nenhuma diferença de um conjunto para o outro");
					}
				}
				
			}
			if(diferentes == 0) {
				c[i] = a[i];
				System.out.println("O número " + c[i] + " existe no vetor a, na posição " + i + " porém não existe no vetor b ");
			}
			
		}
		}
	}

		

		
		
	
