package metodos;

public class PessoaTest {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("André");
		pessoa1.setPeso(100);
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getPeso());
		
		pessoa1.comer(1);
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getPeso());
	}

}
