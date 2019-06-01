package Register;

import java.awt.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import Model.PrestadorModel;

public class RegisterPrestadorAction extends ActionSupport implements Action {

	Integer id;
	String nome;
	
	@Override
	public String execute() throws Exception {
		List prestador = new List();
		prestador.add(nome);
		
		try {
			prestador.add(id.toString());	
		} catch (NullPointerException e) {
			prestador.add("0");
		}
		
		PrestadorModel.registerPrestador(prestador);
		return SUCCESS;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}