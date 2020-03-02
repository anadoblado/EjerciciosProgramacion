package Tema7.GestionConcesionario;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import Tema7.GestionConcesionario.modelo.ControladorConcesionario;

public class Main {

	static Connection conn = null;
	
	public static void menuGestion() throws SQLException, ParseException{
		int option = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n\t\t\tGESTION DE VENTAS");
			System.out.println("\n\t1.-Listado de fabricantes");
			System.out.println("\n\t2.-Listado de concesionarios");
			System.out.println("\n\t3.-Listado de coches");
			System.out.println("\n\t4.-Listado de clientes");
			System.out.println("\n\t5.- _______________");
			System.out.println("\n\t0.- Salir");
			option = sc.nextInt();
			
			switch (option) {
			case 0:break;
			case 1: GestionDeFabricante.menuGestionFabricante(); 
				break;
			case 2: GestionDeConcesionario.menuGestionConcesionario();
				break;
			case 3: GestionDeCoche.menuGestionCoche();
				break;
			case 4: GestionCliente.menuGestioCliente();
				break;
			}
		} while (option != 0);
	}
	public static void main(String[] args) throws SQLException, ParseException {
		menuGestion();

	}

}
