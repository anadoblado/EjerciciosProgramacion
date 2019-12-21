package examenC;

import examenA.UtilsArrays;

public class apartadoC {

	public static void main(String[] args) {
		/*Crea una clase con un método “main” que cree un array de 20 posiciones con
números enteros generados al azar entre 0 y 100. Muestra el array. Para cada número del array
debes mostrar en pantalla sus divisores.*/ 

		int array[]=UtilsArrays.creaArrayNumerosAzar(20, 0, 100);
		UtilsArrays.mostrarArray(array);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j <= array[i]; j++) {
				if(array[i]%j==0) {
					System.out.println("El número " + j + " es divisor de "+array[i]);
				}
				
			}
		}
	}

}
