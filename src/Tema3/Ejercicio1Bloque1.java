package Tema3;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque1 {

	public static void main(String[] args) {
		// sumar números
		
		int i;
		int suma = 0;
		

		for (i = 0; i < 4; i++) {
			String str = JOptionPane.showInputDialog("Intruduce un número");
			int numeros = Integer.parseInt(str);
			
			if (numeros > 10) {
				suma = suma + numeros;
				System.out.println(suma);
			}else {
				System.out.println("No hay suma");
			}
			
			
		}
	}

}
