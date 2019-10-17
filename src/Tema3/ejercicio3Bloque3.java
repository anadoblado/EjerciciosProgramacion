package Tema3;

import javax.swing.JOptionPane;

public class ejercicio3Bloque3 {

	public static void main(String[] args) {
		// Realiza un ejercicio que pida números al usuario hasta que este introduzca el 0 (cero).
		//Al finalizar el ejercicio se debe imprimir en pantalla el valor mayor introducido. 
		//El valor 0 (cero) no debe tenerse en cuenta.

		int mayor=0, numPedir=-1;
		for (int i=1; numPedir !=0 ;i++) {
			 numPedir = Integer.parseInt(JOptionPane.showInputDialog("Pedir número al usuario"));
			
			if (i == 1) {
				mayor = numPedir;
				
			
			}
			else {
				if (numPedir>mayor) {
					mayor = numPedir;
				}
		}
		}
		System.out.println("El número mayor es: " + mayor);
	}

}
