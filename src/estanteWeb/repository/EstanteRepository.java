package estanteWeb.repository;

import estanteWeb.model.Produto;

public interface EstanteRepository {

    //crud
    public void adicionarProduto(Produto produto);
    public void alterarProduto(Produto produto);
    public void removerProduto(Produto produto);
    public void listarProdutos();

    //especificos
    public void listarProdutosEmprestados();
    public void emprestarProduto(Produto produto);
}
