package aula04;

public class Conta {
	int id;
	String tipo;
	double saldo;
	double saque;
	double deposito;
	
	public void sacar(double saque) {
		if(saque >= saldo) {
				System.out.println("Saldo insuficiente");
		}else {
			saldo -= saque;
			 System.out.println("Sacado");
			
		}
		 System.out.println(saldo);
	}
	public void depositar(double deposito) {
		saldo += deposito;
	}
	public void exibirConta() {
		System.out.println("ID: " + id);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo: " + saldo);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaque() {
		return saque;
	}
	public void setSaque(double saque) {
		this.saque = saque;
	}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	
	
	
}
