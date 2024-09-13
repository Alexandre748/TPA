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
		
		System.out.println("A idade do mais velho é " + idadeVelho);
		System.out.println("A idade do mais novo é " + idadeNovo);
		System.out.println();
		System.out.println("Há " + faixa1 + " pessoa(s) na primeira faxa etária");
		System.out.println("Há " + faixa2 + " pessoa(s) na segunda faxa etária");
		System.out.println("Há " + faixa3 + " pessoa(s) na terceira faxa etária");
		System.out.println("Há " + faixa4 + " pessoa(s) na quarta faxa etária");
		System.out.println("Há " + faixa5 + " pessoa(s) na quinta faxa etária");
		System.out.println();
		System.out.println("Há " + (faixa1 * 100) / i + "% de pessoas na primeira faxa etária");
		System.out.println("Há " + (faixa2 * 100) / i + "% de pessoas na segunda faxa etária");
		System.out.println("Há " + (faixa3 * 100) / i + "% de pessoas na terceira faxa etária");
		System.out.println("Há " + (faixa4 * 100) / i + "% de pessoas na quarta faxa etária");
		System.out.println("Há " + (faixa5 * 100) / i + "% de pessoas na quinta faxa etária");
		
	}

}