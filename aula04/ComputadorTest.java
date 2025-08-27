package aula04;

public class ComputadorTest {
	public static void main(String[] args) {
		
	Computador computador1 = new Computador();
	
	computador1.setMonitor("Led");
	computador1.setMarca("Dell");
	computador1.setMouse("Sem fio");
	computador1.setTipo("Escritorio");
	computador1.setGabinete("Simples");
	
	computador1.exibirComputador();
	computador1.ligar();
	computador1.hack();
	computador1.virus();
	computador1.desligado();
	}
 
}
