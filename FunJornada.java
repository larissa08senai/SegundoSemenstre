package aula05;

public class FunJornada extends Funcionario {
	private double salarioHora ;
	private int horasTrabalhadas ;
	public FunJornada (int id , String nome , String telefone , int matricula , String endereco, int horasTrabalhadas, double salarioHora) {
		super (id , nome , telefone , matricula , endereco);
		
		this.horasTrabalhadas = horasTrabalhadas ;
		this.salarioHora = salarioHora ;
	}

	@Override
	public double calcularSalario() {
		return salarioHora * horasTrabalhadas ;
		
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
}
