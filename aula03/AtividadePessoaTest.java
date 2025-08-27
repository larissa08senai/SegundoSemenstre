package aula03;

import java.util.Scanner;

public class AtividadePessoaTest {
public static void main(String[] args) {
	AtividadePessoa pessoa1 = new AtividadePessoa();
	AtividadePessoa pessoa2 = new AtividadePessoa();
	AtividadePessoa pessoa3 = new AtividadePessoa();
	AtividadePessoa pessoa4 = new AtividadePessoa();
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Nome: ");
	pessoa1.setNome(ler.next());
	
	System.out.println("idade: ");
    pessoa1.setIdade(ler.nextInt());
    
    System.out.println("Endereço: ");
    pessoa1.setEndereco(ler.next());
    
    System.out.println("CPF: ");
    pessoa1.setCpf(ler.next());
    
    System.out.println("Rg: ");
    pessoa1.setRg(ler.next());
    
    System.out.println("Profissão: ");
    pessoa1.setProfissão(ler.next());
    
    //NOVA PESSOA
    System.out.println("Nome: ");
    pessoa2.setNome(ler.next());
    
    System.out.println("idade: ");
    pessoa2.setIdade(ler.nextInt());
    
    System.out.println("Endereço: ");
    pessoa2.setEndereco(ler.next());
    
    System.out.println("CPF: ");
    pessoa2.setCpf(ler.next());
    
    System.out.println("Rg: ");
    pessoa2.setRg(ler.next());
    
    System.out.println("Profissão: ");
    pessoa2.setProfissão(ler.next());
    
    //NOVA PESSOA
    System.out.println("Nome: ");
    pessoa3.setNome(ler.next());
    
    System.out.println("idade: ");
    pessoa3.setIdade(ler.nextInt());
    
    System.out.println("Endereço: ");
    pessoa3.setEndereco(ler.next());
   
    System.out.println("CPF: ");
    pessoa3.setCpf(ler.next());
    
    System.out.println("Rg: ");
    pessoa3.setRg(ler.next());
    
    System.out.println("Profissão: ");
    pessoa3.setProfissão(ler.next());
    
    //NOVA PESSOA
    System.out.println("Nome: ");
    pessoa4.setNome(ler.next());
    
    System.out.println("idade: ");
    pessoa4.setIdade(ler.nextInt());
    
    System.out.println("Endereço: ");
    pessoa4.setEndereco(ler.next());
    
    System.out.println("CPF: ");
    pessoa4.setCpf(ler.next());
    
    System.out.println("Rg: ");
    pessoa4.setRg(ler.next());
    
    System.out.println("Profissão: ");
    pessoa4.setProfissão(ler.next());
    
    //EXIBIÇÃO
    ler.close();
    
    System.out.println(pessoa1.getNome());
    System.out.println(pessoa1.getIdade());
    System.out.println(pessoa1.getEndereco());
    System.out.println(pessoa1.getCpf());
    System.out.println(pessoa1.getRg());
    System.out.println(pessoa1.getProfissão());
    System.out.println();
    //NOVA
    System.out.println(pessoa2.getNome());
    System.out.println(pessoa2.getIdade());
    System.out.println(pessoa2.getEndereco());
    System.out.println(pessoa2.getCpf());
    System.out.println(pessoa2.getRg());
    System.out.println(pessoa2.getProfissão());
    System.out.println();
    //NOVA
    System.out.println(pessoa3.getNome());
    System.out.println(pessoa3.getIdade());
    System.out.println(pessoa3.getEndereco());
    System.out.println(pessoa3.getCpf());
    System.out.println(pessoa3.getRg());
    System.out.println(pessoa3.getProfissão());
    System.out.println();
    //NOVA
    System.out.println(pessoa4.getNome());
    System.out.println(pessoa4.getIdade());
    System.out.println(pessoa4.getEndereco());
    System.out.println(pessoa4.getCpf());
    System.out.println(pessoa4.getRg());
    System.out.println(pessoa4.getProfissão());
    System.out.println();
    
}
}
