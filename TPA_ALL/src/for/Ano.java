import java.util.Scanner;
public class Ano {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int an, aa,i,id,idVelho, idNovo;
		
		idVelho = 0;
		
		idNovo = 1000;
		
		
		
		System.out.println("Digite o ano atual");
		
		aa = ler.nextInt();
		
		
		
		for(i = 0; i <=10; i = i + 1) {
			
			System.out.println("Digite o ano de nascimento");
			
			an = ler.nextInt();
			id = aa - an;
			
			System.out.println(id);
			
			if(id > idVelho) {
				idVelho = id;
			}
			if(id < idNovo) {
				idNovo = id;
			}
			
			
			
	
		}
		System.out.println(idVelho);
		System.out.println(idNovo);
	
		
		 
		
	}

}
