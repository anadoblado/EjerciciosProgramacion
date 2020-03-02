package Tema7.GestionConcesionario.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;



import Tema7.GestionConcesionario.Cliente;

public class ControladorCliente extends ControladorBBDD {

	public static List<Cliente> getAll() throws ErrorBBDDException{
		List<Cliente> clientes = new ArrayList<Cliente>();
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from cliente");
			
			while(rs.next()) {
				Cliente cl = new Cliente();
			}
			
		} catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException();
		}
		return clientes;
		
	}
	public ControladorCliente() {
		// TODO Auto-generated constructor stub
	}

}
