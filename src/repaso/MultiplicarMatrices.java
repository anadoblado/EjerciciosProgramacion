package repaso;

import examenA.UtilsMatrices;

public class MultiplicarMatrices {

	public static void main(String[] args) {
		 int[][] matA= new int [4][3];
		UtilsMatrices.crearMatrizNumerosAzar(matA, 1, 9);
		UtilsMatrices.imprimirMatriz(matA);
		System.out.println("");
		
		int[][] matB=new int [3][4];
		UtilsMatrices.crearMatrizNumerosAzar(matB, 1, 9);
		UtilsMatrices.imprimirMatriz(matB);

		
		
	    int fil_mA = matA.length;
	    int col_mA = matA[0].length;
	     
	    int fil_mB = matB.length;
	    int col_mB = matB[0].length;
	    
	    int matC[][]=new int [col_mB][fil_mA];
	    
	    if (col_mA != fil_mB) {
	    	System.out.println("Las matrices no se pueden multiplicar");
	    	
	    }
		for (int i = 0; i < matC.length; i++) {
			for (int j = 0; j < matC[i].length; j++) {
				for (int k = 0; k < col_mA; k++) {
					matC[i][j] += matA[i][k]*matB[k][j];
					
				}
				
				
			}
			
		}
		System.out.println("");
		UtilsMatrices.imprimirMatriz(matC);
	}

}
