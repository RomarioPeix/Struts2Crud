package Register;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterPrestadorAction extends ActionSupport implements Action {

	String nome;
	
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
	
}