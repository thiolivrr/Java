
public class Livro {
	private String nome;
	private Autor autor;
	
	public Livro(String aNome, Autor autor) {
		this.nome = aNome;
		this.autor = autor;
	}
	
	public String getNomeDoLivro() {
		return nome;
	}
	
	public String getNomeDoAutor() {
		return autor.getNome();
	}
	
	@Override
	public String toString() {
		return "Livro: " + nome + "\n" + "Autor: " + autor.getNome();
	}
	
	public static void main(String[]args) {
		Livro ladraoDeRaios = new Livro("Percy Jackson", new Autor("Rick Riordian"));
		System.out.println(ladraoDeRaios);
	}
	
}
