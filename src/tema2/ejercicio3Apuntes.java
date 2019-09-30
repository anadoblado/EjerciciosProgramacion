package tema2;

import javax.swing.JOptionPane;

public class ejercicio3Apuntes {

	public static void main(String[] args) {
		 // Vamos a sacar por pantalla el mayor de todos
		
		String str = JOptionPane.showInputDialog("Introduzca un número: ");
		int a = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un segundo número: ");
		int b = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un tercer número: ");
		int c = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un cuerto número: ");
		int d = Integer.parseInt (str);
		
		str = JOptionPane.showInputDialog("Introduzca un quinto número: ");
		int e = Integer.parseInt (str);
		
		
		
		if ((a > b ) && (a > c) && (a > d) && (a > e)) {
			System.out.println("El número mayor es: " + a);
			
		}
		 else{
			if ((b > c) && (b > d) && (b > e)) {
				
			System.out.println("El número mayor es: "+ b);
			}
			else {
				if ((c > d) && (c > e)) {
				System.out.println("El número mayor: " + c);}
				
				else {
					if (d > e) {System.out.println( "El numero mayor es : " + d);}
					
					else {System.out.println("El número mayor es: " + e);}
				}
				
			}
			
		}

	}



	}

