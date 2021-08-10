package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class doadorJuridico extends Pessoas{

	//Atributos
	private String razaoSocial;
	private String cnpj;
	
	public doadorJuridico() {
		super();
	}
	
	public doadorJuridico(int id, String nome, String telefone, String email, String endereco, String cnpj) {
		super(id, nome, telefone, email, endereco);
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
