package estanteWeb.model;

public abstract class Produto {
    private float valor;
    private String dataPublicacao, autor, titulo, genero, distribuidora;
    private int numeroPaginas, tipo;


    public Produto(int tipo, float valor, String dataPublicacao, String autor, String titulo, String genero, String distribuidora, int numeroPaginas) {
        this.valor = valor;
        this.dataPublicacao = dataPublicacao;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.distribuidora = distribuidora;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getDistribuidora() {
        return distribuidora;
    }
    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public void visualizar(){
        System.out.println("\n------------------------------");
        switch(this.tipo){
            case 1 ->{
                System.out.println("\nTipo: Livro");
            }
            case 2 ->{
                System.out.println("\nTipo: Manga");
            }
        }
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Data: " + getDataPublicacao());
        System.out.println("Autor: " + getAutor());
        System.out.println("Genero: " + getGenero());
        System.out.println("Numero de Paginas: " + getNumeroPaginas());
        System.out.println("Distribuidora: " + getDistribuidora());
        System.out.println("Valor: " + getValor());

    }

}
