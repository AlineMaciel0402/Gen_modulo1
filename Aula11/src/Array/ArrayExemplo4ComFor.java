package Array;

public class ArrayExemplo4ComFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String vetorString [] = {"Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi"};
		
		int vetorInteiros [] = {1, 2, 3, 4, 5};
		
		for(int indice = 0; indice <5; indice++) {
			System.out.println((indice + 1) + "º Elemento " + vetorString[indice]);
		}		
		for(int indice = 0; indice <5; indice++) {
				System.out.println((indice + 1) + "º Elemento " + vetorInteiros[indice]);
				
		}

	}

}
