package Tema7.GestionVentasCoches;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

import tutorialJava.capitulo7_Acceso_A_Datos.ConnectionManagerV2;
import tutorialJava.capitulo7_Acceso_A_Datos.ImposibleConectarException;

public class GestionListado {
	
	static Connection conn = null;
	
	public static void menuGestionFabricante(Connection conn) throws SQLException{
		
		try {
			conn = ConnectionManagerV2.getConexion();
		} catch (SQLException e ) {
			e.printStackTrace();
		} catch (ImposibleConectarException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("\n\t\t\tLISTA DE OPCIONES");
			System.out.println("\n\t1.-Listado de fabricantes");
			System.out.println("\n\t2.- Alta de fabricantes");
			System.out.println("\n\t3.- Modificación");
			System.out.println("\n\t4.- Baja");
			System.out.println("\n\tElija otra opcion ");
			System.out.println("\n\t0.- Salir");
			option = sc.nextInt();
			
			switch (option) {
			case 0: break;
			case 1: listadoDeFabricantes(conn);
			case 2:
			case 3:
			case 4:
				
				break;

			default:
				break;
			}
			
		} while (option !=0);
	}

	
	public static void listadoDeFabricantes (Connection conn) throws SQLException{
		Statement s = (Statement)conn.createStatement();
		ResultSet rs = s.executeQuery("select * from fabricante");
		
		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3));
		}
	}
	
	

}
