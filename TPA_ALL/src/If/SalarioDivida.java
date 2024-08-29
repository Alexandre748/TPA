package If;
import java.util.Scanner;
public class SalarioDivida {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double salario,totalDividas,dinheiroFinal;
		
		System.out.println("Digite seu salario");
		
		salario=ler.nextDouble();
		
		System.out.println("Digite sua dívida");
		
		totalDividas=ler.nextDouble();
		
		dinheiroFinal= salario - totalDividas;
		
		System.out.println();
		
		if(dinheiroFinal >0) {
			System.out.println("Você conseguiu pagar suas dívidas e sobraram " +dinheiroFinal+ " reais");
			
		}else if(dinheiroFinal <0) {
			System.out.println("Você não conseguiu pagar todas as suas dpividas, seu salário acabou e você continua devendo " +dinheiroFinal );
			
		}
		if(dinheiroFinal ==0) {	
			System.out.println("Você conseguiu pagar todas as suas dívidas mas seu salário acabou");
			
			
		}
		
		ler.close();
	}
	
	
}
