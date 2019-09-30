package tema2;

import javax.swing.JOptionPane;

public class ejercicio4Apuntes {

	public static void main(String[] args) {
		// Vamos a sacar por pantalla el menor de todos
		
		String str = JOptionPane.showInputDialog("Introduce un número: ");
		int a = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un segundo número: ");
		int b = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un tercer número: ");
		int c = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un cuarto número: ");
		int d = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un quinto número: ");
		int e = Integer.parseInt(str);
		
		if ((a < b) && (a < c) && (a < d) && (a < e)) {
			System.out.println("El número menor es: " + a);
		}else {
			if ((b < c) && (b < d) && (b < e)) {
				System.out.println("El número menor es: " + b);
			}else {
				if ((c < d) && (c < e)) {
					System.out.println("El número menor es: " + c);
				}else {
					if (d < e) {
						System.out.println("El número menor es: " + d);
					}else {
						System.out.println("El número menor es: " + e);
					}
				}
			}
		}

	}

}
