package examenB;

import examenA.UtilsArrays;

public class apartadoA {

	public static void main(String[] args) {
		/*Crea una clase con un método “main” que cree un array con 100 elementos de
	longitud, los elementos deben ser números enteros al azar comprendidos entre 0 y 1000.
	Muestra el array en pantalla. Calcula la suma de todos los elementos, la media, el máximo y el
	mínimo.*/

		int array[]=UtilsArrays.creaArrayNumerosAzar(100, 0, 1000);//declaro y creo el array
		UtilsArrays.mostrarArray(array);//lo saco por pantalla
		float suma=0, media=0;//declaro e inizializo para luego usarlas
		int maximo=0, minimo=0;
		
		for (int i = 0; i < array.length; i++) {//recorro el array para sumar sus números
			suma+=array[i];
			i++;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("La suma es: " + suma);//muestro la suma
		System.out.println("");
		
		media=suma/array.length;
		System.out.println("la media es: "+ media);
		
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
		System.out.println("El mínimo valor del array es: "+minimo);
		System.out.println("");
		System.out.println("El máximo valor del array es: "+maximo);
	}

}
