package while_3;
import java.util.Scanner;
public class media {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int intervaloInicial, intervaloFinal, intervaloFinal1, soma;
		double media;
	
		
		System.out.println("Digite o intervalo incial");
		
		intervaloInicial = ler.nextInt();
		
		
		System.out.println("Digite o intervalo final");
		
		intervaloFinal = ler.nextInt();
		intervaloFinal1 = intervaloFinal;
		
		
		soma = 1;
		
			while(intervaloInicial <= intervaloFinal) {
				
				soma = intervaloFinal + soma;
				
				intervaloFinal--;
				
				
			}
			
			media = soma / (intervaloInicial + intervaloFinal1 - 1 );
			System.out.println(media);
		
		
		
		
	}

}
