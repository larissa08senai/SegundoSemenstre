package aula03;

public class Cliente {
  int id;
  String nome;
  String telefone;
  String cpf;
  String rg;
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
  public String getTelefone() {
	return telefone;
  }
  public void setTelefone(String telefone) {
	this.telefone = telefone;
  }
  public String getCpf() {
	return cpf;
  }
  public void setCpf(String cpf) {
	this.cpf = cpf;
  }
  public String getRg() {
	return rg;
  }
  public void setRg(String rg) {
	this.rg = rg;
  }
  
  public void informacao() {
	  System.out.println( rg + cpf + telefone);
  }
  public void contatar() {
	  System.out.println("ligando para " + nome + " " + telefone);
  }
  public void idNum() {
	  System.out.println(id);
  }
  public void kill() {
	  System.out.println(nome + " deletado");
  }

}
