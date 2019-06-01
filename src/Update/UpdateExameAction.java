package Update;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

import Model.ExameModel;
import Model.TipoExameModel;
import classes.Generic;

public class UpdateExameAction implements Action {

	String nome;
	Integer tipo;
	List<Generic> tipos;
	Integer id;
	
	public String execute() {
		ResultSet rs = ExameModel.getExame(id);
		try {
			while(rs.next()) {
				id = rs.getInt("cd_exame");
				nome = rs.getString("nm_exame");
				tipo = rs.getInt("cd_tipo_exame");
			}
			
			ResultSet resp = TipoExameModel.getTiposExame();
			tipos = new ArrayList<Generic>();
			
			while(resp.next()) {
				tipos.add(new Generic(resp.getInt("cd_tipo_exame"), 
						resp.getString("nm_tipo_exame")));
			}
			
			return SUCCESS;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public List<Generic> getTipos() {
		return tipos;
	}

	public void setTipos(List<Generic> tipos) {
		this.tipos = tipos;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	
}
