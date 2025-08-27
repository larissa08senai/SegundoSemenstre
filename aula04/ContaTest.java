package aula04;

import java.util.Scanner;

public class ContaTest {
	public static void main(String[] args) {
		Conta pessoa1 = new Conta();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("ID: ");
		pessoa1.setId(ler.nextInt());
				
		System.out.println("Tipo: ");
		pessoa1.setTipo(ler.next());
		
		System.out.println("Saldo: ");
		pessoa1.setSaldo(ler.nextDouble());
		
		
		pessoa1.exibirConta();
		
		
		
	}

	
}
