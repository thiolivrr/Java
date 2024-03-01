
public class Funcionario {
	private String id;
	private String nome;
	private double salario;
	
	public Funcionario(String aId, String aNome, double aSalario) {
		id = aId;
		nome = aNome;
		salario = aSalario;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double aSalario) {
		salario = aSalario;
	}
	
	public void aumentaSalarioPorcentagem(double umPorcento) {
		salario = salario + (salario * umPorcento) / 100;
	}
	
	public void aumentaSalarioExato(double valor) {
		salario = salario + valor;
	}
	
	@Override public String toString() {
		String res = "";
		res += "ID: "+id+"\nNome: "+nome+"\nSalario: "+salario;
		return res;
	}
	
}


