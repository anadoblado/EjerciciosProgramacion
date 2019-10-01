package tema2;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// comprobar si es par o impar comparando usando &, commo los números binarios impares acaban en 1, "comparo" con ese
		
		String str = JOptionPane.showInputDialog("Introduce un número: ");
		int a = Integer.parseInt(str);
		
		if ((a & 1) == 1) {
			System.out.println("El número es impar ");
		
		}else {
			System.out.println("El número es par");
		}

	}

}
