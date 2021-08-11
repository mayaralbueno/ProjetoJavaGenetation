package Classes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cadastro {

	// Metodo de cadastramento das Pessoas Fisicas e as Pessoas Juridicas.
	public static void cadastro() {
		ArrayList<Pessoas> pessoasPF = new ArrayList();
		ArrayList<Pessoas> pessoasPJ = new ArrayList();
		Random randow = new Random();
		Scanner leia = new Scanner(System.in);
		int escolha;
		boolean sair = false;
		String nome, telefone, email, endereco, cnpj, cpf;

		while (sair == false) {
			System.out.println("\nOtimo, mas antes de doar para nossa campanha, vamos realizar um pequeno cadastro.\n"
					+ "Vamos-lá!!!\n" + "\n1) Com qual tipo de Pessoa você deseja doar ?\n"
					+ "1 - Sou uma Pessoa Juridica.\n" + "2 - Sou uma Pessoa Fisica.");
			System.out.print("Digite uma das opções: ");
			escolha = leia.nextInt();
			switch (escolha) {
			case 1:
				int numero = randow.nextInt(1000);
				System.out.println("\nPrimeiramente, digite para mim o nome ou razão social: ");
				nome = leia.next();
				System.out.println("\nOkay, agora digite para mim o CNPJ da empresa: ");
				cnpj = leia.next();
				System.out.println("\nEm seguida, digite para mim o numero do telefone da empresa: ");
				telefone = leia.next();
				System.out.println("\nEstamos quase acabando, agora digite para mim o email da empresa: ");
				email = leia.next();
				System.out.println("\nPara finalizarmos, agora digite para mim o endereço da empresa: ");
				endereco = leia.next();
				doadorJuridico pj = new doadorJuridico(numero, nome, telefone, email, endereco, cnpj);
				pessoasPJ.add(pj);
				sair = true;
				break;
			case 2:
				int numero2 = randow.nextInt(1000);
				System.out.println("\nPrimeiramente, digite para mim o seu nome: ");
				nome = leia.next();
				System.out.println("\nOkay " + nome + ", agora digite para mim o seu CPF: ");
				cpf = leia.next();
				System.out.println("\nEm seguida, digite para mim o seu numero de telefone: ");
				telefone = leia.next();
				System.out.println("\nEstamos quase acabando, agora digite para mim o seu email: ");
				email = leia.next();
				System.out.println("\nPara finalizarmos, agora digite para mim o seu endereço: ");
				endereco = leia.next();
				doadorFisico pf = new doadorFisico(numero2, nome, telefone, email, endereco, cpf);
				pessoasPF.add(pf);
				sair = true;
				break;
			default:
				System.out.println("Opção invalida.\n");
			}
		}
	}
}
