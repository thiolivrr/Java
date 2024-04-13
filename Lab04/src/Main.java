import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
    	Autor chico = new Autor("Chico");
    	Autor joe = new Autor("Joe");
    	ArrayList<Autor> autores = new ArrayList<Autor>();
    	autores.add(chico);
    	autores.add(joe);
    	for (int i = 0; i < autores.size(); i++) {
    		System.out.println(autores.get(i).getNome());
    	}	
 
    }
}
