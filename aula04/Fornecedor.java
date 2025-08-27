package aula04;

public class Fornecedor {
	int id;
	String razaoSocial;
	String nomeFantasia;
	String cnpj;
	String endereco;
	String fone;
	String email;
	String inscricaoEstadual;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public void exibirFornecedor() {
		System.out.println("ID: " + id);
		System.out.println();
		System.out.println("Razão Social: " + razaoSocial);
		System.out.println();
		System.out.println("Nome Fantasia: " + nomeFantasia);
		System.out.println();
		System.out.println("CNPJ: " + cnpj);
		System.out.println();
		System.out.println("Endereço: " + endereco);
		System.out.println();
		System.out.println("Telefone: " + fone);System.out.println();
		System.out.println();
		System.out.println("Email: " + email);
		System.out.println();
		System.out.println("Inscrição Estadual: " + inscricaoEstadual);
		System.out.println();
	}

}
