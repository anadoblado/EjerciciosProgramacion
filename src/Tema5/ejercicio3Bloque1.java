package Tema5;

import javax.swing.JOptionPane;

public class ejercicio3Bloque1 {

	public static void main(String[] args) {
		/*Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		 * A continuación pedirás al usuario un valor y buscarás dicho valor en el array.
		 *  Si lo encuentras, debes indicar al usuario la posición del array en que se encuenta.
		 *   En caso de que no encuentres el valor buscado, debes indicárselo también al usuario.*/

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
				System.out.println("Tu número apararece en el array en la posición"+ (i+1));
				contadorApariciones++;
				//estaNumeroBuscadoEnArray = true;
			}
			//else {
				//System.out.println("Tu número no aparace en el array");
			//}
		}
		/*Si el contador después de recorrer el array está a 0, singnifica que el número no está en el array*/
		if(contadorApariciones==0) {
			System.out.println("El número " +pedirNumero+ " no está en el array");
		}
		
		/*otra manera de hacerlo es con un bolean
		 * estaNumeroBuscadoEnArray = true; dentro del for
		 * if(!estaNumeroBuscadoEnArray){
		 * System.out.println("El número " +pedirNumero+ " no está en el array");} */
	}

}
