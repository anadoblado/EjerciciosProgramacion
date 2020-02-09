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
	 * Calcula Pi y lo compara con el el valor de Pi de la máquina, para que tenga una precisión determinada
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
		System.out.println("La aproximación de pi es: " + y1);
	}
	
	/**
	 * Calcula la hipotenusa de un triángulo rectángulo
	 */
	private static void hipotenusa() {
		y1 = 4;
		y2 = 5;
		x = Math.hypot(y1, y2);
		System.out.println("La hipotenusa es: " + x);
	}
	
	/*
	 * Hallar los cinco primero máximos locales de la función y=x*sen(x) con una precisión de 0.01.
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
				System.out.println("Es máximo: " + a);
			contador++;
			}
			x += 0.01;
			x2 += 0.01;
			x3 += 0.01;
			
		} while (contador <= 5);
	}
	
	/**
	 * Calcula los 5 primeros máximos de la función y=x*sin(x)
	 */
	private static void otroDelSeno() {
		x2=0;
		x=0.01;
		x3=0.02;
		do {
			if ( x*Math.sin(x) > x2*Math.sin(x2) && x*Math.sin(x) > x3*Math.sin(x3) ) {
				contador++;
				System.out.println("El valor " + x + " es un máximo");
				
			}
			x += 0.01;
			x2 += 0.01;
			x3 += 0.01;
		} while (contador <=5);
		
	}
	
	/*
	 * Realizar un programa que imprima una tabla con los límites máximo y mínimo representables para los 
	 * diferentes tipos primitivos en Java (byte, int, short, long, float, double). En la tabla también 
	 * deberá aparecer el número de bytes que cada tipo usa para su representación
	 */
	/**
	 * Representa los valors máximos y mínimos de cada tipo de dato primitivo
	 */
	private static void maxYMinRepresentable() {
		System.out.println("Valor máximo para un dato de tipo Byte: " + Byte.MAX_VALUE);
		System.out.println("Valor mínimo para un dato de tipo Byte: " + Byte.MIN_VALUE);
		System.out.println("Cantidad de bits que usa un dato de tipo Byte: " + Byte.SIZE);
		System.out.println();
		
		System.out.println("Valor máximo para un dato de tipo Integer: " + Integer.MAX_VALUE);
		System.out.println("Valor mínimo para un dato de tipo Integer: " + Integer.MIN_VALUE);
		System.out.println("Cantidad de bits que usa un dato de tipo Integer: " + Integer.SIZE);
		System.out.println();
		
		System.out.println("Valor máximo para un dato de tipo Short: " + Short.MAX_VALUE);
		System.out.println("Valor mínimo para un dato de tipo Short: " + Short.MIN_VALUE);
		System.out.println("Cantidad de bits que usa un dato de tipo Short: " + Short.SIZE);
		System.out.println();
		
		System.out.println("Valor máximo para un dato de tipo Long: " + Long.MAX_VALUE);
		System.out.println("Valor mínimo para un dato de tipo Long: " + Long.MIN_VALUE);
		System.out.println("Cantidad de bits que usa un dato de tipo Long: " + Long.SIZE);
		System.out.println();
		
		System.out.println("Valor máximo para un dato de tipo Float: " + Float.MAX_VALUE);
		System.out.println("Valor mínimo para un dato de tipo Float: " + Float.MIN_VALUE);
		System.out.println("Cantidad de bits que usa un dato de tipo Float: " + Float.SIZE);
		System.out.println();
		
		System.out.println("Valor máximo para un dato de tipo Double: " + Double.MAX_VALUE);
		System.out.println("Valor mínimo para un dato de tipo Double: " + Double.MIN_VALUE);
		System.out.println("Cantidad de bits que usa un dato de tipo Double: " + Double.SIZE);
		System.out.println();
		
		
		
		
	}
	
	/*
	 * Crear un programa que pida al usuario una contraseña con los siguientes requisitos:
         - Al menos una mayúscula.
         - Al menos una minúscula.
         - Al menos un dígito
         - Al menos un carácter no alfanumérico.
       El programa no terminará hasta que el usuario no introduzca la contraseña con estos requisitos.
	 */
	
	private static void passwordR() {
		String str = JOptionPane.showInputDialog("Introduce la contraseña con al menos una mayúscula, una minúscula, un dígito y un caracter que no sea alfanumérico");
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
	 * prueba de la contraseña
	 */
	private static void otroMas() {
		String str = JOptionPane.showInputDialog("Introduce la contraseña con al menos una"
				+ " mayúscula, una minúscula, un dígito y un caracter que no sea alfanumérico");
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
			System.out.println("La contraseña es correcta");
		}else {
			System.out.println("La contraseña es incorrecta");
		}


	}
	
	private static void passwordRestricc() {
		String str = JOptionPane.showInputDialog("Introduce la contraseña con al menos una"
				+ " mayúscula, una minúscula, un dígito y un caracter que no sea alfanumérico");
		
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
				System.out.println("La contraseña es correcta");
			}
			else { 
				System.out.println("La contraseña no es correcta, hazlo otra vez");
				str = JOptionPane.showInputDialog("Introduce la contraseña con al menos una"
						+ " mayúscula, una minúscula, un dígito y un caracter que no sea alfanumérico");
				
				}
			
		} while (!(hayCaracterEsp && hayMayus && hayMin && hayNumero));
		
	}
	/*
	 * Realizar un programa que imprima los 100 primeros números 
	 * enteros en código hexadecimal.
	 */
	private static void losCienHexa() {
		
		for (int i = 0; i < 101 ; i++) {
			System.out.println("El número " + i + " es en hexadecimal el: " + Integer.toHexString(i));
			
		}
		
	}
	public static void main(String[] args) {
		passwordRestricc();
	}
}
