package tema2;

import javax.swing.JOptionPane;

public class ejercico4Bloque2Beta {
	
	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduce el importe de la compra");
		int importe = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce la cantidad recibida ");
		int recibe = Integer.parseInt(str);
		
		int cambio = (recibe - importe);
		System.out.println("El cambió será: " + cambio);
		
		if (cambio >= 0) {
			
			System.out.println("Número de monedas de 100: " + "  "  + (cambio/100));
			System.out.println("Número de monedas de 50: " + "  " + (cambio%100)/50 );
			System.out.println("Número de monedas de 25: " + "  " +((cambio%100)%50)/25);
			System.out.println("Número de monedas de 5: " + "  " + (((cambio % 100)%50)%25)/5);
			System.out.println("Número de monedas de 1: " + "  " + ((((cambio % 100)%50)%25)%5)/1 );
			
			
			}
	}

}
