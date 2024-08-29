package If;
import java.util.Scanner;


public class Eleicao {
	public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 int anoEleicao,anoNascimento,idade, idadeEleicao, anosAteEleicao;
	 
	 
	 System.out.println("Digite o ano da póxima eleição");
	 anoEleicao = ler.nextInt();
	 
	 System.out.println("Digite seu ano de nascimento");
	 anoNascimento = ler.nextInt();
	 
	 anosAteEleicao = anoEleicao - 2024;
			 	 
	 idade = 2024 - anoNascimento;
	 
	 idadeEleicao = idade + anosAteEleicao;
	 System.out.println("Você terá " + idadeEleicao + " anos, quando a eleição ocorrer") ;
	 
	 if(idadeEleicao >=18) {
		 System.out.println("Quando a pr�xima eleição chegar, você será maior idade e poderá votar!");
	 
	}else {
		System.out.println("Voc� não poderá votar na próxima eleição");
	 }
	 ler.close();
	}
}

