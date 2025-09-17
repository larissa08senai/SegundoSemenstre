package aula05;

public class FunHorista extends Funcionario {
	private double valorHora ;
	private int quantidadeHoras ;
	
	public FunHorista (int id , String nome , String telefone , int matricula , String endereco, double valorHora, int quantidadeHoras) {
		super (id , nome , telefone , matricula , endereco);
		this.valorHora = valorHora ;
		this.quantidadeHoras = quantidadeHoras ; 
		
	}

	@Override
	public double calcularSalario() {
		return valorHora * quantidadeHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(int quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	
	

}
