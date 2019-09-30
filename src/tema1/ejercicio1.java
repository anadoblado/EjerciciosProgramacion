package tema1;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
	
			String str = JOptionPane.showInputDialog("Introduzca un número entero: ");
			int a = Integer.parseInt(str);
			System.out.println("Número introducido: " + a);
			
			 str = JOptionPane.showInputDialog("Introduzca otro número float: ");
			float b = Float.parseFloat(str);
			System.out.println("Número introducido: " + b);
			
			 str = JOptionPane.showInputDialog("Introduzca otro número double: ");
			double c = Double.parseDouble(str);
			System.out.println("Número introducido: " + c);
			
			
			
			double media =  (a + b + c)/3;
			System.out.println("Media de los dos valores introducidos: " + media);
	  

	}

}
