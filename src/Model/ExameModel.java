package Model;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Database.Database;

public class ExameModel {

	private static Connection connection = Database.getConexaoMySQL();
	
	public static boolean registerExame(List data) {
		Statement con;
		try {
			con = connection.createStatement();
			String fields = "nm_exame, cd_tipo_exame";
			String values = "'" + data.getItem(0) + "', '" + data.getItem(1) + "'"; 
			con.execute("INSERT INTO exame(" + fields + ") VALUES ("  + values + ")");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static ResultSet getExames() {
		
		Statement con;
		try {
			String sql = "SELECT e.nm_exame, te.nm_tipo_exame"
					+ "FROM exame e"
					+ "LEFT JOIN tipo_exame te ON (te.cd_tipo_exame = f.cd_tipo_exame)";
			con = connection.createStatement();
			ResultSet rs = con.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static ResultSet getExame(Integer cd_exame) {
		
		Statement con;
		try {
			String sql = "SELECT e.nm_exame, te.nm_tipo_exame"
					+ "FROM exame e"
					+ "LEFT JOIN tipo_exame te ON (te.cd_tipo_exame = f.cd_tipo_exame)"
					+ "WHERE e.cd_funcionario = " + cd_exame;
			con = connection.createStatement();
			ResultSet rs = con.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static boolean deleteFuncionario(Integer cd_exame) {
		
		Statement con;
		try {
			con = connection.createStatement();
			con.execute("DELETE FROM exame WHERE cd_exame = " + cd_exame);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}
