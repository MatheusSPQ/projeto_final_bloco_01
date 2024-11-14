package estanteWeb.model;

public class Livro extends Produto {
    private boolean capaDura;
    private boolean emprestavel;
    private boolean emprestado;

    public Livro(int tipo, float valor, String dataPublicacao, String autor, String titulo, String genero,
                 String distribuidora, int numeroPaginas, boolean capaDura, boolean emprestavel, boolean emprestado) {
        super(tipo, valor,dataPublicacao, autor, titulo, genero, distribuidora, numeroPaginas);
        this.capaDura = capaDura;
        this.emprestavel = emprestavel;
        this.emprestado = emprestado;
    }



    public boolean isCapaDura() {
        return this.capaDura;
    }

    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }

    public boolean isEmprestavel() {
        return this.emprestavel;
    }

    public void setEmprestavel(boolean emprestavel) {
        this.emprestavel = emprestavel;
    }


    public boolean getEmprestado() {
        return this.emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("Capa de dura: "+capaDura);
        System.out.println("Emprestavel: "+emprestavel);
        System.out.println("Emprestado: "+emprestado);

    }

}
