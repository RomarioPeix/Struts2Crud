package Register;

import java.awt.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import Model.ExameModel;
import Model.FuncionarioModel;

public class RegisterExameAction extends ActionSupport implements Action{
	
	Integer id;
	String nome;
	Integer tipo;
	
	@Override
	public String execute() throws Exception {
		List exame = new List();
		exame.add(nome);
		exame.add(tipo.toString());
		try {
			exame.add(id.toString());			
		} catch (NullPointerException e) {
			exame.add("0");
		}
		
		ExameModel.registerExame(exame);
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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	
	
}
