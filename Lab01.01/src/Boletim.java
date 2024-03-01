public class Boletim {
	double notaNP1;
	double notaNP2;
	
	public Boletim(double aNotaNP1, double aNotaNP2) {
		notaNP1 = aNotaNP1;
		notaNP2 = aNotaNP2;
	}
	
	public double media() {
		return (this.notaNP1 + this.notaNP2)/2.0;
	}
	
	public boolean passou() {
		return this.media() > 7;
	}
	
	@Override
	public String toString(){
	  String res = "";
	  res += "Boletim \n";
	  res += "NP1: "+this.notaNP1+"\n";
	  res += "NP2: "+this.notaNP2+"\n";
	  res += "Media: "+this.media()+"\n";
	  return res;
	}
}
