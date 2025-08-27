package aula04;

public class CadeiraTest {
	public static void main(String[] args) {
		Cadeira cadeira1 = new Cadeira();
		
		cadeira1.setEstofamento("Em Couro");
		cadeira1.setCor("Preta");
		cadeira1.setBraco(2);
		cadeira1.setTipo("Escritório");
		
		System.out.println("Estofamento: ");
		System.out.println(cadeira1.getEstofamento());
		System.out.println();
		
		System.out.println("Cor: ");
		System.out.println(cadeira1.getCor());
		System.out.println();
		System.out.println("Numero de Braços: ");
		System.out.println(cadeira1.getBraco());
		System.out.println();
		System.out.println("Tipo de Cadeira:");
		System.out.println(cadeira1.getTipo());
	}

}
