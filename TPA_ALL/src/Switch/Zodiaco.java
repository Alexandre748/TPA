package Switch;
import java.util.Scanner;

public class Zodiaco {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int m, d;
	
		System.out.println("Digite o mês do ano que nasceu");
		m = ler.nextInt();
		
		System.out.println("Digite o dia do mês que nasceu");
		d = ler.nextInt();
		
		switch(m) {
		// janeiro
		case 1: 
			if (d >= 21) {
				System.out.println("Aquário");
			} else {
				System.out.println("Capricórnio");
			}
			break;
		// fevereiro
		case 2:
			if (d >= 19) {
				System.out.println("Peixes");
			} else {
				System.out.println("Aquário");
			}
			break;
		// março
		case 3:
			if (d >= 21) {
				System.out.println("Áries");
			} else {
				System.out.println("Peixes");
			}
			break;
		// abril
		case 4:
			if (d >= 21) {
				System.out.println("Touro");
			} else {
				System.out.println("Áries");
			}
			break;
		// maio
		case 5:
			if (d >= 21) {
				System.out.println("Gêmeos");
			} else {
				System.out.println("Touro");
			}
			break;
		// junho
		case 6:
			if (d >= 21) {
				System.out.println("Câncer");
			} else {
				System.out.println("Gêmeos");
			}
			break;
		// julho
		case 7:
			if (d >= 23) {
				System.out.println("Leão");
			} else {
				System.out.println("Câncer");
			}
			break;
		// agosto
		case 8:
			if (d >= 23) {
				System.out.println("Virgem");
			} else {
				System.out.println("Leão");
			}
			break;
		// setembro
		case 9:
			if (d >= 23) {
				System.out.println("Libra");
			} else {
				System.out.println("Virgem");
			}
			break;
		// outubro
		case 10:
			if (d >= 23) {
				System.out.println("Escorpião");
			} else {
				System.out.println("Libra");
			}
			break;
		// novembro 
		case 11:
			if (d >= 22) {
				System.out.println("Sagitário");
			} else {
				System.out.println("Escorpião");
			}
			break;
		// dezembro
		case 12:
			if (d >= 22) {
				System.out.println("Capricórnio");
			} else {
				System.out.println("Sagitário");
			}
			break;
		default:
			System.out.println("Inválido");
		}
		ler.close();
	}
}