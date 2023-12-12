package aula01;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variaveis no java
		/*byte n1;
		 * n1 = 5; */
		byte n1;
		n1 = 5;
		int valor1 = 553;
		System.out.println(n1);
		n1 = 6;
		System.out.println(n1);
		float altura = 1.71f; 
		long codProduto = 4587;
		Long codigo = (long) 457845121;
		char letra = 'a';
		int idade = 32;
		
		String nome = "Aline Maciel";
		
		System.out.println(nome+" tem "+ idade+ " anos");
		System.out.println(altura+ " altura");
		//print f formatando dado com casas decimais
		System.out.printf("\nA altura é: %.2f\n", altura);
		
		//entrada de dados via teclado
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome:\n");
		nome = leia.nextLine();
		System.out.println("O nome do usuário é: "+ nome);
	}

}
