package vetores;
import java.util.Scanner;
public class Primos_questao3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int i, max = 10;
		int[] a = new int[max];
	
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o elemento/valor");
			a[i] = ler.nextInt();
		
		}
		
		
		for(i = 0; i < max; i = i + 1) {
			
			switch(a[i]) {
			case 2:
				System.out.println(" O elemento " + (i + 1) + ", cujo n�mero � " +a[i] + ", � primo ");
				break;
			case 5:
				System.out.println(" O elemento " + (i + 1) + ", cujo n�mero � " +a[i] + ", � primo ");
				break;
				default:
					
			if(a[i] % 2 == 0 && a[i] % 3 != 0 && a[i] % 5 == 0) {
				System.out.println(" O elemento " + (i + 1) + ", cujo n�mero � " +a[i] + ", � composto ");
			}
			
			else if(a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0 || a[i] == 3){
				System.out.println(" O elemento " + (i + 1) + ", cujo n�mero � " +a[i] + ", � primo ");
			}
			
			else if(a[i] % 2 != 0 && a[i] % 3 == 0 && a[i] % 5 == 0) {
				System.out.println(" O elemento " + (i + 1) + ", cujo n�mero � " +a[i] + ", � composto ");
			}
			
			else if( a[i] % 5 == 0 && a[i] % 2 != 0 && a[i] % 3 != 0 || a[i] % 3 == 0) {
				System.out.println(" O elemento " + (i + 1) + ", cujo n�mero � " +a[i] + ", � composto ");
			}
			
			
		
		}
		
		}
	}
}


