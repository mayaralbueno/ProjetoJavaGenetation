package Classes;

import java.util.ArrayList;
import java.util.List;

public class doacoes {

	private int id;
	private int idPessoa;
	private String tipoPessoa;
	private String nome;
	private double quantidade;
	private String descricao;

	public doacoes() {
		super();
	}

	public doacoes(int id, int idPessoa, String tipoPessoa, String nome, double quantidade, String descricao) {
		super();
		this.id = id;
		this.idPessoa = idPessoa;
		this.tipoPessoa = tipoPessoa;
		this.nome = nome;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<doacoes> getDoacao(){
		
		
		return null;
		
	}
}
