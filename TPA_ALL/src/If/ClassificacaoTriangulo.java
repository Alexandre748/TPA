package If;
import java.util.Scanner;
public class ClassificacaoTriangulo {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor do lado A");
				
		a = ler.nextInt();
		
		System.out.println("Digite o valor do lado B");
		
		b = ler.nextInt();
		
		System.out.println("Digite o valor do lado C");
		
		c = ler.nextInt();
		
		if (a > b + c || b > a + c || c > a + b) {
			System.out.println("Não é um triângulo válido");
		}
		
		
		if(a == b && b == c) {
			System.out.println("Triângulo Equilatero");
			
		}
		else if(a != b && b != c && a != c) {
			System.out.println("Triângulo Escaleno");
		}
		else {
			System.out.println("Triângulo Isosceles");
			
		}
		ler.close();
	}
}
