package aula03;

import java.util.Scanner;

public class ClienteTest {
	public static void main(String[] args) {
		 Cliente cliente1 = new Cliente();
		 Cliente cliente2 = new Cliente();
		
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("Id: ");
		 cliente1.setId(ler.nextInt());
		 
		 System.out.println("Nome: ");
		 cliente1.setNome(ler.next());
		 
		 System.out.println("Telefone: ");
		 cliente1.setTelefone(ler.next());
		 
		 System.out.println("CPF: ");
		 cliente1.setCpf(ler.next());
		 
		 System.out.println("RG:");
		 cliente1.setRg(ler.next());
		 
		 //
		 System.out.println("Id: ");
		 cliente2.setId(ler.nextInt());
		 
		 System.out.println("Nome: ");
		 cliente2.setNome(ler.next());
		 
		 System.out.println("Telefone: ");
		 cliente2.setTelefone(ler.next());
		 
		 System.out.println("CPF: ");
		 cliente2.setCpf(ler.next());
		 
		 System.out.println("RG:");
		 cliente2.setRg(ler.next());
		 
		 //EXIBIÇÃO
		 ler.close();
		 
		 System.out.println(cliente1.getId());
		 System.out.println(cliente1.getNome());
		 System.out.println(cliente1.getTelefone());
		 System.out.println(cliente1.getCpf());
		 System.out.println(cliente1.getRg());
		 System.out.println();
		 
		 //
		 System.out.println(cliente2.getId());
		 System.out.println(cliente2.getNome());
		 System.out.println(cliente2.getTelefone());
		 System.out.println(cliente2.getCpf());
		 System.out.println(cliente2.getRg());
		 System.out.println();
		 
		 //
	}
}
