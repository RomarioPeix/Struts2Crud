package classes;

public class Funcionario {
	Integer id;
	String nome;
	String sobrenome;
	String cargo;
	String setor;
	String sexo;
	String dataNascimento;
	String email;
	
	public Funcionario(Integer id, String nome, String sobrenome, String cargo, String setor, String sexo, String dataNascimento, String email) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cargo = cargo;
		this.setor = setor;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.id = id;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
