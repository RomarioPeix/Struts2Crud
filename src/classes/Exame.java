package classes;

public class Exame {
	Integer id;
	String nome;
	String tipo;
	
	/**
	 * 
	 * @param Integer id = cd_exame
	 * @param String nome = nm_exame
	 * @param String tipo = cd_tipo_exame
	 * 
	 * **/
	public Exame(Integer id, String nome, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}