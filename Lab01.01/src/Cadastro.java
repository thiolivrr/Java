
public class Cadastro {
	Nome nome;
	Endereco endereco;
	
	public Cadastro(Nome aNome, Endereco aEndereco) {
		nome = aNome;
		endereco = aEndereco;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += this.nome + "\n" + this.endereco;
		return res;
	}
	
}
