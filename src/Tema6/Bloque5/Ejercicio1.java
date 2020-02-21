package Tema6.Bloque5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;


public class Ejercicio1 {
	// creamos un calendar con su factoria correspondiente de patrones, no es
	// el Singleton
	private static Calendar fechaCalendar = Calendar.getInstance();
	// creamos una variable de tipo Date a null para usarla después
	private static Date fechaDelCalendario = new Date(fechaCalendar.getTimeInMillis());

	private static void dameFecha() {
		//String fechaUsuario = JOptionPane.showInputDialog("Introduce una fecha");
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	    // String strFecha = “2007-12-25”;
	     Date fecha = null;
	     try {

	         fecha = sdf.parse(JOptionPane.showInputDialog("Introduce una fecha"));

	     } catch (ParseException ex) {
	    	 System.out.println("Error al escribir la fecha");
	         ex.printStackTrace();

	     }

	    // System.out.println(fecha.toString());
	     System.out.println("La fecha es: " + sdf.format(fecha));
	}
	
	/**
	 * 
	 */
	public static void calendar() {
		// vamos a rellenar el fechaCalendar con una serie de datos de tipo String
		//que el usuario va a ir introduciendo, por lo que habrá que pasarlos a int
		fechaCalendar.set(Integer.parseInt(JOptionPane.showInputDialog("Introduce un año")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduce el día")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduce la hora")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduce los minutos")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduce los segundos")));
		
		// Obtenemos un Date con los milis de la fechaCalendar que el usuario ha introducido
		fechaDelCalendario = new Date(fechaCalendar.getTimeInMillis());
		
		System.out.println("La fecha es: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(fechaDelCalendario));
	}
	
	/**
	 * 
	 */
	private static void fechasPorSeparado() {
		System.out.println("Año: " + fechaCalendar.get(Calendar.YEAR));
		System.out.println("Año a partir del calendario: " + new SimpleDateFormat("yyyy").format(fechaDelCalendario));
		
		System.out.println("Mes: " + fechaCalendar.get(Calendar.MONTH));
		System.out.println("Mes a partir del calendario: " + new SimpleDateFormat("MM").format(fechaDelCalendario));
		
		System.out.println("Día: " + fechaCalendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Día a partir del calendario: " + new SimpleDateFormat("dd").format(fechaDelCalendario));
		
		System.out.println("Hora: " + fechaCalendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora a partir del calendario: " + new SimpleDateFormat("HH").format(fechaDelCalendario));
		
		System.out.println("Minutos: " + fechaCalendar.get(Calendar.MINUTE));
		System.out.println("Minutos a partir del calendario: " + new SimpleDateFormat("mm").format(fechaDelCalendario));
		
		System.out.println("Segundos: " + fechaCalendar.get(Calendar.SECOND));
		System.out.println("Segundos a partir del calendario: " + new SimpleDateFormat("ss").format(fechaDelCalendario));
		
	}
	
	public static void main(String[] args) {
		//dameFecha();
		//calendar();
		fechasPorSeparado();
		// TODO Auto-generated method stub

	}

}
