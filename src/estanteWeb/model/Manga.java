package estanteWeb.model;

public class Manga extends Produto{
    private String artista;

    public Manga(int tipo,float valor, String dataPublicacao, String autor, String titulo, String genero, String distribuidora, int numeroPaginas,String artista) {
        super(tipo, valor,dataPublicacao,autor,titulo,genero,distribuidora,numeroPaginas);
        this.artista = artista;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("Artista: " + artista);
    }
}
