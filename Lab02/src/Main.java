
public class Main {

	public static void main(String[] args) {
		Funcionario worker = new Funcionario("01", "Joe Doe", 1220);
		worker.aumentaSalarioPorcentagem(82.5);
		System.out.println(worker);
		worker.aumentaSalarioExato(100);
		System.out.println(worker);
	}
	
}
