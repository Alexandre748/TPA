package If;
import java.util.Scanner;
public class Combustivel {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double capacidade, distancia, gastomedio;
		
		System.out.println("Digite a capacidade em litros");
				
		capacidade = ler.nextDouble();
		
		System.out.println("Digite a distância percorrida em quilômetros");

		distancia = ler.nextDouble();
		
		gastomedio = distancia / capacidade;
		
		System.out.println("O gasto médio é de:  " + gastomedio);
		
		if(gastomedio < 10) {
			System.out.println("Não econômico");
			
		}
		else {
			System.out.println("Econômico");
		}
		ler.close();
	}
}
