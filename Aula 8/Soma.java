package atividade9;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner leia = new Scanner(System.in);
		int numero1, numero2, codigo;
		
		System.out.println("Digite um número:");
		numero1 = leia.nextInt();
		
		System.out.println("Digite outro número:");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o código da operação:");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("Operação: Soma");
			System.out.println("Resultado : " + (numero1+numero2));
			break;

		case 2:
			System.out.println("Operação: Subtração");
			System.out.println("Resultado : " + (numero1-numero2));
			break;
			
		case 3:
			System.out.println("Operação: Multiplicação");
			System.out.println("Resultado : " + (numero1*numero2));
			
		case 4:
			System.out.println("Operação: Divisão");
			System.out.println("Resultado : " + (numero1/numero2));
			break;	

		default:
			System.out.println("Opção inválida");
		}
	}
}



