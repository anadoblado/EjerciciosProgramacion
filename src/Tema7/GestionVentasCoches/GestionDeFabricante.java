package Tema7.GestionVentasCoches;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;


public class GestionDeFabricante {
	
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
			case 3: obtenerId(conn);break;
			case 4:
				
				break;

			}
			
		} while (option !=0);
	}

	
	/**
	 * 
	 * @param conn
	 * @throws SQLException
	 */
	public static void listadoDeFabricantes (Connection conn) throws SQLException{
		Statement s = (Statement)conn.createStatement();
		ResultSet rs = s.executeQuery("select * from fabricante");
		
		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3));
		}
	}
	
	/**
	 * 
	 * @param conn
	 * @throws SQLException
	 */
	public static void altaFabricantes(Connection conn) throws SQLException {
		// Crear un Statement para ejecutar la conexion
		Statement s = (Statement)conn.createStatement();
		// Crear un Objeto de tipo Scanner donde recoge los datos
		Scanner sc = new Scanner(System.in);
		// Creamos las variables para introducir los datos
		int id;
		String cif;
		String nombre;
		System.out.println(" ");
		// Con sysos para pedir los datos a introducir y los recoge en cada uno
		System.out.println("Introduce un id");
		id = sc.nextInt();
		System.out.println("Introduce un cif");
		cif = sc.next();
		System.out.println("Introduce un nombre");
		nombre = sc.next();
		
		// Crear la cadena sql para recoger los datos he introducirlos en la tabla
		String sql = "INSERT INTO tutorialjavacoches.fabricante (id, cif, nombre)" + "VALUES (" + id + ", '" + cif + "', '" + nombre + "')";
		// para ejecutar la entrada siempre irá el 'execute'
		s.execute(sql);
		s.close();
		
	}
	
	public static int obtenerId (Connection conn) throws SQLException {
		// Crear un Statement para ejecutar la conexion
		Statement s = (Statement)conn.createStatement();
		// Creamos un Resulset para después hacer la comprabación
		ResultSet rs;
		// Crear un Objeto de tipo Scanner donde recoge los datos
		Scanner sc = new Scanner(System.in);
		int id;
		System.out.println(" ");
		System.out.println("Introduce un ID para comprobar si ya está en la lista");
		id = sc.nextInt();
		boolean existe = true;
		do {
			//Ejecuto la consulta en 
			rs = s.executeQuery("select id from tutorialjavacoches.fabricante order by id");
			
			while(rs.next()) {
				if(id == rs.getInt(1)) {
					System.out.println("El id existe en la tabla");
					existe = true;
					id = rs.getInt(1);
				}
			}
			
		} while (!existe);
		
		rs.close();
		s.close();
		return id;
		
	}
	

}
