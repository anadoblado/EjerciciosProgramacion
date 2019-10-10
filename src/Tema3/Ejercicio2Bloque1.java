package Tema3;

import javax.swing.JOptionPane;

public class Ejercicio2Bloque1 {
	
	public static void main(String[] args) {
		
		//pedir al usuario la cantidad de números
		
		String str = JOptionPane.showInputDialog("Introduce cantidad de números");
		int cantidad = Integer.parseInt(str);
		
		int  i;
		int suma = 0;
		
		for (i=0; i < cantidad; i++) {
			
		    str = JOptionPane.showInputDialog("Intruduce un número");
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
