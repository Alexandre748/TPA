package If;
import java.util.Scanner;
public class TresNumerosCrescente {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float a, b, c, menor, meio, maior;
		
		System.out.println("Digite o primero número");
				
		a = ler.nextFloat();
		
		System.out.println("Digite o segundo número");
		
		b = ler.nextFloat();
		
		System.out.println("Digite o terceiro número");
		
		c = ler.nextFloat();
		
		menor = 0;
		meio = 0;
		maior = 0;
		
        if (a >= b && c >= b) {
        	menor = b;
        	if (a >= c) {
        		maior = a;
        		meio = c;
        	}
        	else {
        		maior = c;
        		meio = a;
        	}
        }
        
        else if (b >= a && c >= a) {
        	menor = a;
        	if (b >= c) {
        		maior = b;
        		meio = c;
        	}
        	else {
        		maior = c;
        		meio = b;
        	}
        }
        
        else {
        	menor = c;
        	if (a >= b) {
        		maior = a;
        		meio = b;
        	}
        	else {
        		maior = b;
        		meio = a;
        	}
        }
        
		System.out.println(menor + ", " + meio + ", " + maior);
		
		ler.close();
	}
}
