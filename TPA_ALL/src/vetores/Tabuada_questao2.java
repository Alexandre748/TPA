package vetores;
import java.util.Scanner;
public class Tabuada_questao2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int i, max = 5, i2;
		int[] a = new int[max];
	
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o elemento/valor");
			a[i] = ler.nextInt();
		
		}
		
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println(" A tabuada do elemento " + (i + 1) + " é = ");
			for(i2 = 0; i2 < 11; i2 = i2 + 1 ) {
				System.out.println(a[i] + "x" + i2 + "=" + a[i] * i2);
			}
			
		}
		
		
}
}

