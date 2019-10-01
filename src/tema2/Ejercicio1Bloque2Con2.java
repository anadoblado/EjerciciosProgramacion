package tema2;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque2Con2 {
	public static void main(String[] args) {
		// Dos números 	que encajan en alguna de las cuatro categorías

		String str = JOptionPane.showInputDialog("Introduce un número ");
		int a = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un segundo número ");
		int b = Integer.parseInt(str);
		
		int acNegativos = 0;
		int acBajos = 0;
		int acMedios = 0;
		int acAltos = 0;
		
		if ((a < 0)&&(b < 0)) {
			System.out.println("Hay " + (acNegativos + 2) + "números negativos");
		}else {
			if (((a >= 0) && (a < 25)) && (b < 0)) {
				System.out.println("Hay" + (acBajos + 1) + "números bajos y hay " + (acNegativos + 1) + " negativos" ); 
			}else {
				if ((a >= 25 && a < 250) && (b < 0)) {
					System.out.println("Hay" + (acMedios + 1) + "números medios y hay " + (acNegativos + 1) + " negativos");
				}else {
					if ((a>=250) && (b < 0)) {
						System.out.println("Hay" + (acAltos + 1) + "números altos y hay " + (acNegativos + 1) + " negativos");
					}else {
						if (((a >= 0) && (a < 25)) && ((b >= 0) && (b < 25))) {
							System.out.println("Hay " + (acBajos + 2) + "números medios");
						}else {
							if ((a>=250) && ((b >= 0) && (b < 25))) {
								System.out.println("Hay " + (acAltos + 1) + "números altos y hay " + (acBajos + 1) + "números medios");
							}else {
								if ((a >= 25 && a < 250) && (b >= 25 && b < 250)) {
									System.out.println("Hay " + (acAltos + 2) + "números altos");
								}
								
								
							}
							
						}
					}
				}
			}
		}
		
		
	}

}
