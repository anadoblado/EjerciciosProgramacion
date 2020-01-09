package Tema5Bloque3;

public class Ejercicio2Bloque3 {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos 
		//enteros al azar entre 0 y 1.000. Una vez que lo hayas conseguido 
		//debes realizar implementar el algoritmo de ordenación llamado 
		//"Inserción directa", con el objetivo de ordenar el array completamente.
		
		int array  []= new int [5];
		int j,i;
		for ( i = 0; i < array.length; i++) { // creo el array y lo saco por pantalla
			array[i] = (int)Math.round(Math.random()*100);
			System.out.print(array[i] + "   ");
				
		}
		for ( i = 0; i < array.length; i++) {//recorremos el array
			int menorque=array[i];
			for ( j = i;j>0 && array[j-1]>menorque; j--) {
				
				array[j]=array[j-1];
				
			
				
			}
		array[j]=menorque;
		
		
		}
		System.out.println();
		for (i = 0; i < array.length; i++) {
		System.out.print(array[i] + "   ");
		}
	}
}
			
