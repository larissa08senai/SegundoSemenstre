package metodos;

public class Pessoa {
	String nome;
	double peso;
	double pesoComida;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPesoComida() {
		return pesoComida;
	}
	public void setPesoComida(double pesoComida) {
		this.pesoComida = pesoComida;
	}
	public void comer(double pesoComida) {
		peso += pesoComida;
	}

}
