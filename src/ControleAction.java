import com.opensymphony.xwork2.Action;

public class ControleAction implements Action{

	public String execute() 
	{
		return SUCCESS;
	}
	
	public String funcionario() 
	{
		return "funcionario";
	}
	
	public String exame() 
	{
		return "exame";
	}
	
	public String tipo() 
	{
		return "tipo";
	}
	
	public String prestador() 
	{
		return "prestador";
	}
	
}
