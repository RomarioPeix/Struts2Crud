package Update;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import Model.FuncionarioModel;

public class UpdateFuncionarioAction extends ActionSupport {
	
	String nome;
	String sobrenome;
	String cargo;
	String setor;
	String sexo;
	Integer sexoInt;
	String dataNascimento;
	String email;
	Integer id;

	public String execute() {
		ResultSet rs = FuncionarioModel.getFuncionario(id);
		try {
			while(rs.next()) {
				id = rs.getInt("cd_funcionario");
				nome = rs.getString("nm_funcionario");
				sobrenome = rs.getString("nm_funcionario_sobrenome");
				cargo = rs.getString("nm_funcionario_cargo");
				setor = rs.getString("nm_funcionario_setor");
				sexo = rs.getString("nm_funcionario_sexo");
				dataNascimento = rs.getString("dt_funcionario_nascimento");
				email = rs.getString("nm_funcionario_email");
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getSexoInt() {
		return sexoInt;
	}

	public void setSexoInt(Integer sexoInt) {
		this.sexoInt = sexoInt;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
