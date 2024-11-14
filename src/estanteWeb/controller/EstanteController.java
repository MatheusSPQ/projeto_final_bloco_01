package estanteWeb.controller;

import estanteWeb.model.Livro;
import estanteWeb.model.Produto;
import estanteWeb.repository.EstanteRepository;

import java.util.ArrayList;
import java.util.Optional;

public class EstanteController implements EstanteRepository{
    ArrayList<Produto> listaProdutos = new ArrayList<>();


    @Override
    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
        System.out.println(produto.getTitulo() + " do " + produto.getAutor() + " foi adicionado com sucesso!");

    }

    @Override
    public void alterarProduto(Produto produto, String tituloOriginal){
        var produtoBusca = buscarTitulo(tituloOriginal);
        Optional<Produto> produtoOP = Optional.ofNullable(produtoBusca);
        if (produtoOP.isPresent()) {
            listaProdutos.set(listaProdutos.indexOf(produtoBusca), produto);
            System.out.println(tituloOriginal + " foi alterado com sucesso!");
        }else{
            System.out.println(produto.getTitulo() + " nao foi encontrado");
        }

    }

    @Override
    public void removerProduto(String titulo) {
        var produto = buscarTitulo(titulo);
        Optional<Produto> produtoOP = Optional.ofNullable(produto);
        if (produtoOP.isPresent()) {
            listaProdutos.remove(produtoOP.get());
            System.out.println("\nProduto removido!");
        }else{
            System.out.println(titulo +" nao foi encontrado");
        }

    }

    @Override
    public void listarProdutos() {
        if(listaProdutos.isEmpty()){
            System.out.println("Nenhum produto encontrado");
        }else{
            for(Produto produto : listaProdutos){
                produto.visualizar();
            }
        }

    }

    @Override
    public void listarProdutosEmprestados() {
        int contadorDeEmprestados = 0;
        for(Produto produto : listaProdutos){
            if(produto instanceof Livro){
                Livro livro = (Livro) produto;
                if(livro.getEmprestado()){
                    contadorDeEmprestados++;
                    livro.visualizar();
                }
            }
        }
        if(contadorDeEmprestados == 0){
            System.out.println("Nenhum produto encontrado");
        }

    }

    @Override
    public void emprestarProduto(Produto produto) throws Exception {
        if(produto instanceof Livro){
            Livro livro = (Livro) produto;
            if(!livro.getEmprestado()){
                livro.setEmprestado(true);
            }else{
                throw new Exception(livro.getTitulo() + " ja esta emprestado!");
            }
        }else{
            throw new Exception(produto.getTitulo() + " nao e emprestavel!");
        }

    }

    public Produto buscarTitulo(String titulo){
        for(Produto produto : listaProdutos){
            if(produto.getTitulo().equalsIgnoreCase(titulo)){
                return produto;
            }
        }
        return null;
    }

}
