package estanteWeb.model;

public class Livro extends Produto {
    private boolean capaDura, emprestavel;
    private String emprestadoEm,devolverEm;

    public Livro(float valor, String dataPublicacao, String autor, String titulo, String genero,
                 String distribuidora, int numeroPaginas, boolean capaDura, boolean emprestavel, String devolverEm, String emprestadoEm,int tipo) {
        super(tipo, valor,dataPublicacao, autor, titulo, genero, distribuidora, numeroPaginas);
        this.capaDura = capaDura;
        this.emprestavel = emprestavel;
        this.devolverEm = devolverEm;
        this.emprestadoEm = emprestadoEm;
    }

    public Livro(int tipo, float valor, String dataPublicacao, String autor, String titulo, String genero,
                 String distribuidora, int numeroPaginas, boolean capaDura, boolean emprestavel) {
        super(tipo, valor,dataPublicacao, autor, titulo, genero, distribuidora, numeroPaginas);
        this.capaDura = capaDura;
        this.emprestavel = emprestavel;
    }



    public boolean isCapaDura() {
        return capaDura;
    }

    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }

    public boolean isEmprestavel() {
        return emprestavel;
    }

    public void setEmprestavel(boolean emprestavel) {
        this.emprestavel = emprestavel;
    }

    public String getEmprestadoEm() {
        return emprestadoEm;
    }

    public void setEmprestadoEm(String emprestadoEm) {
        this.emprestadoEm = emprestadoEm;
    }

    public String getDevolverEm() {
        return devolverEm;
    }

    public void setDevolverEm(String devolverEm) {
        this.devolverEm = devolverEm;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("Capa de dura: "+capaDura);
        System.out.println("Emprestavel: "+emprestavel);
        if(emprestadoEm != null){
            System.out.println("Emprestado em: "+emprestadoEm);
            System.out.println("Devolver em: "+devolverEm);
        }

    }
}
