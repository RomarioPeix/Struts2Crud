package Model;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrestadorModel extends AppModel {
	
	public static boolean registerPrestador(List data) {
		Statement con;
		try {
			con = connection.createStatement();
			if(data.getItem(1) == "0") {
				String fields = "nm_prestador";
				String values = "'" + data.getItem(0) + "'"; 
				con.execute("INSERT INTO prestador(" + fields + ") VALUES ("  + values + ")");
			} else {
				String fields = "nm_prestador = '" + data.getItem(0) + "'";
				con.execute("UPDATE prestador SET " + fields + " WHERE cd_prestador = " + data.getItem(1));
			}
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
			con = connection.createStatement();
			String sql = "SELECT p.cd_prestador, p.nm_prestador "
					+ "FROM prestador p";
			System.out.println(sql);
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
			con = connection.createStatement();
			String sql = "SELECT p.cd_prestador, p.nm_prestador "
					+ "FROM prestador p "
					+ "WHERE p.cd_prestador = " + cd_prestador;
			System.out.println(sql);
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
			String sql = "DELETE FROM prestador WHERE cd_prestador = " + cd_prestador;
			con.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}
