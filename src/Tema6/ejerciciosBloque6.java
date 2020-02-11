package Tema6;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class ejerciciosBloque6 {

//   - Crea un programa en Java que pida al usuario la introducci�n de una fecha
// 	a trav�s de JOptionPane. El usuario te especificar� un dato de tipo String y 
//	t� debes convertirlo a un objeto de tipo java.util.Date utilizando SimpleDateFormat. 
//	A continuaci�n realiza las siguientes acciones
//    - Con el objeto java.util.Date, crea un objeto de tipo Calendar y que represente la 
//	misma fecha que ha introducido el usuario.
//    - Obt�n en pantalla los siguientes campos: a�o, mes, d�a, hora, minuto y segundo. 
//	Cada campo debe aparecer en una l�nea de la consola. Debes obtener cada campo desde 
//	el objeto java.util.Date y desde el objeto Calendar. Es decir, cada campo debe ser 
//	obtenido dos veces en pantalla.
//    - Utiliza el objeto de tipo Calendar para obtener nuevas fechas e imprimirlas en 
//	pantalla: suma 3 d�as, resta 2 semanas, suma 300 d�as, suma 4 a�os.
	
	private static void ejercicioFecha() {
		String str = JOptionPane.showInputDialog("Introduce una fecha");
		SimpleDateFormat sdfIntr = new SimpleDateFormat ("EEE, MMM d, ''yy 'at' hh:mm:ss a z");
		//Date fechaIntroducida = new Date();
		System.out.println( "La fecha introducida es " + sdfIntr.format(new Date()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicioFecha();

	}

}
