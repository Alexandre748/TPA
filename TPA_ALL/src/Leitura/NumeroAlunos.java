package Leitura;
import java.util.Scanner;

public class NumeroAlunos {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double porMasculinos, porFemininas,alunosMasculinos, alunasFemininas, alunosTotais;
	    
		
		System.out.println("Digite o número de alunos masculinos: ");
		alunosMasculinos = ler.nextDouble();
		
		System.out.println("Digite o número de alunos femininos: ");
		alunasFemininas = ler.nextDouble();
		
		alunosTotais = alunosMasculinos + alunasFemininas;
		
		porMasculinos = (alunosMasculinos / alunosTotais) * 100;
		porFemininas = (alunasFemininas / alunosTotais) * 100;
		
		System.out.println("A sua sala é composta " + porMasculinos + "% de meninos, e " + porFemininas + "% de meninas");
		
		
		
		ler.close();
	}

}
