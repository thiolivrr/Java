
public class Main {

	public static void main(String[] args) {
		
		int[] minutos = {10, 15, 20, 50, 2};
		ContaTelefone conta = new ContaTelefone("3542-7489",  minutos);
		System.out.println(conta);
		
		int[] min = {1, 5, 10, 10, 2};
		ContaCelular celular = new ContaCelular("19993062581",  min);
		System.out.println(celular);
	}

}
