package Model;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Database.Database;

public class TipoExameModel {

	private static Connection connection = Database.getConexaoMySQL();
	
	public static boolean registerTipoExame(List data) {
		Statement con;
		try {
			con = connection.createStatement();
			String fields = "nm_tipo_exame";
			String values = "'" + data.getItem(0) + "'"; 
			con.execute("INSERT INTO tipo_exame(" + fields + ") VALUES ("  + values + ")");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static ResultSet getTiposExame() {
		
		Statement con;
		try {
			String sql = "SELECT te.nm_tipo_exame"
					+ "FROM tipo_exame te";
			con = connection.createStatement();
			ResultSet rs = con.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static ResultSet getTipoExame(Integer cd_tipo_exame) {
		
		Statement con;
		try {
			String sql = "SELECT te.nm_tipo_exame"
					+ "FROM tipo_exame te"
					+ "WHERE te.cd_tipo_exame = " + cd_tipo_exame;
			con = connection.createStatement();
			ResultSet rs = con.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static boolean deleteTipoExame(Integer cd_tipo_exame) {
		
		Statement con;
		try {
			con = connection.createStatement();
			con.execute("DELETE FROM tipo_exame WHERE cd_tipo_exame = " + cd_tipo_exame);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}
