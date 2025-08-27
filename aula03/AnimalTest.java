package aula03;

public class AnimalTest {
public static void main(String[] args) {
	Animais bicho1 = new Animais();
	Animais bicho2 = new Animais();
	Animais bicho3 = new Animais();
	Animais bicho4 = new Animais();	
	Animais bicho5 = new Animais();
	Animais bicho6 = new Animais();
	Animais bicho7 = new Animais();	
	Animais bicho8 = new Animais();
	Animais bicho9 = new Animais();
	
	bicho1.setNome("Vaca");
	bicho1.setPeso("500 Kg");
	bicho1.setIdade(6);
	bicho1.setCor("Malhada");
	
	//NOVO
	bicho2.setNome("Bezerro");
	bicho2.setPeso("2 Kg");
	bicho2.setIdade(1);
	bicho2.setCor("Malhado");
	
	//NOVO
	bicho3.setNome("Carneiro");
	bicho3.setPeso("2,5 Kg");
	bicho3.setIdade(2);
	bicho3.setCor("Off-White");
	
	//NOVO
	bicho4.setNome("Cachorrinho");
	bicho4.setPeso("0,5 Kg");
	bicho4.setIdade(2);
	bicho4.setCor("Castanho Mesclado");
	
	//NOVO
	bicho5.setNome("Lebrete jovem");
	bicho5.setPeso("1 Kg");
	bicho5.setIdade(0);
	bicho5.setCor("Castanho Claro");
	
	//NOVO
	bicho6.setNome("Coelho");
	bicho6.setPeso("3 Kg");
	bicho6.setIdade(3);
	bicho6.setCor("Castanho");
	
	//NOVO
	bicho7.setNome("Lambar");
	bicho7.setPeso("0,5 Kg");
	bicho7.setIdade(0);
	bicho7.setCor("Castanho claro");
	
	//NOVO
	bicho8.setNome("Pintinho");
	bicho8.setPeso("0,2 Kg");
	bicho8.setIdade(0);
	bicho8.setCor("Amarelo");
	
	//NOVO
	bicho9.setNome("Galinha");
	bicho9.setPeso("3 Kg");
	bicho9.setIdade(3);
	bicho9.setCor("Branca");
	
	System.out.println(bicho1.getNome());
	System.out.println(bicho1.getPeso());
	System.out.println(bicho1.getIdade());
	System.out.println(bicho1.getCor());
    System.out.println();
	
	//NOVO
    System.out.println(bicho2.getNome());
    System.out.println(bicho2.getPeso());
    System.out.println(bicho2.getIdade());
    System.out.println(bicho2.getCor());
    System.out.println();
    
    //NOVO
    System.out.println(bicho3.getNome());
    System.out.println(bicho3.getPeso());
    System.out.println(bicho3.getIdade());
    System.out.println(bicho3.getCor());
    System.out.println();
    
    //NOVO
    System.out.println(bicho4.getNome());
    System.out.println(bicho4.getPeso());
    System.out.println(bicho4.getIdade());
    System.out.println(bicho4.getCor());
    System.out.println();
    
    //NOVO
    System.out.println(bicho5.getNome());
    System.out.println(bicho5.getPeso());
    System.out.println(bicho5.getIdade());
    System.out.println(bicho5.getCor());
    System.out.println();
    
    //NOVO
    System.out.println(bicho6.getNome());
    System.out.println(bicho6.getPeso());
    System.out.println(bicho6.getIdade());
    System.out.println(bicho6.getCor());
    System.out.println();
    
    //NOVO
    System.out.println(bicho7.getNome());
    System.out.println(bicho7.getPeso());
    System.out.println(bicho7.getIdade());
    System.out.println(bicho7.getCor());
    System.out.println();
    
    //NOVO
    System.out.println(bicho8.getNome());
    System.out.println(bicho8.getPeso());
    System.out.println(bicho8.getIdade());
    System.out.println(bicho8.getCor());
    System.out.println();
    
    //NOVO
    System.out.println(bicho9.getNome());
    System.out.println(bicho9.getPeso());
    System.out.println(bicho9.getIdade());
    System.out.println(bicho9.getCor());
    System.out.println();
    
    //NOVO
	
	bicho1.andando();
	bicho2.comer();
	bicho3.emitirSom( );
	bicho4.dormir();
}
}
