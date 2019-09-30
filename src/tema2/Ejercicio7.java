package tema2;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = JOptionPane.showInputDialog("Introduce un número: ");
		int a = Integer.parseInt(str);
		
		if ((a & 1) == 1) {
			System.out.println("El número es impar ");
		
		}else {
			System.out.println("El número es par");
		}

	}

}
