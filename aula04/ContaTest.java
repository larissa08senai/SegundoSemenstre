package aula04;

import java.util.Scanner;

public class ContaTest {
	public static void main(String[] args) {
		Conta pessoa1 = new Conta();
		int dado ;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("ID: ");
		pessoa1.setId(ler.nextInt());
				
		System.out.println("Tipo: ");
		pessoa1.setTipo(ler.next());
		
		System.out.println("Saldo: ");
		pessoa1.setSaldo(ler.nextDouble());
		
		
		pessoa1.exibirConta();

		 System.out.println("sacar= 1  depositar = 2");
		dado = ler.nextInt();
		
		if(dado == 1) {
			 System.out.println("Valor do saque");
			 pessoa1.setSaque(ler.nextDouble());
			 
			 pessoa1.sacar();
		}else {
			 System.out.println("valor a depositar");
			 pessoa1.setDeposito(ler.nextDouble());
			 pessoa1.depositar();
			 System.out.println(pessoa1.getSaldo());
		}
		ler.close();
	}
		
		
}

	
}
