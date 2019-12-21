package examenB;

import examenA.Utils;
import examenA.UtilsArrays;

public class apartadoC {

	public static void main(String[] args) {
		/*Crea una clase con un método “main” que cree rellene un array de 20 elementos de
		tipo entero. Cada elemento del array debe ser un número primo. Muestra el array*/

		
		int array[]=new int[20];
		boolean primo=true;
		int candidato;
		
		for (int i = 0; i < array.length; i++) {
			do {
				primo=true;
				candidato=Utils.numeroAleatorioSimple();
				for (int j = 2; j < candidato; j++) {
					if(candidato % j == 0) {
						primo=false;
				
					}
				
				}
				
			}
			while(!primo); 
				array[i]=candidato;
			
			
		}
		UtilsArrays.mostrarArray(array);
	}

}
