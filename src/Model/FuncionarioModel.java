package Model;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Database.Database;

public class FuncionarioModel {
	private static Integer sexoInt;
	private static Connection connection = Database.getConexaoMySQL();
	
	public static boolean registerFuncionario(List data) {
		if (data.getItem(4) == "Masculino") {
			sexoInt = 1;
		} else {
			sexoInt = 2;
		}
		
		Statement con;
		try {
			con = connection.createStatement();
			String fields = "nm_funcionario, nm_funcionario_sobrenome, nm_funcionario_cargo, nm_funcionario_setor, ic_funcionario_sexo, dt_funcionario_nascimento, nm_funcionario_email";
			String values = "'" + data.getItem(0) + "', '" + data.getItem(1) + "', '" + data.getItem(2) + "', '" + data.getItem(3) + "','" + sexoInt + "','" + data.getItem(5) + "', '" + data.getItem(6)+ "'"; 
			con.execute("INSERT INTO funcionario (" + fields + ") VALUES ("  + values + ")");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static ResultSet getFuncionarios() {
		
		Statement con;
		try {
			String sql = "SELECT f.nm_funcionario, f.nm_funcionario_sobrenome, f.nm_funcionario_setor, "
					+ "f.nm_funcionario_cargo, f.dt_funcionario_nascimento, f.nm_funcionario_email, "
					+ "CASE WHEN f.ic_funcionario_sexo = 1 THEN 'Masculino' ELSE 'Feminino' END AS nm_funcionario_sexo "
					+ "FROM funcionario f";
			con = connection.createStatement();
			ResultSet rs = con.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static ResultSet getFuncionario(Integer cd_funcionario) {
		
		Statement con;
		try {
			String sql = "SELECT f.nm_funcionario, f.nm_funcionario_sobrenome, f.nm_funcionario_setor, "
					+ "f.nm_funcionario_cargo, f.dt_funcionario_nascimento, f.nm_funcionario_email, "
					+ "CASE WHEN f.ic_funcionario_sexo = 1 THEN 'Masculino' ELSE 'Feminino' END AS nm_funcionario_sexo "
					+ "FROM funcionario f"
					+ "WHERE f.cd_funcionario = " + cd_funcionario;
			con = connection.createStatement();
			ResultSet rs = con.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static boolean deleteFuncionario(Integer cd_funcionario) {
		
		Statement con;
		try {
			con = connection.createStatement();
			con.execute("DELETE FROM funcionario WHERE cd_funcionario = " + cd_funcionario);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
