package Tema6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicioBloque2 {

	private static double x, x2, x3, y1, y2, y3;
	private static int contador = 1;
	
	/**
	 * Punto de corte de dos funciones
	 */
	private static void puntoDeCorte() {
		do {
			x += 0.001;
			y1 = (float) Math.sqrt(x);
			y2 = (float) (Math.log(x)*(-1));	
		} while (!(Math.abs(y1-y2)<0.001));
		System.out.println("x: " + x + " y1: " + y1 + " y2: " + y2);
	}
	
	/**
	 * Calcula Pi y lo compara con el el valor de Pi de la m�quina, para que tenga una precisi�n determinada
	 */
	private static void compararPi() {
		y1 = 0;
		x = 1;
		do {
			contador++;
			if( contador % 2 == 0) {
				y1+=4/x;
			}else {
				y1-=4/x;
			}
			x = x+2;
			System.out.println("x: " + x + " y1: " + y1);
		} while (!(Math.abs(Math.PI - y1) < 0.00001));
		//} while (true);
		System.out.println("La aproximaci�n de pi es: " + y1);
	}
	
	/**
	 * Calcula la hipotenusa de un tri�ngulo rect�ngulo
	 */
	private static void hipotenusa() {
		y1 = 4;
		y2 = 5;
		x = Math.hypot(y1, y2);
		System.out.println("La hipotenusa es: " + x);
	}
	
	/*
	 * Hallar los cinco primero m�ximos locales de la funci�n y=x*sen(x) con una precisi�n de 0.01.
	 */
	private static void cincoMaximosConSeno() {
		x2=0;
		x=0.01;
		x3=0.02;
		double a = 0, b, c;
		do {
			
			y2 = x2*Math.sin(x2);
			y1 = x*Math.sin(x);
			y3 = x3*Math.asin(x3);
			a = Math.max(y1, y2);
			b = Math.max(y1,y3);
					
			if(a == b) {
				System.out.println("Es m�ximo: " + a);
			contador++;
			}
			x += 0.01;
			x2 += 0.01;
			x3 += 0.01;
			
		} while (contador <= 5);
	}
	
	/**
	 * Calcula los 5 primeros m�ximos de la funci�n y=x*sin(x)
	 */
	private static void otroDelSeno() {
		x2=0;
		x=0.01;
		x3=0.02;
		do {
			if ( x*Math.sin(x) > x2*Math.sin(x2) && x*Math.sin(x) > x3*Math.sin(x3) ) {
				contador++;
				System.out.println("El valor " + x + " es un m�ximo");
				
			}
			x += 0.01;
			x2 += 0.01;
			x3 += 0.01;
		} while (contador <=5);
		
	}
	
	/*
	 * Realizar un programa que imprima una tabla con los l�mites m�ximo y m�nimo representables para los 
	 * diferentes tipos primitivos en Java (byte, int, short, long, float, double). En la tabla tambi�n 
	 * deber� aparecer el n�mero de bytes que cada tipo usa para su representaci�n
	 */
	/**
	 * Representa los valors m�ximos y m�nimos de cada tipo de dato primitivo
	 */
	private static void maxYMinRepresentable() {
		System.out.println("Valor m�ximo para un dato de tipo Byte: " + Byte.MAX_VALUE);
		System.out.println("Valor m�nimo para un dato de tipo Byte: " + Byte.MIN_VALUE);
		System.out.println("Cantidad de bits que usa un dato de tipo Byte: " + Byte.SIZE);
		System.out.println();
		
		System.out.println("Valor m�ximo para un dato de tipo Integer: " + Integer.MAX_VALUE);
		System.out.println("Valor m�nimo para un dato de tipo Integer: " + Integer.MIN_VALUE);
		System.out.println("Cantidad de bits que usa un dato de tipo Integer: " + Integer.SIZE);
		System.out.println();
		
		System.out.println("Valor m�ximo para un dato de tipo Short: " + Short.MAX_VALUE);
		System.out.println("Valor m�nimo para un dato de tipo Short: " + Short.MIN_VALUE);
		System.out.println("Cantidad de bits que usa un dato de tipo Short: " + Short.SIZE);
		System.out.println();
		
		System.out.println("Valor m�ximo para un dato de tipo Long: " + Long.MAX_VALUE);
		System.out.println("Valor m�nimo para un dato de tipo Long: " + Long.MIN_VALUE);
		System.out.println("Cantidad de bits que usa un dato de tipo Long: " + Long.SIZE);
		System.out.println();
		
		System.out.println("Valor m�ximo para un dato de tipo Float: " + Float.MAX_VALUE);
		System.out.println("Valor m�nimo para un dato de tipo Float: " + Float.MIN_VALUE);
		System.out.println("Cantidad de bits que usa un dato de tipo Float: " + Float.SIZE);
		System.out.println();
		
		System.out.println("Valor m�ximo para un dato de tipo Double: " + Double.MAX_VALUE);
		System.out.println("Valor m�nimo para un dato de tipo Double: " + Double.MIN_VALUE);
		System.out.println("Cantidad de bits que usa un dato de tipo Double: " + Double.SIZE);
		System.out.println();
		
		
		
		
	}
	
	/*
	 * Crear un programa que pida al usuario una contrase�a con los siguientes requisitos:
         - Al menos una may�scula.
         - Al menos una min�scula.
         - Al menos un d�gito
         - Al menos un car�cter no alfanum�rico.
       El programa no terminar� hasta que el usuario no introduzca la contrase�a con estos requisitos.
	 */
	
	private static void passwordR() {
		String str = JOptionPane.showInputDialog("Introduce la contrase�a con al menos una may�scula, una min�scula, un d�gito y un caracter que no sea alfanum�rico");
		Scanner teclado = new Scanner(System.in);
		boolean hayNumero = false;
		boolean hayMayus = false;
		boolean hayMin = false;
		boolean hayCaracterEsp = false;
		
		char password[] = new char[str.length()];
		int i;
		do {
			
			for ( i = 0; i < password.length; i++) {
				//System.out.println("Introduce caracteres");
				//password[x] = teclado.next().charAt(0);
				password [i] = str.charAt(i); 
			}
			
//			Character.isDigit(password[i]);
//			Character.isUpperCase(password[i]);
//			Character.isLowerCase(password[i]);
				
		} while ( !((Character.isDigit(password[i]) && Character.isUpperCase(password[i])
					&& Character.isLowerCase(password[i]))));
			
		
	
		for (char c : password) { 
            System.out.print(c); 
            
        } 

	}

	/**
	 * prueba de la contrase�a
	 */
	private static void otroMas() {
		String str = JOptionPane.showInputDialog("Introduce la contrase�a con al menos una"
				+ " may�scula, una min�scula, un d�gito y un caracter que no sea alfanum�rico");
		char password[] = new char[str.length()];
		boolean hayNumero = false;
		boolean hayMayus = false;
		boolean hayMin = false;
		boolean hayCaracterEsp = false;
		int i;
		for (i = 0; i < password.length; i++) {
			password[i] = str.charAt(i);
			
		}
		
		for (char c : password) { 
            System.out.print(c); 
        } 
		System.out.println();
		
		for (i = 0; i < password.length; i++) {
			if(Character.isDigit(password[i])) {
				hayNumero = true;
			}
			if(Character.isUpperCase(password[i])) {
				hayMayus = true;
			}
			if(Character.isLowerCase(password[i])) {
				hayMin = true;
			}
			if (!Character.isLetterOrDigit(password[i])) {
				hayCaracterEsp = true;
			}
		}
		if(hayNumero && hayMayus && hayMin && hayCaracterEsp) {
			System.out.println("La contrase�a es correcta");
		}else {
			System.out.println("La contrase�a es incorrecta");
		}


	}
	
	private static void passwordRestricc() {
		String str = JOptionPane.showInputDialog("Introduce la contrase�a con al menos una"
				+ " may�scula, una min�scula, un d�gito y un caracter que no sea alfanum�rico");
		
		boolean hayNumero = false;
		boolean hayMayus = false;
		boolean hayMin = false;
		boolean hayCaracterEsp = false;
		int i;
		
		do {
			char password[] = new char[str.length()];
			for (i = 0; i < password.length; i++) {
				password[i] = str.charAt(i);
				
			}
			for (char c : password) { 
	            System.out.print(c); 
	        } 
			System.out.println();
			for (i = 0; i < password.length; i++) {
				if(Character.isDigit(password[i])) {
					hayNumero = true;
				}
				if(Character.isUpperCase(password[i])) {
					hayMayus = true;
				}
				if(Character.isLowerCase(password[i])) {
					hayMin = true;
				}
				if (!Character.isLetterOrDigit(password[i])) {
					hayCaracterEsp = true;
				}
			}
			if(hayNumero && hayMayus && hayMin && hayCaracterEsp) {
				System.out.println("La contrase�a es correcta");
			}
			else { 
				System.out.println("La contrase�a no es correcta, hazlo otra vez");
				str = JOptionPane.showInputDialog("Introduce la contrase�a con al menos una"
						+ " may�scula, una min�scula, un d�gito y un caracter que no sea alfanum�rico");
				
				}
			
		} while (!(hayCaracterEsp && hayMayus && hayMin && hayNumero));
		
	}
	/*
	 * Realizar un programa que imprima los 100 primeros n�meros 
	 * enteros en c�digo hexadecimal.
	 */
	private static void losCienHexa() {
		
		for (int i = 0; i < 101 ; i++) {
			System.out.println("El n�mero " + i + " es en hexadecimal el: " + Integer.toHexString(i));
			
		}
		
	}
	public static void main(String[] args) {
		passwordRestricc();
	}
}
