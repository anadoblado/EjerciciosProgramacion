package Tema7.GestionVentasCoches;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import tutorialJava.capitulo7_Acceso_A_Datos.ImposibleConectarException;

public class GetionFabricante {
	
	static Connection conn = null;
	
	public static void menuGestion() throws SQLException {
		int option = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n\t\t\tGESTION DE FABRICANTES");
			System.out.println("\n\t1.-Listado de fabricantes");
			System.out.println("\n\t2.- _______________");
			System.out.println("\n\t3.- _______________");
			System.out.println("\n\t4.- _______________");
			System.out.println("\n\t5.- _______________");
			System.out.println("\n\t0.- Salir");
			option = sc.nextInt();
			
			switch (option) {
			case 0: break;
			case 1: GestionListado.listadoDeFabricantes(conn);
				
				break;

			default:
				break;
			}
		} while (option != 0);
	}

	public static void main(String[] args) throws SQLException {
		menuGestion();
 


	}

}
