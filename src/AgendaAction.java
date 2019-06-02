import com.opensymphony.xwork2.Action;

import Model.AgendaModel;
import Model.ExameModel;
import Model.FuncionarioModel;
import Model.PrestadorModel;
import classes.Agenda;
import classes.Generic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author JOSÉ ROMÁRIO PEIXOTO
 *
 */
public class AgendaAction implements Action{

	Integer id;
	Integer cd_funcionario;
	Integer cd_exame;
	Integer cd_prestador;
	String dt_agenda_exame;
	String dt_agenda_hora;
	List<Agenda> agendamentos;
	List<Generic> funcionarios;
	List<Generic> exames;
	List<Generic> prestadores;
	
	public String execute() 
	{
		ResultSet rs = AgendaModel.getAgendamentosByFuncionario(cd_funcionario);
		agendamentos = new ArrayList<Agenda>();
		
		try {
			while(rs.next()) {
				agendamentos.add(new Agenda(rs.getInt("cd_agenda_exame"), 
						rs.getString("nm_funcionario"),
						rs.getString("nm_exame"),
						rs.getString("nm_tipo_exame"),
						rs.getString("dt_agenda_exame"),
						rs.getString("dt_agenda_exame_hora"),
						rs.getString("nm_prestador")));
			}
			
			ResultSet rsFuncionarios = FuncionarioModel.getFuncionarios();
			funcionarios = new ArrayList<Generic>();
			
			while(rsFuncionarios.next()) {
				funcionarios.add(new Generic(rsFuncionarios.getInt("cd_funcionario"), 
						rsFuncionarios.getString("nm_funcionario") + " " + rsFuncionarios.getString("nm_funcionario_sobrenome")));
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
			
			return SUCCESS;
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public String novoAgendamento()
	{
		java.awt.List agenda = new java.awt.List();
		agenda.add(cd_funcionario.toString());
		agenda.add(cd_exame.toString());
		agenda.add(cd_prestador.toString());
		agenda.add(dt_agenda_exame);
		agenda.add(dt_agenda_hora);
		try {
			agenda.add(id.toString());
		} catch (Exception e) {
			agenda.add("0");	
		}
		
		AgendaModel.registerAgendamento(agenda);
		return SUCCESS;
		
	}
	

	public List<Generic> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Generic> funcionarios) {
		this.funcionarios = funcionarios;
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
	
	public Integer getCd_prestador() {
		return cd_prestador;
	}

	public void setCd_prestador(Integer cd_prestador) {
		this.cd_prestador = cd_prestador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Agenda> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<Agenda> agendamentos) {
		this.agendamentos = agendamentos;
	}

	public Integer getCd_funcionario() {
		return cd_funcionario;
	}

	public void setCd_funcionario(Integer cd_funcionario) {
		this.cd_funcionario = cd_funcionario;
	}

	public Integer getCd_exame() {
		return cd_exame;
	}

	public void setCd_exame(Integer cd_exame) {
		this.cd_exame = cd_exame;
	}

	public String getDt_agenda_exame() {
		return dt_agenda_exame;
	}

	public void setDt_agenda_exame(String dt_agenda_exame) {
		this.dt_agenda_exame = dt_agenda_exame;
	}

	public String getDt_agenda_hora() {
		return dt_agenda_hora;
	}

	public void setDt_agenda_hora(String dt_agenda_hora) {
		this.dt_agenda_hora = dt_agenda_hora;
	}
	
	public void remover() {
		AgendaModel.deleteAgendamento(this.id);
	}
}
