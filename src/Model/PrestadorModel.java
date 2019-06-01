package Model;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Database.Database;

public class PrestadorModel {

private static Connection connection = Database.getConexaoMySQL();
	
	public static boolean registerPrestador(List data) {
		Statement con;
		try {
			con = connection.createStatement();
			String fields = "nm_prestador";
			String values = "'" + data.getItem(0) + "'"; 
			con.execute("INSERT INTO prestador(" + fields + ") VALUES ("  + values + ")");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static ResultSet getPrestadores() {
		
		Statement con;
		try {
			String sql = "SELECT p.nm_prestador"
					+ "FROM prestador p";
			con = connection.createStatement();
			ResultSet rs = con.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static ResultSet getPrestador(Integer cd_prestador) {
		
		Statement con;
		try {
			String sql = "SELECT p.nm_prestador"
					+ "FROM prestador p"
					+ "WHERE p.cd_prestador = " + cd_prestador;
			con = connection.createStatement();
			ResultSet rs = con.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static boolean deletePrestador(Integer cd_prestador) {
		
		Statement con;
		try {
			con = connection.createStatement();
			con.execute("DELETE FROM prestador WHERE cd_prestador = " + cd_prestador);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}
