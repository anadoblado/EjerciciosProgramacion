package Tema3;

import javax.swing.JOptionPane;

public class ejercicio1Bloque2 {

	public static void main(String[] args) {
		// Media de una cantidad de n�meros introducidos por el usuario. 
		//El usuario especificar� una cantidad de n�meros, tras lo cual se 
		//le deben pedir tantos como este haya indicado. Al final se debe imprimir la media. 
		
		String str = JOptionPane.showInputDialog("Introduce la cantidad de n�meros para hacer la media");
		int cantidad = Integer.parseInt(str);
		int media = 0;
		
		int i;
		for (i=0; i<cantidad ; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
			media += num;
		
		}
		System.out.println("Media: " + (float)media/cantidad );

	}

}
