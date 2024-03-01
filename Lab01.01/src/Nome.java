public class Nome {
	String primeiroNome;
	String sobrenome;

	public Nome(String aPrimeiroNome, String aSobrenome) {
		this.primeiroNome = aPrimeiroNome;
		this.sobrenome = aSobrenome;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += this.primeiroNome + " " + this.sobrenome;
		return res;
	}

}
