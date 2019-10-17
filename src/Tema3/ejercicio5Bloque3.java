package Tema3;

import javax.swing.JOptionPane;

public class ejercicio5Bloque3 {

	public static void main(String[] args) {
		// Realiza un ejercicio parecido a los dos anteriores, 
		//dónde se imprima el mayor valor y el menor de todos los introducidos.
		
		
		int mayor=0, numPedir=-1, menor=0;
		for (int i=1; numPedir !=0 ;i++) {
			 numPedir = Integer.parseInt(JOptionPane.showInputDialog("Pedir número al usuario"));
			
			if (i == 1) {
				mayor = numPedir;
				menor = numPedir;
				
			
			}
			else {
				if (numPedir>mayor) {
					mayor = numPedir;
					
				}
				if (numPedir<=menor && numPedir!=0 ) {
					menor = numPedir;
				}
		}
		}
		System.out.println("El número menor es: " + menor);
		System.out.println("El número mayor es: " + mayor);

	}

}
