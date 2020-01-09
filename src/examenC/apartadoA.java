package examenC;

import Tema5Bloque2.UtilsArrays;

public class apartadoA {

	public static void main(String[] args) {
		/* Crea una clase con un método “main” que cree un array con 100 elementos de
		longitud, los elementos deben ser números enteros al azar comprendidos entre 0 y 1000.
		Muestra el array en pantalla. Calcula la suma de todos los elementos, la media, el máximo y el
		mínimo.*/
		int  maximo=0, minimo=0;//declaro las variables suma, media, máximo y mínimo
		float media=0, suma=0;
		//declaro y genero el array
		int array[]=examenA.Utils.crearArrayNumerosAzar(100, 1000, 0);
			
		
		
		//mostrar array en pantalla
		UtilsArrays.mostrarArray(array);
		
		for (int i = 0; i < array.length; i++) {//recorro el array para sumar los elementos
			suma+=array[i];
			
		}
		System.out.println("");
		System.out.println("");
		System.out.println("la suma es: "+suma);
		
		media=suma/array.length;//calculo media
		System.out.println("");
		System.out.println("la media es: "+media);//imprime el valor de la media
		
		for (int i = 0; i < array.length; i++) {
			if(i==0) {
				minimo=array[i];
			}
			if(minimo>array[i]) {
				minimo=array[i];
			}
			if(maximo<array[i]) {
				maximo=array[i];
			}
			
		}
		
		System.out.println("");
		
		System.out.println("el mayor valor del array es: "+maximo+" y "+"el menor valor del array es: "+minimo);
		
		


	}

}
