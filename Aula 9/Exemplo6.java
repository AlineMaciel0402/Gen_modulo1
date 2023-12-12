package turma70;

import java.util.Scanner;

public class Exemplo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### ##### Menu # ## ### #### #####");
		System.out.println("\n -- Digite 1 para ver indicação de livro--");
		System.out.println("--Digite 2 para ler uma frase motivacional--");
		System.out.println("--Digite 3 para receber uma indicação de música--");
		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1: 
			System.out.println("Livro: Jogos Vorazes");
		break;
		case 2:
			System.out.println("Frase motivacional: Tudo vai ficar bem. Já vencemos!");
		break;
		case 3:
			System.out.println("Música: Oi, balde!");
		break;
		
		
		
		}
		
		}

}
