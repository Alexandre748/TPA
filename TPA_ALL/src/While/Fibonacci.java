package while_3;
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int n,i,anterior,atual; 
	
	anterior = 0;
	atual = 1;
	i = 1;
	
	System.out.println("Digite o n�mero de vezes que ser� repetido a sequ�ncia de fibonacci");
	
	n = ler.nextInt();
	 
	while(i < n) {
		atual = atual + anterior;
		anterior = atual - anterior;
		
			System.out.println(anterior);
		
		i = i + 1;
	}

	}
	
	
	
}
