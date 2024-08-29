package If;
import java.util.Scanner;

public class MediaExame {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
	    double  nota1, nota2, nota3, media, notaExame, mediaExame;
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		nota3 = ler.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Sua média de notas é: " + media);
		
		if (media < 3) {
			System.out.println("Reprovado");
		}
		else if (media >= 6) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Você terá de fazer um exame.");
			
			System.out.println("Digite a nota do exame");
			
			notaExame = ler.nextDouble();
			
			mediaExame = (media + notaExame) / 2;
			
			System.out.println("Sua média após o exame é: " + mediaExame);
			
			if (mediaExame >= 6) {
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado");
			}
			
			
		}
		ler.close();
		
	}

}
