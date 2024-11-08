package vetores;
import java.util.Scanner;
public class MecanismoDeBusca_questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int i, max = 10, elementoX, j;
		int[] a = new int[max];
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite um elemento");
			a[i] = ler.nextInt();
		}
		
		System.out.println("Digite o elemento que deseja encontrar");
		elementoX = ler.nextInt();
		
		
		for(i = 0; i < max; i = i + 1) {
			if(elementoX == a[i]) {
				System.out.println("O número " + elementoX + " foi encontrado" + " na posição " + (i + 1));
			}
			else {
				System.out.println("O número " + elementoX + " não foi encontrado na posição " + i);
			}
			
		}
		
	}
}
		
			 
				
			
		
		
		
	


