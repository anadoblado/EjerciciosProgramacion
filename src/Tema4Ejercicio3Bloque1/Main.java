package Tema4Ejercicio3Bloque1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String str=JOptionPane.showInputDialog("Introduce 1 para pasar a introducir los datos de usuario y 0 para acabar");
		int usuario=Integer.parseInt(str);
		
		if(usuario==1) {
			Persona persona1=new Persona();
			persona1.introducirPersona();
			persona1.imprimirPersona();
		}
		else {
			return;
		}

	}

}
