package aula05;

public class Ferrari implements Veiculos {

	@Override
	public void ligar() {
		System.out.println("ferrari ligada");
		
	}

	@Override
	public void desligar() {
		System.out.println("ferrari desligada");
		
	}

	@Override
	public void manobrar() {
		System.out.println("ferrari manobrando...");
		
	}

	@Override
	public void engatar() {
		System.out.println("ferrari engatada");
		
	}

	@Override
	public void acelerar() {
		System.out.println("ferrari acelerando");
		
	}

	@Override
	public void frear() {
		System.out.println("ferrari freou");
		
	}
	
	

}
