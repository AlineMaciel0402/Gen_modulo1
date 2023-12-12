package salario;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		double salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		
		System.out.println("Digite salário bruto:");
		salarioBruto = leia.nextDouble();
		
		System.out.println("Digite adicional noturno:");
		adicionalNoturno = leia.nextDouble();
		
		System.out.println("Digite horas extras:");
		horasExtras = leia.nextDouble();
		
		System.out.println("Digite os descontos:");
		descontos = leia.nextDouble();
		
		salarioLiquido = (salarioBruto+adicionalNoturno)+ (horasExtras*5) -descontos;
		
		System.out.println("O seu salario é: "  + salarioLiquido);
		
		
		
	}

}