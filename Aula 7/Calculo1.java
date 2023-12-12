package salario;

import java.util.Scanner;

public class Calculo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, resultado;
		
		System.out.println("Digite a primeira nota:");
		n1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		n3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota:");
		n4 = leia.nextFloat();
		
		resultado = (n1*n2) - (n3*n4);
		
	System.out.println("O resultado é: " +resultado);
	}

}
