package Tema4OrientacionAObjetos.Ejercicio2Bloque2;

public class Principal {

	public static void main(String[] args) {
		Joya anillo = new Joya("alianza", "1879", "franc�s", "3467");
		ArmaDeFuego trabuco = new ArmaDeFuego("trabuco", "1789", "espa�ol", "4590", "mediano", "Revoluci�n francesa");
		Jarrone jarron = new Jarrone("jarr�n chino", "1245", "chino", "25000");
		Libro libro1 = new Libro("Primera edici�n", "1896", "Chile", "2350", "Cien poemas de amor y una canci�n desesperada");
		
		System.out.println("Lista de art�culos" + " \n" + anillo + " \n" + trabuco + " \n" + jarron + " \n" + libro1 );

	}

}
