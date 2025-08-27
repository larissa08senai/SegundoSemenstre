package aula04;

import java.util.Scanner;

public class FornecedorTest {
	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("ID: ");
		fornecedor1.setId(ler.nextInt());
		System.out.println("Razão Social: ");
		fornecedor1.setRazaoSocial(ler.next());
		System.out.println("Nome Fantasia: ");
		fornecedor1.setRazaoSocial(ler.next());
		System.out.println("CNPJ: ");
		fornecedor1.setCnpj(ler.next());
		System.out.println("Endereço: ");
		fornecedor1.setEndereco(ler.next());
		System.out.println("Telefone: ");
		fornecedor1.setFone(ler.next());
		System.out.println("Email: ");
		fornecedor1.setEmail(ler.next());
		System.out.println("Inscrição Estadual: ");
		fornecedor1.setInscricaoEstadual(ler.next());
		System.out.println();
		
		ler.close();
		
		fornecedor1.exibirFornecedor();
		
	}

}
