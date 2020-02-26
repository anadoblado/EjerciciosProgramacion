package Tema7.GestionVentasCoches;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.Scanner;

public class GestionFabricante2 {
	static Connection conn = null;
	private static boolean LOG = true;
	private static Hashtable<String, PreparedStatement> psMaxIdsEnTabla;
	
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
			System.out.println("\n\t3.- Obtener id");
			System.out.println("\n\t4.- Modificacion");
			System.out.println("\n\t5.- Baja");
			System.out.println("\n\tElija otra opcion ");
			System.out.println("\n\t0.- Salir");
			option = sc.nextInt();
			
			switch (option) {
			case 0: break;
			case 1: listadoDeFabricantes(conn);break;
			case 2: altaFabricantes(conn);break;
			case 3: //obtenerId(conn);break;
			case 4:
				
				break;

			}
			
		} while (option !=0);
	}

	private static void altaFabricantes(Connection conn) throws SQLException, ImposibleConectarException {
		PreparedStatement ps = conn.prepareStatement("INSERT INTO tutorialjavacoches.fabricante (id, cif, nombre) VALUES (?, ?, ?)");
		
		int registrosInsertados;
		int contRegistrosInsertados = 0;
		
		if (LOG) {
			System.out.println("\nInsertando registros en la tabla fabricante");
			
			ps.setInt(1, nextIdTabla(conn));
			
		}
		
	}
	
	private static int nextIEnTabla (Connection conn) {
		return maxIdEnTabla(conn) + 1;
		
	}
	
	private static int maxIdEnTabla(Connection conn) {
		Statement s = (Statement)conn.createStatement();
		//ResultSet rs = 
		//PreparedStatement ps = psMaxIdsEnTabla.get()
	}

	private static void listadoDeFabricantes(Connection conn) throws SQLException, ImposibleConectarException {
		// TODO Auto-generated method stub
		Statement s = (Statement)conn.createStatement();
		ResultSet rs = s.executeQuery("select * from fabricante");
		
		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3));
		}
		
	}


}
