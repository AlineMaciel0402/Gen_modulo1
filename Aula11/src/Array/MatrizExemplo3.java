package Array;

import java.util.Scanner;

public class MatrizExemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrizInteiros [] [] = new int [3] [3];
		Scanner leia = new Scanner (System.in);
		

		for (int linha = 0; linha <3; linha++) {
			for (int coluna = 0; coluna <3; coluna++) {
				System.out.println("Digite um valor para a posição [ " + linha + " ] [" + coluna + "]: ");
				matrizInteiros [linha][coluna] = leia.nextInt();
		}
		}

				for (int linha = 0; linha <3; linha++) {
					for (int coluna = 0; coluna <3; coluna++) {
						System.out.println("Digite um valor para a posição [ " + linha + " ] [" + coluna + "]: ");
						matrizInteiros [linha][coluna] = leia.nextInt();
				
		}

	}

}
}
