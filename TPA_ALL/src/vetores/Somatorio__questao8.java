package vetores;
import java.util.Scanner;
public class Somatorio__questao8 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		// Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo e 
		//tamanho, sendo que cada elemento de B deverá ser o seguinte somatório: 
		//Bi = Somatório de Aj, para todo j variando de i até 10.
		
		int i, max = 10, j,soma = 0;
		
		int[] a = new int[max], b = new int[max];
		
		for(i = 0; i < max; i = i + 1) {
			System.out.println("Digite um elemento");
			a[i] = ler.nextInt();
		}
		
		for(i = 0; i < max; i = i + 1) {
			soma = 0;
			for(j = i; j < max; j = j + 1) {
				soma = soma + a[j];
				b[i] = soma;
				if(j == max - 1) {
				System.out.println(b[i]);
				break;
				}
			}
			
		}
	

		 
	}

}
