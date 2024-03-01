public class Endereco {
	String rua;
	int numero;
	
	public Endereco(String aRua, int aNumero) {
		rua = aRua;
		numero = aNumero;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += this.rua + ", " + this.numero;
		return res;
	}
}
