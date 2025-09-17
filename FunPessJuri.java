package aula05;

public class FunPessJuri extends Funcionario{
	private double valorBruto ;
	private double imposto ;
	
	public FunPessJuri (int id , String nome , String telefone , int matricula , String endereco,  double valorBruto, double imposto) {
		super (id , nome , telefone , matricula , endereco);
		this.valorBruto = valorBruto ;
		this.imposto = imposto ;
		
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return valorBruto - imposto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
}
