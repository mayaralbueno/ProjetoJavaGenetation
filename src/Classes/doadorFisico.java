package Classes;

public class doadorFisico extends Pessoas {

	//Atributos
	private String cpf;
	
	public doadorFisico() {
		super();
	}
	
	public doadorFisico(int id, String nome, String telefone, String email, String endereco, String cpf) {
		super(id, nome, telefone, email, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
