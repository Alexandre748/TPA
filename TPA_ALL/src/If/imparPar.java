package If;
import java.util.Scanner;


public class imparPar {
	public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 
	 double numero;
	 
	 System.out.println("Digite o n�mero: ");
	 numero = ler.nextDouble();
	 if (numero % 2 <= 0) {
		 System.out.println("Par");
		 
	 }
	 else {
		 System.out.println("�mpar");
	 }
			 
	 
	 ler.close();
	}
}

