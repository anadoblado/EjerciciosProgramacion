package Tema3;

import javax.swing.JOptionPane;

public class ejercicio1Bloque3While {

	public static void main(String[] args) {
		//  Realiza un ejercicio que pida n�meros al usuario. 
		//El programa debe detenerse cuando el usuario introduzca el n�mero 0 (cero), 
		//que no debe tenerse en cuenta para ninguna operaci�n aritm�tica, simplemente para salir de la aplicaci�n.
		//Cuando el programa haya terminado, se debe sacar en pantalla el valor de la suma de todos los n�meros.
		
	
		int suma = 0, num = -1;
		
		while (num !=0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce n�meros distintos de 0 con 0 salimos"));
			suma = suma + num; 
			
		}
		System.out.println("La suma es: " + suma);
				

	}

}
