package Tema4Ejercicio3Bloque1;

import javax.swing.JOptionPane;

public class Persona {

	public String nombre;
	public String apellidos;
	public int dni;
	public String direccion;
	public int telefono;
	
	/**
	 * 
	 */
	public void introducirPersona() {
		nombre=JOptionPane.showInputDialog("Introducir nombre");
		apellidos=JOptionPane.showInputDialog("Introducir apellidos");
		String dni2= JOptionPane.showInputDialog("Introduce DNI");
		dni=Integer.parseInt(dni2);
		direccion=JOptionPane.showInputDialog("Introduce tu dirección");
		String tel=JOptionPane.showInputDialog("Introduce tu teléfono");
		telefono=Integer.parseInt(tel);
		 
	}
	/**
	 * 
	 */
	public void imprimirPersona () {
		System.out.println("Es: "+nombre+" "+apellidos+ "con DNI: "+dni+"\n"+" vive en: "+ direccion+ " y su telefono es: "+telefono );
		
	}
	
	
}
