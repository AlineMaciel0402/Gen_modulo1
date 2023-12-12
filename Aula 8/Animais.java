package atividade9;

import java.util.Scanner;

public class Animais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palavra1, palavra2, palavra3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua primeira palavra:");
		palavra1 = leia.nextLine();
		
		System.out.println("Digite sua segunda palavra:");
		palavra2 = leia.nextLine();
		
		System.out.println("Digite sua terceira palavra:");
		palavra3 = leia.nextLine();

		if(palavra1.equals("vertebrado") ) {
			if(palavra2.equals("ave")) {
				if(palavra3.equals("carnivoro") ) {
					System.out.println("Águia");
					
				}else {
					System.out.println("Pomba");
				}
			}else {
				if(palavra3.equals("onivoro") ) {
					System.out.println("Homem");
				}else {
					System.out.println("Vaca");
				}
			}
		}else {
			if(palavra2.equals("inseto") ) {
				if(palavra3.equals("hematofago") ) {
					System.out.println("Pulga");
			}else {
				System.out.println("Lagarta");
			}
		} if(palavra2.equals("hematofago") ) {
			System.out.println("Sanguessuga");
		}else {
			System.out.println("Minhoca");
		}
		
			
	}
	}
}
 