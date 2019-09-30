package tema1;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		int var1 = Integer.parseInt(str);
		System.out.println("var1: " + var1);
		
		str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		int var2 = Integer.parseInt(str);
		System.out.println("var2: " + var2);
		
		int AUX; //Vamos a usar una variable auxiliar para poder permutar
	
		AUX = var1;
		var1 = var2;
		var2 = AUX;
		
	
		System.out.println("cambio valores:" + " var1= " + var1 + "," + "var2= " + var2 );
		

	}

}
