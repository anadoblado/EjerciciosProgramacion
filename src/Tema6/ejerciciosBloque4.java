package Tema6;

import javax.swing.JOptionPane;

public class ejerciciosBloque4 {
	
	private static void pedirNumPar() {
		String str = JOptionPane.showInputDialog("Introduce un n�mero par");
		float num = Float.parseFloat(str);
		
		try {
			
			System.out.println("El n�mero es :" + (num%2 == 0));
			if(!(num%2 == 0)) {
				throw new Exception();
			}
			
		} catch (Exception e) {
			System.out.println("El n�mero no es par");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
	}

	public static void main(String[] args) {
		pedirNumPar();

	}

}
