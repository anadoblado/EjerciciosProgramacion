package tema2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
			String str = JOptionPane.showInputDialog("Introduzca un numero:");
			int a = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduzca otro numero: ");
			int b = Integer.parseInt(str);
			
			if (a < b ) {
				System.out.println("El número menor es: " + a);
				
			}else{
				System.out.println("El número menor es: "+ b);
				
			}

		}

	}


