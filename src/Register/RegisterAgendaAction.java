package Register;

import org.apache.struts2.components.Date;

import com.opensymphony.xwork2.Action;

public class RegisterAgendaAction implements Action {
	Integer funcionario;
	Date dataEntrada;
	Date dataExame;
	String medico;
	Integer notaFiscal;
	Integer tipo;
	Date dataSaida;
	
	public String execute() 
	{
		// to do
		return SUCCESS;
	}

	public Integer getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Integer funcionario) {
		this.funcionario = funcionario;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataExame() {
		return dataExame;
	}

	public void setDataExame(Date dataExame) {
		this.dataExame = dataExame;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public Integer getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(Integer notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
}
