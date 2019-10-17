package Tema3;

import javax.swing.JOptionPane;

public class ejercicio4Bloque3 {

	public static void main(String[] args) {
		// Realiza un ejercicio igual al anterior, con la particularidad 
		//de que debe imprimir en pantalla el menor, no el mayor

		
		int menor=0, numPedir=-1;
		for (int i=0; numPedir !=0 ;i++) {
			 numPedir = Integer.parseInt(JOptionPane.showInputDialog("Pedir número al usuario"));
			
			if (i == 1) {
				menor = numPedir;
				
			
			}
			else {
				if (numPedir<=menor && numPedir!=0) {
					menor = numPedir;
				}
		}
		}
		System.out.println("El número menor es: " + menor);
	}

}
