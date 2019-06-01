import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

import Model.PrestadorModel;
import classes.Generic;

public class PrestadorAction implements Action {
	
	Integer cd_prestador;
	List<Generic> prestadores;
	
	public String execute()
	{
		ResultSet rs = PrestadorModel.getPrestadores();
		prestadores = new ArrayList<Generic>();
		
		try {
			while(rs.next()) {
				prestadores.add(new Generic(rs.getInt("cd_prestador"), 
						rs.getString("nm_prestador")));
			}
			
			return SUCCESS;

		} catch (SQLException e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public List<Generic> getPrestadores() {
		return prestadores;
	}

	public void setPrestadores(List<Generic> prestadores) {
		this.prestadores = prestadores;
	}

	public void remover() {
		PrestadorModel.deletePrestador(this.cd_prestador);
	}
}
