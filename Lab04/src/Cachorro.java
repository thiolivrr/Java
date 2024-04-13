
public class Cachorro extends Animal {
	String nome;
	
	public Cachorro(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void sound() {
		System.out.println(nome + " rosna!");
	}
	
	public static void main(String[]args) {
		Cachorro cachorro1 = new Cachorro("Barney");
		cachorro1.sound();
	}
}
