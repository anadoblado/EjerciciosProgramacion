package tema2;

import javax.swing.JOptionPane;

public class ejercicio4Apuntes {

	public static void main(String[] args) {
		// Vamos a sacar por pantalla el menor de todos
		
		String str = JOptionPane.showInputDialog("Introduce un n�mero: ");
		int a = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un segundo n�mero: ");
		int b = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un tercer n�mero: ");
		int c = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un cuarto n�mero: ");
		int d = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un quinto n�mero: ");
		int e = Integer.parseInt(str);
		
		if ((a < b) && (a < c) && (a < d) && (a < e)) {
			System.out.println("El n�mero menor es: " + a);
		}else {
			if ((b < c) && (b < d) && (b < e)) {
				System.out.println("El n�mero menor es: " + b);
			}else {
				if ((c < d) && (c < e)) {
					System.out.println("El n�mero menor es: " + c);
				}else {
					if (d < e) {
						System.out.println("El n�mero menor es: " + d);
					}else {
						System.out.println("El n�mero menor es: " + e);
					}
				}
			}
		}

	}

}
