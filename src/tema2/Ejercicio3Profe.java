package tema2;

import javax.swing.JOptionPane;

public class Ejercicio3Profe {

	public static void main(String[] args) {
		// Este es con la correcci�n del profesor, comparando por si los tres son iguales
		
		String str = JOptionPane.showInputDialog("Introduzca un numero: ");
		int a = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca otro numero: ");
		int b = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca otro numero m�s: ");
		int c = Integer.parseInt(str);
		
		int mayor; //una variable nueva que va a tomar el valor del mayor
		
		// Comparando por si los tres son iguales
		if (a == b && b == c) {
			
			System.out.println("Los tres n�meros son iguales");
		
		} else {
			if ((a > b) && (b > c)) {
				mayor = a;
			
			} else {
				if (b > c) {
				mayor = b;
					
				} else {
					
				mayor = c;
				}
				
				System.out.println("El n�mero mayor es: " + mayor );
				
			}
			
		}
	}
	
     

}
