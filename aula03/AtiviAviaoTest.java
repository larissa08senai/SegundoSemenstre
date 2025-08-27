package aula03;

import java.util.Scanner;

public class AtiviAviaoTest {
public static void main(String[] args) {
	AtiviAviao aviao1 = new AtiviAviao();
	AtiviAviao aviao2 = new AtiviAviao();
	AtiviAviao aviao3 = new AtiviAviao();
	AtiviAviao aviao4 = new AtiviAviao();
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Marca: ");
	aviao1.setMarca(ler.next());
	
	System.out.println("Modelo: ");
	aviao1.setModelo(ler.next());
	
	System.out.println("Lugares");
	aviao1.setLugares(ler.nextInt());
	
	System.out.println("Porte: ");
	aviao1.setPorte(ler.next());
	
	//
	System.out.println("Marca: ");
	aviao2.setMarca(ler.next());
	
	System.out.println("Modelo: ");
	aviao2.setModelo(ler.next());
	
	System.out.println("Lugares");
	aviao2.setLugares(ler.nextInt());
	
	System.out.println("Porte: ");
	aviao2.setPorte(ler.next());
	
	//
	System.out.println("Marca: ");
	aviao3.setMarca(ler.next());
	
	System.out.println("Modelo: ");
	aviao3.setModelo(ler.next());
	
	System.out.println("Lugares");
	aviao3.setLugares(ler.nextInt());
	
	System.out.println("Porte: ");
	aviao3.setPorte(ler.next());
	
	//
	System.out.println("Marca: ");
	aviao4.setMarca(ler.next());
	
	System.out.println("Modelo: ");
	aviao4.setModelo(ler.next());
	
	System.out.println("Lugares");
	aviao4.setLugares(ler.nextInt());
	
	System.out.println("Porte: ");
	aviao4.setPorte(ler.next());
	
	// EXIBIÇÃO
	ler.close();
	
	System.out.println(aviao1.getMarca());
	System.out.println(aviao1.getModelo());
	System.out.println(aviao1.getLugares());
	System.out.println(aviao1.getPorte());
	System.out.println();
	
	// NOVO
	
	System.out.println(aviao2.getMarca());
	System.out.println(aviao2.getModelo());
	System.out.println(aviao2.getLugares());
	System.out.println(aviao2.getPorte());
	System.out.println();
	// NOVO
	
	System.out.println(aviao3.getMarca());
	System.out.println(aviao3.getModelo());
	System.out.println(aviao3.getLugares());
	System.out.println(aviao3.getPorte());
	System.out.println();
	// NOVO
	
	System.out.println(aviao4.getMarca());
	System.out.println(aviao4.getModelo());
	System.out.println(aviao4.getLugares());
	System.out.println(aviao4.getPorte());
	System.out.println();
	
	aviao1.pousou();
	aviao2.caiu();
	aviao3.destino();
	aviao4.subiu();
}
}
