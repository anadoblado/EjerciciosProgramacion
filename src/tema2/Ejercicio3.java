package tema2;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca un numero:");
		int a = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca otro numero: ");
		int b = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca otro numero más: ");
		int c = Integer.parseInt(str);
		
		
		if ((a > b ) && (a > c)) {
			System.out.println("El número mayor es: " + a);
			
		}else{
			if (b > c) {
				
			System.out.println("El número mayor es: "+ b);
			}
			else {System.out.println("El número mayor: " + c);}
			
		}

	}

}
