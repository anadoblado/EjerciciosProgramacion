package tema2;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// comprobar si es par o impar comparando usando &, commo los n�meros binarios impares acaban en 1, "comparo" con ese
		
		String str = JOptionPane.showInputDialog("Introduce un n�mero: ");
		int a = Integer.parseInt(str);
		
		if ((a & 1) == 1) {
			System.out.println("El n�mero es impar ");
		
		}else {
			System.out.println("El n�mero es par");
		}

	}

}
