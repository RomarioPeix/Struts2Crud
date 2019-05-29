package Register;
import com.opensymphony.xwork2.Action;

public class RegisterTipoAction implements Action{

	String nome;
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
