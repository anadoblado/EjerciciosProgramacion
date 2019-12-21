package examenB;

import examenA.UtilsArrays;

public class apartadoE {

	public static void main(String[] args) {
		/*Crea una clase con un método “main” que cree un array con 100 elementos de
longitud. Los elementos deben ser valores enteros que coincidan con la serie de Fibonacci.
Recuerda que la serie comienza con los valores “1, 1, 2, 3, 5, 8, 13….”. Cada valor es la suma de
los dos anteriores. Para que te sea más sencillo puedes inicializar los dos primeros elementos al
valor “1” y comenzar el algoritmo de relleno de los valores a partir del tercer elemento. Muestra el
array.*/

		int array[]=new int[100];
		array[0]=1;
		array[1]=1;
		
		for (int i = 2; i < array.length; i++) {	
			array[i]=array[i-1]+array[i-2];
		}
		
		UtilsArrays.mostrarArray(array);
	}

}
