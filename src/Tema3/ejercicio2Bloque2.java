package Tema3;

import javax.swing.JOptionPane;

public class ejercicio2Bloque2 {

	public static void main(String[] args) {
		//Mayor y menor de una cantidad de n�meros dada por el usuario. 
		//El usuario introducir� una cantidad de n�meros, tras lo cual se le deben pedir tantos como este haya indicado. 
		//Al final se debe imprimir el mayor y el menor de todos los introducidos. 

		int numAPedir = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de n�meros con los que trabajar"));
		int mayor = 0, menor = 0;
		
		for (int i = 0; i < numAPedir; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
			
			if (i == 0) {
				mayor = num;
				menor = num;
			
			}
			else {
				if (num>mayor) {
					mayor = num;
				}
				if (num<menor) {
					menor = num;
				}
			}
			
		}
		
		System.out.println("El n�mero mayor es: " + mayor);
		System.out.println("El n�mero menor es: " + menor);
	}

}
