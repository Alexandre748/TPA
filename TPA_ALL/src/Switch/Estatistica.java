package Switch;
import java.util.Scanner;


public class Estatistica {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int quantTotal,alunosMB,alunosB,alunosR,alunosI;
		String nota;
		
		System.out.println("Digite a quantidade de alunos totais");
		
		quantTotal = ler.nextInt();
		
		System.out.println("Digite a quantidade de alunos que foram MB");
		
		alunosMB = ler.nextInt();
		
		System.out.println("Digite a quantidade de alunos que foram B");
		
		alunosB = ler.nextInt();
		
		System.out.println("Digite a quantidade de alunos que foram R");
		
		alunosR = ler.nextInt();
		
		System.out.println("Digite a quantidade de alunos que foram I");
		
		alunosI = ler.nextInt();
		
		System.out.println("Digite qual a nota desejada para saber a porcentagem em relação ao total de alunos (MB, B, R, I)");
		
		nota = ler.next();
		
		
		switch(nota) {
		
		
		case "MB":
		System.out.println("A porcentagem de alunos que tiraram MB é de" + (alunosMB * 100) / quantTotal);
		break;
		
		case "B":
		System.out.println("A porcentagem de alunos que tiraram B é de" + (alunosB * 100) / quantTotal);
		break;
		
		case "R":
		System.out.println("A porcentagem de alunos que tiraram R é de" + (alunosR * 100) / quantTotal);
		break;
		
		case "I":
		System.out.println("A porcentagem de alunos que tiraram R é de" + (alunosI * 100) / quantTotal);
		break;
		
		default:
		System.out.println("Inválido");
		}
		
		ler.close();
			
			
	}
}
