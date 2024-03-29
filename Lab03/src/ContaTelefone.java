
public class ContaTelefone {
	String numero;
	int[] minutos;
	
	public ContaTelefone(String numero, int[] minutos) {
		this.numero = numero;
		this.minutos = minutos;
	}
	
	public int getTotalMinutos() {
		int total = 0;
        for (int minuto : minutos) {
            total += minuto;
        }
        return total;
	}
	
	public double getValor() {
		if (this.getTotalMinutos() <= 30) {
			double conta = 0.6 * this.getTotalMinutos();
			return conta;
		} else {
			double conta = 0.8 * this.getTotalMinutos();
			return conta;
		}
	}
	
	@Override public String toString() {
		String res = "";
		res += "Conta:\n";
		res += "Ligacoes: ";
		int i = this.minutos.length;
		for (int minuto : this.minutos) {
			 if (i == 1) {
				 res+=minuto+".";
			 } else {
				 res+=minuto+",";
			 }
			 i--;
        }
		res += "\nTotal de minutos: "+this.getTotalMinutos() + "\n";
		res += "Valor total: "+this.getValor() + "\n";
		return res;
	}
}
