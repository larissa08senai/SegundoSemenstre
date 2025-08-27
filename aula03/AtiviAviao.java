package aula03;

public class AtiviAviao {
 String marca;
 String modelo;
 int lugares;
 String porte;
 public String getMarca() {
	return marca;
 }
 public void setMarca(String marca) {
	this.marca = marca;
 }
 public String getModelo() {
	return modelo;
 }
 public void setModelo(String modelo) {
	this.modelo = modelo;
 }
 public int getLugares() {
	return lugares;
 }
 public void setLugares(int lugares) {
	this.lugares = lugares;
 }
 public String getPorte() {
	return porte;
 }
 public void setPorte(String porte) {
	this.porte = porte;
 }
 public void pousou() {
	 System.out.println("O " + modelo + "esta em solo");
 }
 public void caiu() {
	 System.out.println("O " + modelo + "esta no despencou");
 }
 public void subiu() {
	 System.out.println("O " + modelo + " esta no ceu");
 }
 public void destino() {
	 System.out.println("O " + modelo + "chegou ao destino");
 }

}
