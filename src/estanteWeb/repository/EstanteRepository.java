package estanteWeb.repository;

import estanteWeb.model.Produto;

public interface EstanteRepository {

    //crud
    public void adicionarProduto(Produto produto);
    public void alterarProduto(Produto produto, String TituloOriginal);
    public void removerProduto(String titulo);
    public void listarProdutos();

    //especificos
    public void listarProdutosEmprestados();
    public void emprestarProduto(Produto produto) throws Exception;
}
