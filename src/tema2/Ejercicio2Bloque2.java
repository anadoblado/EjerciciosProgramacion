package tema2;

import javax.swing.JOptionPane;

public class Ejercicio2Bloque2 {
	public static void main(String[] args) {
		
		int conBajos = 0;
		int conMedios = 0;
		int conAltos = 0;
		
		String str = JOptionPane.showInputDialog("Introduce un número ");
		int a = Integer.parseInt(str);
		System.out.println("Has introducido el número: " + a);
		
		if (a < 0) { // Si es negativo lo acumulo correctamente
			return ;
			
		}else {
			if (a < 25) {
				conBajos = conBajos + 1;
			}else {
				if (a < 250) {
					conMedios = conMedios + 1;
				}else {
					conAltos = conAltos + 1;
					
				}
			}
		}
		
	    str = JOptionPane.showInputDialog("Introduce un número ");
		int b = Integer.parseInt(str);
		System.out.println("Has introducido el número: " + b);
		
		if (b < 0) { // Si es negativo lo acumulo correctamente
			return ;
			
		}else {
			if (b < 25) {
				conBajos = conBajos + 1;
			}else {
				if (b < 250) {
					conMedios = conMedios + 1;
				}else {
					conAltos = conAltos + 1;
					
				}
			}
		}
		
		str = JOptionPane.showInputDialog("Introduce un número ");
		int c = Integer.parseInt(str);
		System.out.println("Has introducido el número: " + c);
		
		if (c < 0) { // Si es negativo lo acumulo correctamente
			return ;
			
		}else {
			if (c < 25) {
				conBajos = conBajos + 1;
			}else {
				if (c < 250) {
					conMedios = conMedios + 1;
				}else {
					conAltos = conAltos + 1;
					
				}
			}
		}
		
		str = JOptionPane.showInputDialog("Introduce un número ");
		int d = Integer.parseInt(str);
		System.out.println("Has introducido el número: " + d);
		
		if (d < 0) { // Si es negativo lo acumulo correctamente
			return ;
			
		}else {
			if (d < 25) {
				conBajos = conBajos + 1;
			}else {
				if (d < 250) {
					conMedios = conMedios + 1;
				}else {
					conAltos = conAltos + 1;
					
				}
			}
		}
		
		str = JOptionPane.showInputDialog("Introduce un número ");
		int e = Integer.parseInt(str);
		System.out.println("Has introducido el número: " + e);
		
		if (e < 0) { // Si es negativo lo acumulo correctamente
			return ;
			
		}else {
			if (e < 25) {
				conBajos = conBajos + 1;
			}else {
				if (e < 250) {
					conMedios = conMedios + 1;
				}else {
					conAltos = conAltos + 1;
					
				}
			}
		}
		// Finalmente presento los resultados al usuario
		System.out.println("Acumulador números bajos: " + conBajos);
		System.out.println("Acumulador números medios: " + conMedios);
		System.out.println("Acuulador números altos: " + conAltos);

	}

}
