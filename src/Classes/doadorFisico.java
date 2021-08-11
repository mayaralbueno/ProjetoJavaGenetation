package Classes;

import java.util.Random;
import java.util.Scanner;

public class doadorFisico extends Pessoas {

	// Atributos
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

	// Metodo de doação Pessoa Fisica
	/*public static void doacaoPf(doadorFisico pf) {
		int escolha, idPessoa;
		double quantidade;
		String descricao;
		boolean sair = false;
		
		Random randow = new Random();
		Scanner leia = new Scanner(System.in);
		doacoes doacao = new doacoes();
		
		while (sair == false) {
			System.out.println("\nlegal " + pf.getNome() + ", Agora estamos no menu de doações.");
			System.out.println("O que você deseja doar ?" + "\n1 - Brinquedos" + "\n2 - Alimento" + "\n3 - Roupa"
					+ "\n4 - Utensílios domésticos" + "\n5 - Outros");
			escolha = leia.nextInt();
			switch (escolha) {
			case 1:
				int numero = randow.nextInt(1000);
				doacao.setId(numero);
				idPessoa = (int) pf.getId();
				doacao.setIdPessoa(idPessoa);
				doacao.setTipoPessoa("PJ");
				System.out.println("Brinquedos que legal, assim você fara muitas crianças felizes.");
				doacao.setNome("Brinquedo");
				System.out.println(pf.getNome() + " digite para mim a quantidade de brinquedos que você deseja doar? ");
				quantidade = leia.nextDouble();
				doacao.setQuantidade(quantidade);
				System.out
						.println(pf.getNome() + " para encerrarmos digite agora uma descrição do objeto a ser doado.");
				System.out.print("Resposta: ");
				descricao = leia.next();
				doacao.setDescricao(descricao);
				sair = true;
				break;
			case 2:
				int numero2 = randow.nextInt(1000);
				doacao.setId(numero2);
				idPessoa = (int) pf.getId();
				doacao.setIdPessoa(idPessoa);
				doacao.setTipoPessoa("PJ");
				System.out.println("Alimento que legal, assim você fara muitas crianças felizes.");
				doacao.setNome("Alimento");
				System.out.println(pf.getNome() + " digite para mim a quantidade de Alimento que você deseja doar? ");
				quantidade = leia.nextDouble();
				doacao.setQuantidade(quantidade);
				System.out
						.println(pf.getNome() + " para encerrarmos digite agora uma descrição do objeto a ser doado.");
				System.out.print("Resposta: ");
				descricao = leia.next();
				doacao.setDescricao(descricao);
				sair = true;
				break;
			case 3:
				int numero3 = randow.nextInt(1000);
				doacao.setId(numero3);
				idPessoa = (int) pf.getId();
				doacao.setIdPessoa(idPessoa);
				doacao.setTipoPessoa("PJ");
				System.out.println("Roupa que legal, assim você fara muitas crianças felizes.");
				doacao.setNome("Roupa");
				System.out.println(pf.getNome() + " digite para mim a quantidade de Roupa que você deseja doar? ");
				quantidade = leia.nextDouble();
				doacao.setQuantidade(quantidade);
				System.out
						.println(pf.getNome() + " para encerrarmos digite agora uma descrição do objeto a ser doado.");
				System.out.print("Resposta: ");
				descricao = leia.next();
				doacao.setDescricao(descricao);
				sair = true;
				break;
			case 4:
				int numero4 = randow.nextInt(1000);
				doacao.setId(numero4);
				idPessoa = (int) pf.getId();
				doacao.setIdPessoa(idPessoa);
				doacao.setTipoPessoa("PJ");
				System.out.println("Utensílios domésticos que legal, assim você fara muitas pessoas felizes.");
				doacao.setNome("Utensílios domésticos");
				System.out.println(
						pf.getNome() + " digite para mim a quantidade de Utensílios domésticos que você deseja doar? ");
				quantidade = leia.nextDouble();
				doacao.setQuantidade(quantidade);
				System.out
						.println(pf.getNome() + " para encerrarmos digite agora uma descrição do objeto a ser doado.");
				System.out.print("Resposta: ");
				descricao = leia.next();
				doacao.setDescricao(descricao);
				sair = true;
				break;
			case 5:
				int numero5 = randow.nextInt(1000);
				doacao.setId(numero5);
				idPessoa = (int) pf.getId();
				doacao.setIdPessoa(idPessoa);
				doacao.setTipoPessoa("PJ");
				System.out.println("Outros que legal, assim você fara muitas Pessoas felizes.");
				doacao.setNome("Outros");
				System.out.println(pf.getNome() + " digite para mim a quantidade de Outros que você deseja doar? ");
				quantidade = leia.nextDouble();
				doacao.setQuantidade(quantidade);
				System.out
						.println(pf.getNome() + " para encerrarmos digite agora uma descrição do objeto a ser doado.");
				System.out.print("Resposta: ");
				descricao = leia.next();
				doacao.setDescricao(descricao);
				sair = true;
				break;
			default:
				System.out.println("\nOpção invalida");
			}
		}
		System.out.println("\nObrigado Pela sua contribuição :)");
	}*/
}
