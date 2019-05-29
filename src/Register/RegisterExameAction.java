package Register;

import com.opensymphony.xwork2.Action;

public class RegisterExameAction implements Action{
	
	String nome;
	Integer tipo;
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	
	
}
