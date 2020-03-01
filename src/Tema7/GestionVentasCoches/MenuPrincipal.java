package Tema7.GestionVentasCoches;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import Tema7.GestionConcesionario.modelo.ControladorConcesionario;

public class MenuPrincipal {
	
	static Connection conn = null;
	
	public static void menuGestion() throws SQLException {
		int option = 0;
		Scanner sc = new Scanner(System.in);
		//GestionListado.menuGestionFabricante(conn);
		do {
			System.out.println("\n\t\t\tGESTION DE FABRICANTES");
			System.out.println("\n\t1.-Listado de fabricantes");
			System.out.println("\n\t2.-Listado de concesionarios");
			System.out.println("\n\t3.- _______________");
			System.out.println("\n\t4.- _______________");
			System.out.println("\n\t5.- _______________");
			System.out.println("\n\t0.- Salir");
			option = sc.nextInt();
			
			switch (option) {
			case 0: break;
			case 1: GestionDeFabricante.menuGestionFabricante(conn);
				
				break;
			case 2: 

			default:
				break;
			}
		} while (option != 0);
	}

	public static void main(String[] args) throws SQLException {
		menuGestion();
 


	}

}
