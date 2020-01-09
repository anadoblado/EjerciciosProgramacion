package examenC;

import examenA.UtilsArrays;

public class apartadoB {

	public static void main(String[] args) {
		/*Crea una clase con un método “main” que cree un array de 100 elementos. Los
elementos serán de tipo entero y deben corresponder con los números del 99 al 0, en ese orden.
Muestra el array.*/
		
		int array[]=new int[100];
		int aux=99;
		for (int i = 0; i < array.length; i++) {
			array[i]=i;
			
		}
		UtilsArrays.mostrarArray(array);
		
		for (int i = 0; i < array.length; i++) {
			array[i]=aux;
			aux--;
			
		}
		
		UtilsArrays.mostrarArray(array);

	}

}
