import java.util.Objects;

public class Produto {

	private String codigo;
	private String nome;
	private double preco;
	
	
	public Produto(String codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigo, other.codigo);
	}

	public String getCodigo() {
		return codigo;
	}


	public String getNome() {
		return nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}