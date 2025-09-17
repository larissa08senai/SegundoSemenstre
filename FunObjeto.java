package aula05;

import java.util.Scanner;

public class FunObjeto {
	public static void main(String[] args) {
		Funcionario f1 = new FunJornada(1," ddd", "8476-7878" , 9 , "novb", 0, 0) ;
		Funcionario f2 = new FunHorista(2 , "cvv" , "54645-477",  5 , "bwbRT", 0, 0 ) ; 
		Funcionario f3 = new FunPessJuri(3, "hah", "494615-1654", 6, "wnmm", 0.0 , 0.0) ;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informações de Jornada:");
		
		System.out.println(f1.calcularSalario());
		
		//
		System.out.println("informações de Horista:");
		
		System.out.println(f2.calcularSalario());
		//
		System.out.println("informações de PJ:");
		
		
		System.out.println(f3.calcularSalario());
	
		
		ler.close();
		
	}
}
