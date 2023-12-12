package treinamentoBasico;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		double salario, abono, novoSalario;
		
		System.out.println("Digite o seu salário:");
		salario = leia.nextDouble();
		
		System.out.println("Digite o abono salarial:");
		abono = leia.nextDouble();
		
		novoSalario = salario+abono;
		
		System.out.println("O seu nome salário é: "+novoSalario);
		
		

	}

}
