package aula03;

public class Animais {
 String nome;
 String peso;
 int idade;
 String cor;
 public String getNome() {
	return nome;
 }
 public void setNome(String nome) {
	this.nome = nome;
 }
 public String getPeso() {
	return peso;
 }
 public void setPeso(String peso) {
	this.peso = peso;
 }
 public int getIdade() {
	return idade;
 }
 public void setIdade(int idade) {
	this.idade = idade;
 }
 public String getCor() {
	return cor;
 }
 public void setCor(String cor) {
	this.cor = cor;
 }
 public void emitirSom() {
	 System.out.println("O " + nome + " esta emitindo som");
 }
 public void andando() {
	 System.out.println("O " + nome + " esta andando");
 }
 public void comer() {
	 System.out.println("O " + nome +  " Esta comendo");
 }
 public void dormir() {
	 System.out.println("O " + nome + " esta dormindo");
 }
 
 
 
}
