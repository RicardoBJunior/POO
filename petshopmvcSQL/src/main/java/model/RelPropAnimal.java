package model;

public class RelPropAnimal{
	
	private String cpf;
	private Integer id;
	
	
	public RelPropAnimal() {
		
	}
	public RelPropAnimal(String cPF, Integer id, Integer idade) {
		super();
		this.cpf = cPF;
		this.id = id;
	}

	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cPF) {
		this.cpf = cPF;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
