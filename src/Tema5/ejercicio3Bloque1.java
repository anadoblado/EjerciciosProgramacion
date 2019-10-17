package Tema5;

import javax.swing.JOptionPane;

public class ejercicio3Bloque1 {

	public static void main(String[] args) {
		/*Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		 * A continuaci�n pedir�s al usuario un valor y buscar�s dicho valor en el array.
		 *  Si lo encuentras, debes indicar al usuario la posici�n del array en que se encuenta.
		 *   En caso de que no encuentres el valor buscado, debes indic�rselo tambi�n al usuario.*/

		int numeros[] = new int[10];
		int pedirNumero=0,i=0, contadorApariciones=0;
		
		//inicializamos el array
		for(  i = 0; i<numeros.length; i++) {
			numeros[i]= (int)Math.round(Math.random()*100);
			
			
		}
		
		// vemos el array
		
		for ( i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
			
		}
		//linea en blanco para poner mejor a nivel visual
		System.out.println("");
		
		//pedir numero al usuario
		
		pedirNumero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para buscarlo en el array"));
		
		//boolean estaNumeroBuscadoEnArray = false;
		for( i= 0; i<numeros.length;i++){
			if (pedirNumero==numeros[i]) {
				System.out.println("Tu n�mero apararece en el array en la posici�n"+ (i+1));
				contadorApariciones++;
				//estaNumeroBuscadoEnArray = true;
			}
			//else {
				//System.out.println("Tu n�mero no aparace en el array");
			//}
		}
		/*Si el contador despu�s de recorrer el array est� a 0, singnifica que el n�mero no est� en el array*/
		if(contadorApariciones==0) {
			System.out.println("El n�mero " +pedirNumero+ " no est� en el array");
		}
		
		/*otra manera de hacerlo es con un bolean
		 * estaNumeroBuscadoEnArray = true; dentro del for
		 * if(!estaNumeroBuscadoEnArray){
		 * System.out.println("El n�mero " +pedirNumero+ " no est� en el array");} */
	}

}
