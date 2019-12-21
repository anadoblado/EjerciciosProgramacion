package Tema4OrientacionAObjetos.Ejercicio2Bloque2;

public class Principal {

	public static void main(String[] args) {
		Joya anillo = new Joya("alianza", "1879", "francés", "3467");
		ArmaDeFuego trabuco = new ArmaDeFuego("trabuco", "1789", "español", "4590", "mediano", "Revolución francesa");
		Jarrone jarron = new Jarrone("jarrón chino", "1245", "chino", "25000");
		Libro libro1 = new Libro("Primera edición", "1896", "Chile", "2350", "Cien poemas de amor y una canción desesperada");
		
		System.out.println("Lista de artículos" + " \n" + anillo + " \n" + trabuco + " \n" + jarron + " \n" + libro1 );

	}

}
