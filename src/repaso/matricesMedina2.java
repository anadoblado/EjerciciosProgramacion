package repaso;

import examenA.UtilsMatrices;

public class matricesMedina2 {

	public static void main(String[] args) {
		//creo la matriz y la saco por pantalla
		int matrizA[][]=new int[4][4];
		UtilsMatrices.crearMatrizNumerosAzar(matrizA, 1, 20);
		UtilsMatrices.imprimirMatriz(matrizA);
		
		int sumaColumna1=0;//creo la variable que contendrá el valor de la suma
		int sumaFila2=0;//creo la variable que contendrá la suma de sus valores
		
		for (int i = 0; i < matrizA.length; i++) {//recorro el array para coger y sumar los valores de la primera columna
				sumaColumna1+=matrizA[i][0];
								
		}
		System.out.println("");
		System.out.println("la suma de la columna 1 es: "+sumaColumna1);
		
		//recorro el array en los valores de las columnas, fijo la columna 2
		//que es el i=1
		for (int j = 0; j < matrizA.length; j++) {
			sumaFila2+=matrizA[1][j];
		}
		System.out.println("la suma de la fila 2 es: "+sumaFila2);
		
		int sumaDiagonal=0;
		//recorro el array para las filas y columnas
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				//pongo la condidición de que sean de la diagonal
				if(i==j) {
					sumaDiagonal+=matrizA[i][j];
				}
			}
			
		}
		System.out.println("la suma de la diagonal es: "+sumaDiagonal);

		int sumaDiagonalInversa=0;
		for (int i = 0, j=3; i < matrizA.length; i++, j--) {
			sumaDiagonalInversa+=matrizA[i][j];
			
		}
		System.out.println("la suma de la diagonal inversa es: "+sumaDiagonalInversa);
	}

}
