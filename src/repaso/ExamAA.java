package repaso;

import Tema5Bloque2.Utils;

public class ExamAA {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
		//Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos 
		//los números que aparecen en el array.

	
		int array[]=new int[10];
		int suma=0, media=0, mayor=0, menor=0;
		
		for (int i = 0; i < array.length; i++) {//recorro el array
			array[i]=Utils.obtenerNumeroAleatorio(0, 100);//damos valores al array
			
			
		}
		Utils.mostrarArray(array);//sacar array por pantalla
		
		//crear variable para la suma
		for (int i = 0; i < array.length; i++) {
			suma+=array[i];
			
		}
		System.out.println("");
		System.out.println("la suma es: "+suma);
		media=suma/array.length;
		System.out.println("la media es: "+ media);
		
		for (int i = 0; i < array.length; i++) {
			if(i==0) {
				menor=array[0];
			}
			if(menor>array[i]){
				menor=array[i];
			}
			
			if(mayor<array[i]) {
				mayor=array[i];
			}
			
		}
		System.out.println("el menor es: "+menor+" y "+"el mayor es: "+mayor);
		
		
		
	}
	
	
}
