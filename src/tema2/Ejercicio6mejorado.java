package tema2;

import javax.swing.JOptionPane;

public class Ejercicio6mejorado {

	public static void main(String[] args) {
		// Con el operador de modulo, que calcula el resto
		
		String str = JOptionPane.showInputDialog("Introduce un n�mero: ");
		int a = Integer.parseInt(str);
		
		if (a % 2 == 1) {
			
			System.out.println("El n�mero es impar");
		}else {
			System.out.println("El n�mero es par");
		}

	}

}
