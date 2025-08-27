package aula04;

public class Usuario {
	int id;
	String nome;
	int password;
	String permissão;
	String usuario;
	
	public void exibirUsuario() {
		System.out.println("Id: " + id);
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println();
        System.out.println("Senha de Acesso: " + password);
        System.out.println();
        System.out.println("Permissões de acesso: " + permissão);
        System.out.println();
        System.out.println("Serie do Usuario: " + usuario);
        System.out.println();
       
	}
	public void acesso() {
		 System.out.println(nome + "Entrou");
	}
	public void kill() {
		 System.out.println(nome + "Foi desativado");
	}
	public void idNum() {
		 System.out.println(id);
	}
	public void serial() {
		 System.out.println(usuario);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getPermissão() {
		return permissão;
	}

	public void setPermissão(String permissão) {
		this.permissão = permissão;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
