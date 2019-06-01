package Register;
import java.awt.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import Model.TipoExameModel;

public class RegisterTipoAction extends ActionSupport implements Action{

	Integer id;
	String nome;
	public String execute() throws Exception {
		List tipo = new List();
		tipo.add(nome);
		
		try {
			tipo.add(id.toString());
		} catch (Exception e) {
			tipo.add("0");
		}
		
		TipoExameModel.registerTipoExame(tipo);
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
