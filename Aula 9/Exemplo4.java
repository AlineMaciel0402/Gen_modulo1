package turma70;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segundaa");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2) /2;
		
		if(media >= 6) {
			System.out.println("Parabéns, você foi aprovado!");
		}else {
			System.out.println("Infelizmente você foi reprovado!");
		}
		
		
		
	}
		
}	
		
		
