package aula04;

public class Cadeira {
  String estofamento;
  String cor;
  int braco;
  String tipo;
  public String getEstofamento() {
	return estofamento;
  }
  public void setEstofamento(String estofamento) {
	this.estofamento = estofamento;
  }
  public String getCor() {
	return cor;
  }
  public void setCor(String cor) {
	this.cor = cor;
  }
  public int getBraco() {
	return braco;
  }
  public void setBraco(int braco) {
	this.braco = braco;
  }
  public String getTipo() {
	return tipo;
  }
  public void setTipo(String tipo) {
	this.tipo = tipo;
  }
  public void girar() {
	  System.out.println(" A cadeira esta girando");
  }
  public void quebrar() {
	  System.out.println("A cadeira " + tipo + " quebrou");
  }
  public void inclinar() {
	  System.out.println("Esta inclinada");
  }
  public void arrastar() {
	  System.out.println( tipo + "Foi movida");
  }
 
}
