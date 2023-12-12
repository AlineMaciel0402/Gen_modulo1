package Array;

public class MatrizExemploForEach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alunes [] [] = {{"Larissa","Dani","Igor"}, {"Thaiana", "Tais", "Thayná"} , {"Nat", "Nathan", "Nathália"}};

		for (String [] linha : alunes ) {
			for (String alune: linha) {
				System.out.println(alune);
			}
			
		}
	}

}
