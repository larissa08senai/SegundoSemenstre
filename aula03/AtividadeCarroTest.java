package aula03;

import java.util.Scanner;

public class AtividadeCarroTest {
public static void main(String[] args) {
	AtividadeCarro carro1 = new AtividadeCarro() ;
	AtividadeCarro carro2 = new AtividadeCarro() ;
	AtividadeCarro carro3 = new AtividadeCarro() ;
	AtividadeCarro carro4 = new AtividadeCarro() ;
	
	Scanner ler  = new Scanner(System.in);
	
	System.out.println("Marca: ");
	carro1.setMarca(ler.next());
	
    System.out.println("Modelo: ");
	carro1.setModelo(ler.next());
	
	System.out.println("Capacidade: ");
	carro1.setCapacidade(ler.next());
	
	System.out.println("Placa: ");
	carro1.setPlaca(ler.next());
	
	//NOVO CARRO
	System.out.println("Marca: ");
	carro2.setMarca(ler.next());
	
	System.out.println("Modelo: ");
	carro2.setModelo(ler.next());
	
	System.out.println("Capacidade: ");
	carro2.setCapacidade(ler.next());
	
	System.out.println("Placa: ");
	carro2.setPlaca(ler.next());
	
	//NOVO CARRO
	System.out.println("Marca: ");
	carro3.setMarca(ler.next());
	
	System.out.println("Modelo: ");
	carro3.setModelo(ler.next());
	
	System.out.println("Capacidade: ");
	carro3.setCapacidade(ler.next());
	
	System.out.println("Placa: ");
	carro3.setPlaca(ler.next());
	
	//NOVO CARRO
	System.out.println("Marca: ");
	carro4.setMarca(ler.next());
	
	System.out.println("Modelo: ");
	carro4.setModelo(ler.next());
	
	System.out.println("Capacidade: ");
	carro4.setCapacidade(ler.next());
	
	System.out.println("Placa: ");
	carro4.setPlaca(ler.next());
	
	//EXIBIÇÃO
	ler.close();
	
	System.out.println(carro1.getMarca());
	System.out.println(carro1.getModelo());
	System.out.println(carro1.getCapacidade());
	System.out.println(carro1.getPlaca());
	System.out.println();
	//CARRO NEXT
	System.out.println(carro2.getMarca());
	System.out.println(carro2.getModelo());
	System.out.println(carro2.getCapacidade());
	System.out.println(carro2.getPlaca());
	System.out.println();
	//CARRO NEXT
	System.out.println(carro3.getMarca());
	System.out.println(carro3.getModelo());
	System.out.println(carro3.getCapacidade());
	System.out.println(carro3.getPlaca());
	System.out.println();
	//CARRO NEXT
	System.out.println(carro4.getMarca());
	System.out.println(carro4.getModelo());
	System.out.println(carro4.getCapacidade());
	System.out.println(carro4.getPlaca());
	System.out.println();
	
	carro1.acelerar();
	carro2.morreu();
	carro3.desligado();
	carro4.ligar();
	
}
}
