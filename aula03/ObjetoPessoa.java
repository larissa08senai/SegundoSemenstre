package aula03;

import java.util.Scanner;

public class ObjetoPessoa {
public static void main(String[] args) {
	Pessoa pessoa1 = new Pessoa();
	Pessoa pessoa2 = new Pessoa();
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Nome:  ");
	pessoa1.setNome(ler.nextLine());
	
	System.out.println("Idade:  ");
	pessoa1.setIdade(ler.nextInt());
	
	System.out.println("Endereço:  ");
	pessoa1.setEndereco(ler.next());
	
	System.out.println("Profissão: ");
	pessoa1.setProfissao(ler.next());
	
	System.out.println();
	
	System.out.println("Nome:  ");
	pessoa2.setNome(ler.next());
	
	System.out.println("Idade:  ");
	pessoa2.setIdade(ler.nextInt());
	
	System.out.println("Endereco:  ");
	pessoa2.setEndereco(ler.next());
	System.out.println("Profissão: ");
	pessoa2.setProfissao(ler.next());
	
	System.out.println();
	
	System.out.println(pessoa1.getNome());
	System.out.println(pessoa1.getIdade());
	System.out.println(pessoa1.getEndereco());
	System.out.println(pessoa1.getProfissao());
	
	System.out.println();
	
	System.out.println(pessoa2.getNome());
	System.out.println(pessoa2.getIdade());
	System.out.println(pessoa2.getEndereco());
	System.out.println(pessoa2.getProfissao());
	
	ler.close();
	
	pessoa1.andar();
	
	pessoa2.respira();
	
}
}
