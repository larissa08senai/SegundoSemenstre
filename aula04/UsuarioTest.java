package aula04;

import java.util.Scanner;

public class UsuarioTest {
	public static void main(String[] args) {
		Usuario user1 = new Usuario();
		
		Scanner ler = new Scanner(System.in);
		
			System.out.println("Id: ");
			user1.setId(ler.nextInt());
			System.out.println();
			System.out.println("Nome: ");
			user1.setNome(ler.next());
			System.out.println();
			System.out.println("PassWord: ");
			user1.setPassword(ler.nextInt());
			System.out.println();
			System.out.println("Permissões: ");
			user1.setPermissão(ler.next());
			System.out.println();
			System.out.println("Serie do usuario: ");
			user1.setUsuario(ler.next());
			System.out.println();
			
			ler.close();
			
			user1.exibirUsuario();
	}

}
