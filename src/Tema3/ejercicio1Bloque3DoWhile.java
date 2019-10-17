package Tema3;

import javax.swing.JOptionPane;

public class ejercicio1Bloque3DoWhile {

	public static void main(String[] args) {
		//
		int suma = 0, num = -1;
		

		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce números distintos de 0 con 0 salimos"));
			suma = suma + num; 
			
		}while (num !=0);
		
		System.out.println("La suma es: " + suma);
				

	}

}
