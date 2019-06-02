package Model;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Database.Database;

public class AgendaModel {
	
/**
 *  create table agenda_exame(
    ->     cd_agenda_exame int primary key not null auto_increment,
    ->     cd_funcionario_id int,
    ->     cd_tipo_exame int,
    ->     cd_exame int,
    ->     dt_agenda_exame date,
    ->     dt_agenda_exame_hora varchar(10),
    ->     dt_agenda_exame_criado datetime default now(),
    ->     dt_agenda_exame_atualizado datetime default now() on update now());
 * */

private static Connection connection = Database.getConexaoMySQL();
	
	public static boolean registerAgendamento(List data) {
		Statement con;
		try {
			con = connection.createStatement();
			if(data.getItem(5) == "0") {
				String fields = "cd_funcionario_id, cd_exame, cd_prestador, dt_agenda_exame, dt_agenda_exame_hora";
				String values = "'" + data.getItem(0) + "', '" + data.getItem(1) + "', '" + data.getItem(2) + "', '" + data.getItem(3) + "', '" + data.getItem(4) + "'"; 
				String sql = "INSERT INTO agenda_exame(" + fields + ") VALUES ("  + values + ")";
				con.execute(sql);
			} else {
				String fields = "cd_funcionario_id = '" + data.getItem(0) + "', cd_exame = '" + data.getItem(1) + "', ";
				fields += "cd_prestador = '" + data.getItem(2) + "', dt_agenda_exame = '" + data.getItem(3) + "', ";
				fields += "dt_agenda_exame_hora = '" + data.getItem(4) + "'";
				String sql = "UPDATE agenda_exame SET " + fields + " WHERE cd_agenda_exame = " + data.getItem(5);
				con.execute(sql);
			}
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static ResultSet getAgendamentos() {
		
		Statement con;
		try {
			String sql = "SELECT ae.cd_agenda_exame, f.nm_funcionario, e.nm_exame, te.nm_tipo_exame, DATE_FORMAT(ae.dt_agenda_exame, '%d/%m/%Y') as dt_agenda_exame, ae.dt_agenda_exame_hora, p.cd_prestador, p.nm_prestador "
					+ "FROM agenda_exame ae "
					+ "LEFT JOIN funcionario f ON (ae.cd_funcionario_id = f.cd_funcionario) "
					+ "LEFT JOIN exame e ON (ae.cd_exame = e.cd_exame) "
					+ "LEFT JOIN prestador p ON (p.cd_prestador = ae.cd_prestador) "
					+ "LEFT JOIN tipo_exame te ON (te.cd_tipo_exame = e.cd_tipo_exame)";
			con = connection.createStatement();
			ResultSet rs = con.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static ResultSet getAgendamentosByFuncionario(Integer cd_funcionario) {
		
		Statement con;
		try {
			String sql = "SELECT ae.cd_agenda_exame, f.nm_funcionario, e.nm_exame, te.nm_tipo_exame, DATE_FORMAT(ae.dt_agenda_exame, '%d/%m/%Y') as dt_agenda_exame, ae.dt_agenda_exame_hora, p.cd_prestador, p.nm_prestador "
					+ "FROM agenda_exame ae "
					+ "LEFT JOIN funcionario f ON (ae.cd_funcionario_id = f.cd_funcionario) "
					+ "LEFT JOIN exame e ON (ae.cd_exame = e.cd_exame) "
					+ "LEFT JOIN prestador p ON (p.cd_prestador = ae.cd_prestador) "
					+ "LEFT JOIN tipo_exame te ON (te.cd_tipo_exame = e.cd_tipo_exame) "
					+ "WHERE ae.cd_funcionario_id = " + cd_funcionario;
			con = connection.createStatement();
			ResultSet rs = con.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
		
	public static ResultSet getAgendamento(Integer cd_agenda_exame) {
		
		Statement con;
		try {
			String sql = "SELECT ae.cd_agenda_exame, f.cd_funcionario, f.nm_funcionario, f.nm_funcionario_sobrenome, e.cd_exame, e.nm_exame, te.nm_tipo_exame, ae.dt_agenda_exame, ae.dt_agenda_exame_hora, p.cd_prestador, p.nm_prestador "
					+ "FROM agenda_exame ae "
					+ "LEFT JOIN funcionario f ON (ae.cd_funcionario_id = f.cd_funcionario) "
					+ "LEFT JOIN exame e ON (ae.cd_exame = e.cd_exame) "
					+ "LEFT JOIN prestador p ON (p.cd_prestador = ae.cd_prestador) "
					+ "LEFT JOIN tipo_exame te ON (te.cd_tipo_exame = e.cd_tipo_exame) "
					+ "WHERE ae.cd_agenda_exame = " + cd_agenda_exame;
			con = connection.createStatement();
			ResultSet rs = con.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static boolean deleteAgendamento(Integer cd_agenda_exame) {
		
		Statement con;
		try {
			con = connection.createStatement();
			con.execute("DELETE FROM agenda_exame WHERE cd_agenda_exame = " + cd_agenda_exame);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}
