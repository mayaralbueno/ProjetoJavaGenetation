package Classes;

public class Pessoas {

	//Atributos
	private int id;
	private String nome;
	private String telefone;
	private String email;
	private String endereco;

	//Construtor
	public Pessoas() {
		super();
	}
	
	//Construtor
	public Pessoas(int id, String nome, String telefone, String email, String endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.id = id;
	}

	//get and set
	
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	//Metodo de carregar doação
	//public void ddd(String no) {
	//	String n = no;
	//	doacoes doa = new doacoes(n);
	//}
	
}
