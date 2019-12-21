package Tema5Bloque4;

public class EjercicioNacho {

	public static void main(String[] args) {
		int matriz [][]=new int [10][10];
		int cont = 1;
		int matrizB [][]=new int [3][3];
		int i = 0, j = 0;
		
		for ( i = 0; i < matriz.length; i++) {
			for ( j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=cont;
				cont++;
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		for ( i = 0; i < matrizB.length; i++) {
			for (j = 0; j < matrizB[i].length; j++) {
				matrizB[i][j]=matriz[i][j]+(matriz[i+1][j+1])/(matrizB[i].length+matrizB[j].length);
			
			}
			
		}
		System.out.println("");
		System.out.println(matriz[i][j]);

	}

}
