package atividade9;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		boolean par;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		
		if (numero /2 == 0) {
			System.out.printf("O número" +numero , "é positivo!");
		}else {
				System.out.printf("O número -" +numero , "é negativo!");
			}
			
		}

	}

