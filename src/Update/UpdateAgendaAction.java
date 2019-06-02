package Update;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Model.AgendaModel;
import Model.ExameModel;
import Model.PrestadorModel;
import classes.Generic;

public class UpdateAgendaAction extends ActionSupport {

	Integer id;
	Integer cdExame;
	Integer prestador;
	String nomeFuncionario;
	Integer cdFuncionario;
	String dataExame;
	String horaExame;
	List<Generic> exames;
	List<Generic> prestadores;
	
	public String execute() {
		
		ResultSet rs = AgendaModel.getAgendamento(id);
		try {
			while(rs.next()) {
				id = rs.getInt("cd_agenda_exame");
				cdExame = rs.getInt("cd_exame");
				nomeFuncionario = rs.getString("nm_funcionario") + " " + rs.getString("f.nm_funcionario_sobrenome");
				cdFuncionario = rs.getInt("cd_funcionario");
				dataExame = rs.getString("dt_agenda_exame");
				prestador = rs.getInt("cd_prestador");
				horaExame = rs.getString("dt_agenda_exame_hora");
			}
			
			ResultSet rsExames = ExameModel.getExames();
			exames = new ArrayList<Generic>();
			
			while(rsExames.next()) {
				exames.add(new Generic(rsExames.getInt("cd_exame"), 
						rsExames.getString("nm_exame")));
			}
			
			ResultSet rsPrestadores = PrestadorModel.getPrestadores();
			prestadores = new ArrayList<Generic>();
			
			while(rsPrestadores.next()) {
				prestadores.add(new Generic(rsPrestadores.getInt("cd_prestador"), 
						rsPrestadores.getString("nm_prestador")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	public Integer getCdFuncionario() {
		return cdFuncionario;
	}

	public void setCdFuncionario(Integer cdFuncionario) {
		this.cdFuncionario = cdFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public List<Generic> getExames() {
		return exames;
	}



	public void setExames(List<Generic> exames) {
		this.exames = exames;
	}



	public List<Generic> getPrestadores() {
		return prestadores;
	}



	public void setPrestadores(List<Generic> prestadores) {
		this.prestadores = prestadores;
	}



	public Integer getPrestador() {
		return prestador;
	}

	public void setPrestador(Integer prestador) {
		this.prestador = prestador;
	}

	public Integer getCdExame() {
		return cdExame;
	}

	public void setCdExame(Integer cdExame) {
		this.cdExame = cdExame;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getDataExame() {
		return dataExame;
	}
	public void setDataExame(String dataExame) {
		this.dataExame = dataExame;
	}
	public String getHoraExame() {
		return horaExame;
	}
	public void setHoraExame(String horaExame) {
		this.horaExame = horaExame;
	}
	
}
