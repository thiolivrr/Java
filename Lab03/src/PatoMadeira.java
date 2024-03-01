
public class PatoMadeira extends Pato {
	
	public PatoMadeira(String nome, int ano) {
		super(nome, ano);
	}
	
	public void voa() {
		System.out.println("O pato não voa");
	}
	
	public void nada() {
		System.out.println("O pato boia");
	}
	
	public void quack() {
		System.out.println("...");
	}

}