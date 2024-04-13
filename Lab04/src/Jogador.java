
public class Jogador {
	private String nome;
	private float pontuacao;
	
	public Jogador(String aNome, float aPontuacao) {
		nome = aNome;
		pontuacao = aPontuacao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPontuacao() {
		return pontuacao;
	}
	
	public void setNome(String aNome) {
		nome = aNome;
	}
	
	public void setPontuacao(float aPontuacao) {
		pontuacao = aPontuacao;
	}
	
	public void aumentarPont(float aPont) {
		pontuacao += aPont;
	}
	
	@Override 
	public String toString() {
		String res = "Jogador\n";
		res += "Nome: " + nome + "\n";
		res += "Pontuacao: " + pontuacao;
		return res;
	}
	
	public static void main(String[]args) {
		Jogador jogador1 = new Jogador("Cristiano Ronaldo", 7.5f);
		System.out.println(jogador1);
		jogador1.aumentarPont(2.5f);
		System.out.println(jogador1);
		float nota;
		nota = 9.3f;
		System.out.println(nota);
	}
}
