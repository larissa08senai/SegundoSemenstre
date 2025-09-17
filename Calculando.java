package aula05;

public class Calculando implements Calculos {
	
	private double valor1 ;
	private double valor2 ;
	private int valor3 ;
	

	@Override
	public double somar() {
		// TODO Auto-generated method stub
		return valor1 + valor2;
	}

	@Override
	public double sub() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double multi() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int div() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int exp() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}
	

}
