package tema2;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = JOptionPane.showInputDialog("Introduce un n�mero: ");
		int a = Integer.parseInt(str);
		
		if ((a & 1) == 1) {
			System.out.println("El n�mero es impar ");
		
		}else {
			System.out.println("El n�mero es par");
		}

	}

}
