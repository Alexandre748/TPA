package While;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		int i, n;
		
		i = 1;
		
		System.out.println("Digite um número");
		
		n = ler.nextInt();
		
		while(i <= 10) {
			System.out.println(n + " x " + i + " = " + n * i);  
			i = i+1;
			
		}
			
		ler.close();
		
	}
}

