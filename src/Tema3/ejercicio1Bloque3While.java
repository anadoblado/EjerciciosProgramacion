package Tema3;

import javax.swing.JOptionPane;

public class ejercicio1Bloque3While {

	public static void main(String[] args) {
		//  Realiza un ejercicio que pida números al usuario. 
		//El programa debe detenerse cuando el usuario introduzca el número 0 (cero), 
		//que no debe tenerse en cuenta para ninguna operación aritmética, simplemente para salir de la aplicación.
		//Cuando el programa haya terminado, se debe sacar en pantalla el valor de la suma de todos los números.
		
	
		int suma = 0, num = -1;
		
		while (num !=0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce números distintos de 0 con 0 salimos"));
			suma = suma + num; 
			
		}
		System.out.println("La suma es: " + suma);
				

	}

}
