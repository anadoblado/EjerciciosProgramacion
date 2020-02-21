package Tema6.Bloque4;

import javax.swing.JOptionPane;

public class ejerciciosBloque4 {
	
	private static void pedirNumPar() throws NumImparException {
		String str = JOptionPane.showInputDialog("Introduce un n�mero par");
		float num = Float.parseFloat(str);

		// System.out.println("El n�mero es :" + (num%2 == 0));
		if (!(num % 2 == 0)) {
			throw new NumImparException("Era par membri");

		} else {
			System.out.println("El n�mero es par, perfecto!");
		}
			
	}

	public static void main(String[] args)  {
		try {
			pedirNumPar();
		} catch (NumImparException e) {
			System.out.println("El n�mero no es par");	
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}

	}

}
