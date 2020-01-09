package repaso;


import javax.swing.JOptionPane;

import examenA.UtilsMatrices;

public class matricesMedina {

	public static void main(String[] args) {
		 int matriz[][]=new int[3][3];
		UtilsMatrices.crearMatrizNumerosAzar(matriz, 1, 9);
		
		UtilsMatrices.imprimirMatriz(matriz);
		
		
		System.out.println("");

		int num=Integer.parseInt(JOptionPane.showInputDialog("dime el numero de filas"));
		int matriz2[][]=new int[5][num];
		UtilsMatrices.crearMatrizNumerosAzar(matriz2, 1, 9);
		
		UtilsMatrices.imprimirMatriz(matriz2);
		System.out.println("");
		
		//le pido la dimensión al usuario
		int num2=Integer.parseInt(JOptionPane.showInputDialog("dime el numero de filas"));
		int matrizA[][]=new int [num2][num2];//declaro la matriz A
		int matrizB[][]=new int [num2][num2];//declaro la matriz B
		int matrizC[][]=new int [num2][num2];//declaro la matriz C
		
		UtilsMatrices.crearMatrizNumerosAzar(matrizA, 1, 20);//doy valores a la matrizA
		UtilsMatrices.crearMatrizNumerosAzar(matrizB, 0, 20);//doy valores a la matrizB
		
		UtilsMatrices.imprimirMatriz(matrizA);//saco por pantalla las matrices
		System.out.println("");
		UtilsMatrices.imprimirMatriz(matrizB);
		System.out.println("");
		for (int i = 0; i < matrizC.length; i++) {//recorro las filas de la matriz C y sus columnas
			for (int j = 0; j < matrizC.length; j++) {//para sumar matrizA y matrizB y así obtener matrizC
				matrizC[i][j]=matrizA[i][j]+matrizB[i][j];
				
			}
			
		}
		UtilsMatrices.imprimirMatriz(matrizC);
				
	}

}
