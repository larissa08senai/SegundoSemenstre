package aula02;

import java.util.ArrayList;
import java.util.Scanner;

public class RevisaoArray {
 public static void main(String[] args) {
	 ArrayList<Double> valores = new ArrayList<Double>();
	 
	 Scanner ler = new Scanner(System.in);
	
	 System.out.println("informe valores ou digite 999 para calcular: ");
	 double dados = ler.nextDouble();
	 
	 dados != 999 ? valores.add(dados) : System.out.println(valores);
	 
	
	
	 
	 
	 
	 
 }
}
