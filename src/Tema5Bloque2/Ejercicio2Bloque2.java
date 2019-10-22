package Tema5Bloque2;

public class Ejercicio2Bloque2 {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice dos arrays de 150 elementos enteros al azar entre 0 y 100. 
		//Debes crear un tercer array, compuesto de la siguiente forma: en los elementos de índice impar del tercer array 
		//debes copiar los elementos de índice impar del primer array; en los elementos de índice par del tercer array 
		//debes copiar los elementos de índice par del segundo array.
		
		int array1[] = new int[10];
		int array2[] = new int[10];
		int array3[] = new int[10];
		
		int limInf=0, limSup=100;
		for (int i = 0; i < array1.length; i++) {
			array1[i]= (int)Math.round(Math.random()*(limSup-limInf)+limInf);
				System.out.print(array1[i]+ "  ");
		}
				
			System.out.println(" ");
		for (int i = 0; i < array2.length; i++) {
				array2[i]= (int)Math.round(Math.random()*(limSup-limInf)+limInf);
				System.out.print(array2[i]+" ");
		}
									
		System.out.println("");
		
		for (int i = 0; i < array3.length; i++) {
			if(i%2==1) {
			array3[i]=array1[i];
			
		}
			if(i%2==0) {
				array3[i]=array2[i];
			}
			System.out.println(" ");
			System.out.print(array3[i]+ " ");
			}

		
		
	}
}
