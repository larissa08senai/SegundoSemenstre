package metodos;

public class Barco {
	String nome;
	int tamanho;
	
	public void navegando() {
		System.out.println("O " + nome + " está navegando");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
