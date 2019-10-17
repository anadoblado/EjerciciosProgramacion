package Tema5;

public class ejercicio2Bloque1 {

	public static void main(String[] args) {
		/*Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar 
		 * entre 0 y 100. Después de su inicialización debéis imprimir el array en orden inverso.
		 * */
		int numeros[]=new int[150];int i;
		for ( i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random()*100);
			System.out.print(numeros[i]+" ");
		}
		System.out.println(" ");
		
		/*HACER EL RECORRIDO DEL ARRAY AL REVES
		 * for(int i=numeros.length-1; i >=0 ; i--)*/
		
		for( i = numeros.length-1; i>=0; i--) {
			
			System.out.print(numeros[i]+" ");
			
		}
	}

}
