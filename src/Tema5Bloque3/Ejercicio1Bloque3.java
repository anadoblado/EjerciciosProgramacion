package Tema5Bloque3;



public class Ejercicio1Bloque3 {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. 
		//Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Burbuja",
		//con el objetivo de ordenar el array completamente.
		
		int array[]=new int [5];
	
		//creo el array y lo saco por pantalla
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)Math.round(Math.random()*100);
			System.out.print(array[i]+" ");
		}
		
		System.out.println("");
		
		for (int i = 0; i < array.length; i++) {//recorro el array
			
			for (int j = 0; j < array.length-1; j++) {//hago los cambios
				if(array[j]>array[j+1]) {
					int aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
			}
			
		
				
		}
		
		
			
		}
		System.out.print("");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		

	}

}
