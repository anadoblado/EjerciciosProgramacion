package examenB;

import examenA.UtilsArrays;

public class apartadoD {

	public static void main(String[] args) {
		/*Crea una clase con un método “main” que cree un array de 100 elementos. Todos
	los elementos deben tener valor “0”. Al azar debes introducir 10 números “1” 
	en cualquier parte del array. Muestra el array.*/
		int array[]=new int[100];
		int mix[]=UtilsArrays.crearArrayNumerosAzarSinRepetir(10, 0, 99);
		int array3[]=new int[array.length];
		int i;
		
		for ( i = 0; i < array.length; i++) {
			array[i]=0;
			
		}
		
		
		for (int j = 0; j < array3.length; j++) {
			for(i = 0; i < mix.length; i++){
				if(j==mix[i]) {
					array3[j]=1;
				}
				else {
					array3[i]=0;
				}
			}
		}
		UtilsArrays.mostrarArray(array);
		System.out.println("");
		UtilsArrays.mostrarArray(mix);
		System.out.println("");
		UtilsArrays.mostrarArray(array3);

	}

}
