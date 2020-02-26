package Tema7.GestionConcesionario.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import Tema7.JDBCPropiedades;



public class ControladorBBDD {

	protected static SimpleDateFormat sdfMySQL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	protected static void iniciaConnectionPool () {
		// se crea un hilo con una conexion con un objero runnable, que implica
		// heredar métodos como el run, así arrancamos la conexión al iniciar el controlador
		Thread conexionUCP = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					ConnectionManagerV2.getConexion();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ImposibleConectarException e) {
					e.printStackTrace();
				}
			}
			
		});
		conexionUCP.start();
	}
	
	/**
	 * Como el usuario no va a introducir un id en la tabla, sino que va a introducir un
	 * campo, el id será el siguiente al último, por eso usamos este método
	 * @param conn
	 * @param tabla
	 * @return
	 * @throws SQLException
	 */
	protected static int nextIdEnTabla (Connection conn, String tabla) throws SQLException{
		return maxIdEnTabla(conn, tabla) + 1;
		
	}

	/**
	 * Para hacer el siguiente id, necesitamos saber cuál es el último, por lo que hay que ejecutar
	 * una consulta
	 * @param conn
	 * @param tabla
	 * @return
	 * @throws SQLException
	 */
	private static int maxIdEnTabla(Connection conn, String tabla) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select max(id) from " + tabla);
		int max = 1;
		if(ps != null) {
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				max = rs.getInt(1);
			}
			rs.close();
		}
		
		return max;
	}
	
	/**
	 * Método para borrar datos
	 * @return
	 * @throws ErrorBBDDException
	 */
	protected static int eliminarTodoEnTabla() throws ErrorBBDDException {
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			Statement s = conn.createStatement();
			int registrosModificados = s.executeUpdate("delete from " + JDBCPropiedades.getProperty("JDBC_SCHEMA_NAME") + ".actor");
			s.close();
			return registrosModificados;
		} catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
		
		
		
	}
}
