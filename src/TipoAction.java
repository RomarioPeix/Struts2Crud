import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

import Model.TipoExameModel;
import classes.Generic;

public class TipoAction implements Action {

	Integer cd_tipo_exame;
	List<Generic> tipos;
	
	public String execute()
	{
		ResultSet rs = TipoExameModel.getTiposExame();
		tipos = new ArrayList<Generic>();
		
		try {
			while(rs.next()) {
				tipos.add(new Generic(rs.getInt("cd_tipo_exame"), 
						rs.getString("nm_tipo_exame")));
			}
			
			return SUCCESS;

		} catch (SQLException e) {
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

	public Integer getCd_tipo_exame() {
		return cd_tipo_exame;
	}

	public void setCd_tipo_exame(Integer cd_tipo_exame) {
		this.cd_tipo_exame = cd_tipo_exame;
	}

	public void remover() {
		TipoExameModel.deleteTipoExame(this.cd_tipo_exame);
	}
	
}
