package Tema5Bloque4;

public class Ejercicio1Bloque4 {

	public static void main(String[] args) {
		// Crea un m�todo que reciba un array de n�meros enteros creados al azar entre 0 y 100. 
		//El m�todo debe examinar la longitud del array, comprobar que la longitud es un valor impar y
		//devolver el valor que se encuentre en la posici�n media. En caso de que la longitud del array 
		//sea un n�mero par no se debe devolver un valor -1.
		
		int longitud=(int) Math.round(Math.random()*100);
		System.out.println("La longitud del array es de: " + longitud);
		int array[]=new int[longitud];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=(int) Math.round(Math.random()*100);
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		if(longitud % 2 != 0) {
			System.out.println("El valor del �ndece de la mitad del array es: " + array[longitud/2]);
			
		}
		else {
			System.out.println("La longitud del array es par");
		}
	}

}
