
public class SuperPato extends Pato {
	
	float poder;
	
	public SuperPato(String nome, int ano, float poder) {
		super(nome, ano);
		this.poder = poder;
	}
	
	public void voa() {
		System.out.println("Super Pato voa como um jato de poder "+poder);
	}
	
	public void nada() {
		System.out.println("Super Pato nada como uma submarino de poder "+poder);
	}
	
	public void quack() {
		System.out.println("QUACK");
	}

}