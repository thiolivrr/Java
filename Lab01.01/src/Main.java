
public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("G7695H4", new Nome("Thiago", "Sousa"), 9.9, 9.1);
		Cadastro thiago = new Cadastro(new Nome("Thiago", "Sousa"), new Endereco("Rua Arthur Biancalana Filho", 92));
		Boletim jao = new Boletim(9.1, 9.0);
		System.out.println(jao.media());
		System.out.println(jao.passou());
		System.out.println(jao);
	}

}
