import java.util.Scanner;
public class Ad {

	public static void main(String[] args) {
		int idade1 = 0, idadeVelho = 0, idadeNovo = 1000, faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0, i = 0;
		Scanner ler = new Scanner(System.in);
	
		while(i <= 15) {
			System.out.println("Digite sua idade");
			idade1 = ler.nextInt();
			
			if(idade1 <= 15) {
				faixa1++;
			}
			else if(idade1 <= 30) {
				faixa2++;
			}
			else if(idade1 <= 45) {
				faixa3++;
			}
			else if(idade1 <= 60) {
				faixa4++;
			}
			else {
				faixa5++;
			}
			
			
			if(idade1 > idadeVelho) {
				idadeVelho = idade1;
			}
			
			if(idade1 < idadeNovo) {
				idadeNovo = idade1;
			}
			
			i++;
;		}
		
		System.out.println("A idade do mais velho � " + idadeVelho);
		System.out.println("A idade do mais novo � " + idadeNovo);
		System.out.println();
		System.out.println("H� " + faixa1 + " pessoa(s) na primeira faxa et�ria");
		System.out.println("H� " + faixa2 + " pessoa(s) na segunda faxa et�ria");
		System.out.println("H� " + faixa3 + " pessoa(s) na terceira faxa et�ria");
		System.out.println("H� " + faixa4 + " pessoa(s) na quarta faxa et�ria");
		System.out.println("H� " + faixa5 + " pessoa(s) na quinta faxa et�ria");
		System.out.println();
		System.out.println("H� " + (faixa1 * 100) / i + "% de pessoas na primeira faxa et�ria");
		System.out.println("H� " + (faixa2 * 100) / i + "% de pessoas na segunda faxa et�ria");
		System.out.println("H� " + (faixa3 * 100) / i + "% de pessoas na terceira faxa et�ria");
		System.out.println("H� " + (faixa4 * 100) / i + "% de pessoas na quarta faxa et�ria");
		System.out.println("H� " + (faixa5 * 100) / i + "% de pessoas na quinta faxa et�ria");
		
	}

}