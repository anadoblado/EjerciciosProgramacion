package Tema5;

public class ejercicio5Bloque1 {

	public static void main(String[] args) {
		// Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
		//Debes mostrar al usuario la suma de los elementos cuyo índice sea par.
		
		int array[] = new int[150];
		int sumaPar=0, numPares=0;
		for (int i = 0; i < array.length; i++) {
			array[i]= (int)Math.round(Math.random()*100);
			
			System.out.print(array[i]+ "  ");
			
		}
		for (int i = 0; i < array.length; i++) {
			if((i%2)==0) {
				numPares=array[i];
				sumaPar=sumaPar+numPares;
				
			}
			
		}
		System.out.println("");
		System.out.println("la suma es : " + sumaPar);

	}

}
