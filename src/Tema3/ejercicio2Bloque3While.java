package Tema3;

import javax.swing.JOptionPane;

public class ejercicio2Bloque3While {

	public static void main(String[] args) {
		//  Realiza un ejercicio igual al anterior, con la particularidad de imprimir la media al final del ejercicio, no la suma.
		
float suma = 0, num = -1, contador=-1;
		
		while (num !=0) {
			num = Float.parseFloat(JOptionPane.showInputDialog("Introduce números distintos de 0 con 0 salimos"));
			suma = suma + num; 
			contador = contador +1;
			
		}
		System.out.println("La media es: " + (suma/contador));

	}

}
