package Register;
import java.awt.List;
import Model.FuncionarioModel;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterFuncionarioAction extends ActionSupport implements Action {

	String nome;
	String sobrenome;
	String cargo;
	String setor;
	String sexo;
	Integer sexoInt;
	String dataNascimento;
	String email;
	
	public String execute() throws Exception {
		List funcionario = new List();
		funcionario.add(nome);
		funcionario.add(sobrenome);
		funcionario.add(cargo);
		funcionario.add(setor);
		funcionario.add(sexo);
		funcionario.add(dataNascimento);
		funcionario.add(email);
		FuncionarioModel.registerFuncionario(funcionario);
		
		return SUCCESS;
	}
	
	public void setSexoInt(Integer sexoInt) {
		this.sexoInt = sexoInt;
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
}
