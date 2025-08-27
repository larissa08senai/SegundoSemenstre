package aula04;

public class Computador {
	String monitor;
	String marca;
	String mouse;
	String tipo;
	String gabinete;
	


	public String getMonitor() {
		return monitor;
	}


	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getMouse() {
		return mouse;
	}


	public void setMouse(String mouse) {
		this.mouse = mouse;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getGabinete() {
		return gabinete;
	}


	public void setGabinete(String gabinete) {
		this.gabinete = gabinete;
	}
public void exibirComputador() {
		
		System.out.println("Tipo do monitor: " + monitor);
		System.out.println();
		System.out.println("Marca: " + marca);
		System.out.println();
		System.out.println("Tipo do mouse: " + mouse);
		System.out.println();
		System.out.println("Tipo do Gabinete: " + gabinete);
		System.out.println();
		System.out.println("Tipo do computador: " + tipo);
		System.out.println();
		
}

}
