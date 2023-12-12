package aula01;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operadores matematicos
		
		int valor1 = 10;
		int valor2 = 5;
		
		int resultado = valor1 + valor2;
		System.out.println(resultado);
		
		resultado = valor1 - valor2;
		System.out.println(resultado);
		
		resultado = valor1 * valor2;
		System.out.println(resultado);
		
		resultado = valor1 / valor2;
		System.out.println(resultado);
		
		int numero1 = 9;
		int numero2 = 2;
		resultado = numero1%numero2;
		System.out.println(resultado);
		
		String nome = "Aline";
		String nomeCompleto = nome + " Maciel";
		System.out.println(nomeCompleto);	
		
		resultado = (numero1+numero2)*3;
		System.out.println(resultado);
		
		System.out.println("****************");
		System.out.println("Autoincremento");
		int x = 1;
		x++;
		System.out.println("Agora tem que ser 2: "+x);
		
		//System.out.println(x++);
		//System.out.println(x);
		//System.out.println(++x);
		System.out.println("****************");
		System.out.println("Decremento");
		int y = 5;
		System.out.println(--y);
		
		int n1 = 3;
		n1+=5;
		System.out.println(n1);
		
		String produto = "Mouse";
		produto += " gamer";
		System.out.println(produto);
		System.out.println("*********");
		
		int ano = 2023;
		ano /=2;
		System.out.println(ano);
		
		double preco = 1543;
		//resultado = preco/2;
		double resultado2 = preco/2;
		System.out.println(resultado2);
	}

}
