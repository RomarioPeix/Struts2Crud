import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import Model.FuncionarioModel;
import classes.Funcionario;
public class FuncionarioAction implements Action{
	
	List<Funcionario> funcionarios;
	Integer cd_funcionario;
	
	public String execute()
	{
		ResultSet rs = FuncionarioModel.getFuncionarios();
		funcionarios = new ArrayList<Funcionario>();
				
		try {
			while(rs.next()) {
				funcionarios.add(new Funcionario(rs.getInt("cd_funcionario"), 
						rs.getString("nm_funcionario"), 
						rs.getString("nm_funcionario_sobrenome"),
						rs.getString("nm_funcionario_cargo"),
						rs.getString("nm_funcionario_setor"),
						rs.getString("nm_funcionario_sexo"),
						rs.getString("dt_funcionario_nascimento"),
						rs.getString("nm_funcionario_email")));
			}
						return SUCCESS;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		
	}
	
	public void remover() {
		FuncionarioModel.deleteFuncionario(this.cd_funcionario);
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public Integer getCd_funcionario() {
		return cd_funcionario;
	}

	public void setCd_funcionario(Integer cd_funcionario) {
		this.cd_funcionario = cd_funcionario;
	}


	
}
