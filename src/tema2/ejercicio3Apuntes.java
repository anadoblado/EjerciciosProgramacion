package tema2;

import javax.swing.JOptionPane;

public class ejercicio3Apuntes {

	public static void main(String[] args) {
		 // Vamos a sacar por pantalla el mayor de todos
		
		String str = JOptionPane.showInputDialog("Introduzca un n�mero: ");
		int a = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un segundo n�mero: ");
		int b = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un tercer n�mero: ");
		int c = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un cuerto n�mero: ");
		int d = Integer.parseInt (str);
		
		str = JOptionPane.showInputDialog("Introduzca un quinto n�mero: ");
		int e = Integer.parseInt (str);
		
		
		
		if ((a > b ) && (a > c) && (a > d) && (a > e)) {
			System.out.println("El n�mero mayor es: " + a);
			
		}
		 else{
			if ((b > c) && (b > d) && (b > e)) {
				
			System.out.println("El n�mero mayor es: "+ b);
			}
			else {
				if ((c > d) && (c > e)) {
				System.out.println("El n�mero mayor: " + c);}
				
				else {
					if (d > e) {System.out.println( "El numero mayor es : " + d);}
					
					else {System.out.println("El n�mero mayor es: " + e);}
				}
				
			}
			
		}

	}



	}

