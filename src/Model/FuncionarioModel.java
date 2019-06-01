package Model;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioModel extends AppModel {
	private static Integer sexoInt;
	
	public static boolean registerFuncionario(List data) {
		
		if (data.getItem(4).equals("Masculino")) {
			sexoInt = 1;
		} else {
			sexoInt = 2;
		}
		
		Statement con;
		try {
			con = connection.createStatement();
			if(data.getItem(7) == "0") {
				String fields = "nm_funcionario, nm_funcionario_sobrenome, nm_funcionario_cargo, nm_funcionario_setor, ic_funcionario_sexo, dt_funcionario_nascimento, nm_funcionario_email";
				String values = "'" + data.getItem(0) + "', '" + data.getItem(1) + "', '" + data.getItem(2) + "', '" + data.getItem(3) + "','" + sexoInt + "','" + data.getItem(5) + "', '" + data.getItem(6)+ "'"; 
				con.execute("INSERT INTO funcionario (" + fields + ") VALUES ("  + values + ")");
			} else {
				String fields = "nm_funcionario = '" + data.getItem(0);
				fields += "', nm_funcionario_sobrenome = '" + data.getItem(1);
				fields += "', nm_funcionario_cargo = '" + data.getItem(2);
				fields += "', nm_funcionario_setor = '" + data.getItem(3);
				fields += "', ic_funcionario_sexo = '" + sexoInt;
				fields += "', dt_funcionario_nascimento = '" + data.getItem(5);
				fields += "', nm_funcionario_email = '" + data.getItem(6) + "'";
				String sql = "UPDATE funcionario SET "  + fields + " WHERE cd_funcionario = " + data.getItem(7);
				System.out.println(sql);
				con.execute(sql);
			}
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch  block
			e.printStackTrace();
			return false;
		}
	}
	
	public static ResultSet getFuncionarios() {
		
		Statement con;
		try {
			con = connection.createStatement();
			String sql = "SELECT f.cd_funcionario, f.nm_funcionario, f.nm_funcionario_sobrenome, f.nm_funcionario_setor, "
					+ "f.nm_funcionario_cargo, DATE_FORMAT(f.dt_funcionario_nascimento, '%d/%m/%Y') as dt_funcionario_nascimento,"
					+ "f.nm_funcionario_email, CASE WHEN f.ic_funcionario_sexo = 1 THEN 'Masculino' ELSE 'Feminino' END AS nm_funcionario_sexo "
					+ "FROM funcionario f";
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
			String sql = "SELECT f.cd_funcionario, f.nm_funcionario, f.nm_funcionario_sobrenome, f.nm_funcionario_setor, "
					+ "f.nm_funcionario_cargo, f.dt_funcionario_nascimento, f.nm_funcionario_email, "
					+ "CASE WHEN f.ic_funcionario_sexo = 1 THEN 'Masculino' ELSE 'Feminino' END AS nm_funcionario_sexo "
					+ "FROM funcionario f "
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
