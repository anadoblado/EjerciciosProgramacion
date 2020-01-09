package Tema5Bloque4;

public class Ejercicio4Bloque4 {

	public static void main(String[] args) {
		// Realiza un programa que cree un array bidimensional, una matriz, de 5 filas x 5 columnas. Una vez hecho el array, realiza estos pasos:
        //- Crea un método que rellena la matriz con valores creados al azar.
        //- Crea un método que imprima la matriz en pantalla.
       // - Crea un método que compruebe si la matriz es positiva. (Todos sus elementos mayores o iguales a cero)
        //- Crea un método que compruebe si la matriz es diagonal (Todos los elementos que no est´an en la diagonal principal son nulos).
        //- Crea un método que compruebe si la matriz es triangular superior. (Todos los elementos que están por debajo de la diagonal principal son nulos).
        //- Crea un método que compruebe si la matriz es dispersa. (Todos las filas y todas las columnas contienen al menos un elemento nulo)
        //- Crea un método que construya un array unidimensional con todos los elementos de la matriz.
        //- Crea un método que compruebe si la matriz es simétrica. (Los elementos de la matriz (i, j) y (j, i), si existen, son iguales).
        //- Crea un método que realice la matriz traspuesta de la que recibe.
        //- Crea un método que realice la matiz opuesta de la que recibe.
        //- Crea un método que pida al usuario un número de fila sobre la matriz. Debes crear una matriz igual a la original pero eliminando el número de fila que el usuario ha especificado.

		int matriz [][] = new int [5][5];
		int i, j = 0;
		
		//crear una matriz de números aleatorios
		for ( i = 0; i < matriz.length; i++) {
			for ( j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=(int) Math.round(Math.random()*20-10);
		
			}
			
		}
		
		//imprimir por pantalla la matriz
		for ( i = 0; i < matriz.length; i++) {
			for ( j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
				
			}
			System.out.println("");
			
		}
		
		
		//ver si la matriz es positiva
		boolean matrizPositiva=false;
		do {
			for ( i = 0; i < matriz.length; i++) {
				for ( j = 0; j < matriz[i].length; j++) {
				 if(matriz[i][j]>=0) {
					 matrizPositiva=true;
					 
				 }
				 else {
					 matrizPositiva=false;
					 break;
				 }
			
				}
				
			}
			
		}while(matrizPositiva==true && i!=matriz.length);
		if(matrizPositiva==false) {
			System.out.println("La matriz es negativa");
		}
		else System.out.println("La matriz es negativa");
		
		
		//crear matriz diagonal
		int matriz2 [][] = new int [][] {{1, 0, 0, 0, 0},
										 {0, 2, 0, 0, 0},
										 {0, 0, 3, 0, 0},
										 {0, 0, 0, 4, 0},
										 {0, 0, 0, 0, 5}};
		
		for ( i = 0; i < matriz2.length; i++) {
			for ( j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j]+"\t");
			}
			
		}
		// comprobar si la matriz es diagonal
		boolean matrizDiagonal=false;
		
			for (i = 0; i < matriz2.length; i++) {
				for ( j = 0; j < matriz2[i].length; j++) {
					if(matriz[i][j]!=0 && i==j) {
						matrizDiagonal=true;
					}
				}
			}
					
			if(matrizDiagonal==false) {
			System.out.println("La matriz no es diagonal");
			}
			 else System.out.println("La matriz es diagonal");
		
		
			
		//matriz triangular superior
		boolean matrizTriangular=false;
		
		// Compruebo si hay un elemento debajo de la diagonal principal
		// que sea distinto de 0. Todos los elementos de la diagonal
		// cumplen la condición i > j
		
		for (i = 0; i < matriz2.length; i++) {
			for ( j = 0; j < matriz2[i].length; j++) {
				if(matriz[i][j]==0 && i > j) {
					matrizTriangular=true;
				}
			}
		}
		
		if(matrizTriangular==true) {
			System.out.println("la matriz es triangular superior");
		}
		else {
			System.out.println("la matriz no es triangular superior");
		}
		
		
		// la matriz es dispersa (al menos tiene por fila o culumna un 0)
		boolean matrizDispersa=false;
		do {
			for ( i = 0; i < matriz.length; i++) {
				for ( j = 0; j < matriz[i].length; j++) {
				 if(matriz[i][j]==0) {
					 matrizDispersa=true;
					 
				 }
				 else {
					 matrizDispersa=false;
					 break;
				 }
			
				}
				
			}
			
		}while(matrizDispersa==true && i!=matriz.length);
		if(matrizDispersa==false) {
			System.out.println("La matriz es no es dispersa");
		}
		else System.out.println("La matriz es dispersa");

		
	}

}


	
