package repaso;

import examenA.UtilsMatrices;

public class CambioColumnasMatriz {

	public static void main(String[] args) {
		// Intercambiar columnas de una matriz
		
		//creo una matriz de 3x3
		int matA[][]=new int [3][3];
		UtilsMatrices.crearMatrizNumerosAzar(matA, 0, 10);
		UtilsMatrices.imprimirMatriz(matA);
		System.out.println("");
		
		int array[]= new int [3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i]=matA[i][0];
				matA[i][0]=matA[i][2];
				matA[i][2]=array[i];
				
			}
			
		}
		UtilsMatrices.imprimirMatriz(matA);
		System.out.println("");

		//creo una matriz de 5x5
		int matB[][]=new int [5][5];
		UtilsMatrices.crearMatrizNumerosAzar(matB, 0, 10);
		UtilsMatrices.imprimirMatriz(matB);
		System.out.println("");
		
		//necesto dos arrays para usar como auxiliar de las columnas que cambio
		int array2[]=new int [5];
		int array3[]=new int [5];
		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB.length; j++) {
				array2[i]=matB[i][0]; //cambiio la primera con la última
				matB[i][0]=matB[i][4];
				matB[i][4]=array2[i];
				
				array3[i]=matB[i][1]; //cambio la segunda con la penúltima 
				matB[i][1]=matB[i][3];
				matB[i][3]=array3[i];
				
			}
			
		}
		UtilsMatrices.imprimirMatriz(matB);
	}

	

}
