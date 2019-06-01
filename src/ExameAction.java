import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.Action;
import classes.Exame;
import classes.Generic;
import Model.ExameModel;
import Model.TipoExameModel;

public class ExameAction implements Action{

	Integer cd_exame;
	List<Generic> tipos;
	List<Exame> exames;
	
	public String execute()
	{
		ResultSet rs = ExameModel.getExames();
		exames = new ArrayList<Exame>();
		
		try {
			while(rs.next()) {
				exames.add(new Exame(rs.getInt("cd_exame"),
						rs.getString("nm_exame"),
						rs.getString("nm_tipo_exame")));
			}
			
			System.out.println(exames);
			return SUCCESS;
		} catch (SQLException e) {
			e.printStackTrace();
			return ERROR;
		}	
	}

	public String cadastrar()
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
	
	public Integer getCd_exame() {
		return cd_exame;
	}

	public void setCd_exame(Integer cd_exame) {
		this.cd_exame = cd_exame;
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}
	
	public List<Generic> getTipos() {
		return tipos;
	}

	public void setTipos(List<Generic> tipos) {
		this.tipos = tipos;
	}
	
	public void remover() {
		ExameModel.deleteFuncionario(this.cd_exame);
	}


}
