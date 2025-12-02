import java.util.HashSet;

public class ProdutoTeste {

	
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("001", "Mouse", 50.0);
		Produto p2 = new Produto("002", "Teclado", 150.0);
		Produto p3 = new Produto("001", "Mouse Gamer", 250.0); 
		Produto p4 = new Produto("003", "Monitor", 800.0);
		

		HashSet<Produto> produto = new HashSet<>();
		
		produto.add(p1);
		produto.add(p2);
		produto.add(p3);
		produto.add(p4);
		
		for(Produto p: produto) {
			System.out.println(p.getCodigo() + " - " + p.getNome() );
		}
		
		System.out.println("Total no HashSet: " + produto.size());

		
		
	}
}
