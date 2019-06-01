package Update;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.Action;

import Model.PrestadorModel;

public class UpdatePrestadorAction implements Action {
	
	String nome;
	Integer id;
	
	public String execute() {
		System.out.println(id);
		ResultSet rs = PrestadorModel.getPrestador(id);
		try {
			while(rs.next()) {
				id = rs.getInt("cd_prestador");
				nome = rs.getString("nm_prestador");
			}
			return SUCCESS;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
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
