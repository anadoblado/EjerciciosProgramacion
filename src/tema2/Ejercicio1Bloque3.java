package tema2;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque3 {

	public static void main(String[] args) {
		// pedir una opción de los distintos casos
		// realmente ESTE ES EL EJERCICIO 2
		
		String str= JOptionPane.showInputDialog("Intruduce el número 1 si quieres una raiz enésima, "
				+ "2 si quieres una potencia y 3 si quieres dividir, si quieres que explote elige otro");
		
		int caso = Integer.parseInt(str);
		
		switch (caso) {
		case 1:
			str = JOptionPane.showInputDialog("Introduce la base");
			float radicando = Float.parseFloat(str);
			
			str = JOptionPane.showInputDialog("Introduce cualquier índice");
			float indice = Float.parseFloat(str);
			
			System.out.println("La raiz enésima es: " + Math.pow(radicando, 1/indice));
			
			break;
		case 2:
			str = JOptionPane.showInputDialog("Introduce cualquier base");
			float base = Float.parseFloat(str);
			
			str = JOptionPane.showInputDialog("Introduce exponente");
			float exponente = Float.parseFloat(str);
			
			System.out.println("El valor de la potencia es: " + Math.pow(base, exponente));
			break;
			
		case 3:
			str = JOptionPane.showInputDialog("Introduce el dividendo");
			float dividendo = Float.parseFloat(str);
			
			str = JOptionPane.showInputDialog("Introduce el divisor");
			float divisor = Float.parseFloat(str);
			
			System.out.println("El resto de la división es: " + (dividendo % divisor));
			
			break;
			
		default:
			System.out.println("No doy para mas");
		}
		
		
		
		

	}

}
