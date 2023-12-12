package atividade9;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, soma;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		n1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota");
		n3 = leia.nextFloat();
		
		soma = n1+n2;
		
		if(soma >= n3) {
			System.out.println("A soma de A + B é maior do que C");
		}
		
		

	}

}
