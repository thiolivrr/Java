public class Publicacao {
    private String titulo;
    private int codigo;
    private int numero_de_paginas;
    private float custo;

    public String getTitulo() {
        return titulo;
    }

    public Publicacao(String titulo, int codigo, int numero_de_paginas, float custo) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.numero_de_paginas = numero_de_paginas;
        this.custo = 24;
    }
    
    @Override
	public String toString() {
    	String res = "";
    	res += "Titulo: " + titulo + "\n";
    	res += "Código: " + codigo+ "\n";
    	res += "Páginas: " + numero_de_paginas+ "\n";
    	res += "Custo: " + custo;
    	return res;
    }
}
