package tema1;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Corresponde al ejercicio 3 de los apuntes
		
		String str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		int a = Integer.parseInt(str);
		System.out.println("Número introducido: " + a);
		
		 str = JOptionPane.showInputDialog("Introduzca otro número float: ");
		float b = Float.parseFloat(str);
		System.out.println("Número introducido: " + b);
		
		 str = JOptionPane.showInputDialog("Introduzca otro número double: ");
		double c = Double.parseDouble(str);
		System.out.println("Número introducido: " + c);
		
		double suma = a + b + c ;
		System.out.println("La suma es:" + suma);

	}

}
