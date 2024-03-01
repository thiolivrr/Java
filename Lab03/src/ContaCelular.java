
public class ContaCelular extends ContaTelefone {
	
	public ContaCelular(String numero, int[] minutos) {
		super(numero, minutos);
	}
	
	@Override
	public double getValor() {
		if (this.getTotalMinutos() <= 60) {
			double conta = 1.2 * this.getTotalMinutos();
			return conta;
		} else {
			double conta = 1.4 * this.getTotalMinutos();
			return conta;
		}
	}
}
