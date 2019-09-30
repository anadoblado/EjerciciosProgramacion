package tema2;

import javax.swing.JOptionPane;

public class ejercicio6Apuntes {

	public static void main(String[] args) {
		// Ver si el número es par o impar
		
		String str = JOptionPane.showInputDialog("Introduce un número: ");
		int a = Integer.parseInt(str);
		

		
		int c = a/2;
		int resto = a - 2*c;
		
		if (resto == 1) {
			System.out.println("El número es impar");
		}else {
			System.out.println("El número es par ");
		}

	}

}
