package treinamentoLacoRepeticao;

import java.util.Scanner;

public class ForMultiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int n1, n2;
		
		System.out.println("Escola o primeiro número:");
		n1 = leia.nextInt();
		
		System.out.println("Escolha o segundo número:");
		n2 = leia.nextInt();
		
		if(n1 >= n2) {
		System.out.println("Intervalo inválido, o primeiro número deve ser maior que o primeiro!");
		}else {
		System.out.println("Múltiplos de 3 e 5 no intervalo de "+n1+" a "+n2+ ":");
		
		for (int a= n1; a<= n2; a++) {
			if(a %3 == 0 && a %5 == 0) {
				System.out.println(a+ " é multiplo de 3 e 5!");
				
				
				
			}
			
		}

		}
		
		
	}
		
	}

