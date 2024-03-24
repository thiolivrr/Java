import java.util.Scanner;

public class Main {
    public static void main(String [] args){
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Digite o título da publicação: ");
    	String titulo = scanner.nextLine();
    	System.out.println("Digite o código da publicação: ");
    	int codigo = scanner.nextInt();
    	System.out.println("Digite o numero de páginas da publicação: ");
    	int paginas = scanner.nextInt();
    	
        Publicacao publicacao = new Publicacao(titulo, codigo, paginas, 9.756785f);
        System.out.println(publicacao);
        scanner.close(); 
    }
}
