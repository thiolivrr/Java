
public class Aluno {
	String ra;
	Nome nome;
	double notaNP1;
	double notaNP2;
	
	public Aluno(String aRa, Nome aNome, double aNotaNP1, double aNotaNP2) {
		ra = aRa;
		nome = aNome;
		notaNP1 = aNotaNP1;
		notaNP2 = aNotaNP2;
	}
	
	public void relatorio() {
		System.out.println(this);
		if ((notaNP1 + notaNP2) / 2  > 7 ) {
			System.out.println("O aluno passou");
		} else {
			System.out.println("O aluno não passou");
		}
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Nome: " + this.nome + "\n";
		res += "RA: " + this.ra + "\n";
		res += "NotaNP1: " + this.notaNP1 + "\n";
		res += "NotaNP2: " + this.notaNP2;
		return res;
	}
}

