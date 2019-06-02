package classes;

public class Agenda {
	Integer id;
	String funcionario;
	String exame;
	String tipoExame;
	String dataExame;
	String horaExame;
	String prestador;
	

	/**
	 * 
	 * @param Integer id
	 * @param String funcionario
	 * @param String exame
	 * @param String tipoExame
	 * @param String dataExame
	 * @param String horaExame
	 * @return 
	 * 
	 * **/
	public Agenda(Integer id, String funcionario, String exame, String tipoExame, String dataExame, String horaExame, String prestador) {
		super();
		this.id = id;
		this.funcionario = funcionario;
		this.exame = exame;
		this.tipoExame = tipoExame;
		this.dataExame = dataExame;
		this.horaExame = horaExame;
		this.prestador = prestador;
	}

	public String getPrestador() {
		return prestador;
	}

	public void setPrestador(String prestador) {
		this.prestador = prestador;
	}
	
	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public String getExame() {
		return exame;
	}

	public void setExame(String exame) {
		this.exame = exame;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public String getDataExame() {
		return dataExame;
	}

	public void setDataExame(String dataExame) {
		this.dataExame = dataExame;
	}

	public String getHoraExame() {
		return horaExame;
	}

	public void setHoraExame(String horaExame) {
		this.horaExame = horaExame;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}