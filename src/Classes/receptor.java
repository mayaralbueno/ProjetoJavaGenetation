package Classes;

public class receptor extends Pessoas {
	
	String necessidade;
	int filhos;
	int niss;

	public receptor(String nome, String telefone, String endereco, String necessidade, int filhos, int niss) {
		// TODO Auto-generated constructor stub
		super(nome, telefone, endereco);
		this.necessidade = necessidade;
		this.filhos = filhos;
		this.niss = niss;
	}

	public String getNecessidade() {
		return necessidade;
	}

	public void setNecessidade(String necessidade) {
		this.necessidade = necessidade;
	}

	public int getFilhos() {
		return filhos;
	}

	public void setFilhos(int filhos) {
		this.filhos = filhos;
	}

	public int getNiss() {
		return niss;
	}

	public void setNiss(int niss) {
		this.niss = niss;
	}

}
