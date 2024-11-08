package vetores;
import java.util.Scanner;
public class Fatorial_questao7 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, max = 15;
		double i2;
		double[] a = new double[max], b = new double[max];
	
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite o valor");
			a[i] = ler.nextDouble();
			
		}
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println("O fatorial do elemento " + (i + 1) + " que corresponde ao número " + a[i] + " é = ");
			b[i] = a[i];
			for(i2 = (a[i] - 1); i2 >= 1 ; i2 = i2 - 1) {
				b[i] = b[i] * i2;
			}
			System.out.println(b[i]);
		}
		}
			
}
			


