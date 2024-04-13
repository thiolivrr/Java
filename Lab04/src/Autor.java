class Autor {
    private String nome;

    public Autor(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String aNome) {
    	nome = aNome;
    }

    @Override
    public String toString() {
        return "Autor: " + this.nome;
    }

    public static void main(String[] args) {
        Autor autor = new Autor("GRRM");
        autor.setNome("Acastus");
        System.out.println(autor);
    }
}

