package Tema5Bloque3;

public class Ejercicio4Bloque3 {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros 
		//al azar entre 0 y 1.000. Una vez que lo hayas conseguido debes realizar
		//implementar el algoritmo de ordenación llamado "Selección", con el objetivo
		//de ordenar el array completamente.

		int array[]=new int [10];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)Math.round(Math.random()*100);
			System.out.print(array[i]+" ");
		}
		
		System.out.println("");
		
		for (int i = 0; i < array.length-1; i++) {
			int menor=i;
			
			for (int j = i+1; j < array.length; j++) {
				if(array[j]<array[menor]) {
					menor=j;
					
				}
				
			}
			int aux=array[i];
			array[i]=array[menor];
			array[menor]=aux;
			
		}
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]+ " ");
			
		}
		
	}

}
