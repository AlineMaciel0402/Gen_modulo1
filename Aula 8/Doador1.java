package atividade9;

import java.util.Scanner;

public class Doador1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		nome = leia.nextLine();
		
		System.out.println("Digite a sua idade:");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação: (true/false?");
		primeiraDoacao = leia.nextBoolean();
				
		if(idade >=18 && idade <=60) {
			System.out.println(nome+ " você esta apto(a) para doar!");
			
		} else if (idade >=60 && idade <=69 && true) {
			System.out.println(nome+ " você não esta apto(a) para doar!");

		}else {
			System.out.println(nome+ " você não esta apto(a) para doar!");
			
			
		}
	}
}

		
		

