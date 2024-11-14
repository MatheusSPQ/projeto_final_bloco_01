package estanteWeb;

import estanteWeb.controller.EstanteController;
import estanteWeb.model.Livro;
import estanteWeb.model.Manga;
import estanteWeb.model.Produto;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numeroPaginas, opcao,tipo;
        String autor, titulo, genero, dataPublicacao, artista,distribuidora;
        float valor;
        boolean emprestavel,capaDura,emprestado;

        EstanteController estante = new EstanteController();
        Livro l1 = new Livro(1,120,"12/12/2024","Carlos Bom","Aqueles que atrasam","Drama","Generation",240,true,true,true);
        estante.adicionarProduto(l1);
        Manga m1 = new Manga(2,24,"10/10/2012","Naomi","Cheguei atrasado para o isekai da minha turma","Aventura","Panini",30,"Matheus-san");
        estante.adicionarProduto(m1);
        estante.listarProdutos();
        estante.listarProdutosEmprestados();




        while (true){
            System.out.println("\n*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                      ESTANTE WEB                    ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Adicionar Produto                    ");
            System.out.println("            2 - Listar todas os Produtos             ");
            System.out.println("            3 - Listar todas os Produtos Emprestados ");
            System.out.println("            4 - Buscar Produto por Titulo            ");
            System.out.println("            5 - Atualizar Produto                    ");
            System.out.println("            6 - Apagar Produto                       ");
            System.out.println("            7 - Emprestar Produto                    ");
            System.out.println("            0 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");
            opcao = leia.nextInt();

            switch (opcao){
                case 0 -> {
                    System.exit(0);
                }
                case 1 -> {
                    System.out.println("\n Adicionar Produto!");
                    System.out.println("Digite o tipo de produto 1-Livro, 2-Manga");
                    leia.skip("\\R?");
                    tipo = leia.nextInt();
                    System.out.println("Digite o titulo do produto: ");
                    leia.skip("\\R?");
                    titulo = leia.nextLine();
                    System.out.println("Digite o data do produto EX(DD/MM/YYYY): ");
                    leia.skip("\\R?");
                    dataPublicacao = leia.nextLine();
                    System.out.println("Digite o numero de paginas: ");
                    numeroPaginas = leia.nextInt();
                    System.out.println("Digite o genero do produto");
                    genero = leia.next();
                    System.out.println("Digite a distribuidor do produto: ");
                    leia.skip("\\R?");
                    distribuidora = leia.nextLine();
                    System.out.println("Digite o valor da produto: ");
                    valor = leia.nextFloat();
                    System.out.println("Digite o autor do produto: ");
                    leia.skip("\\R?");
                    autor = leia.nextLine();
                    switch (tipo){
                        case 1 -> {
                            System.out.println("Digite se o livro e capa dura (true/false): ");
                            capaDura = leia.nextBoolean();
                            System.out.println("Digite se o livro e emprestavel (true/false): ");
                            emprestavel = leia.nextBoolean();
                            emprestado = false;
                            estante.adicionarProduto(new Livro(tipo,valor,dataPublicacao,autor,titulo,genero,distribuidora,numeroPaginas,capaDura,emprestavel,emprestado));
                        }
                        case 2 -> {
                            System.out.println("Digite o artista do manga: ");
                            leia.skip("\\R?");
                            artista = leia.nextLine();
                            estante.adicionarProduto(new Manga(tipo,valor,dataPublicacao,autor,titulo,genero,distribuidora,numeroPaginas,artista));
                        }
                    }
                    System.out.println("\n-Produto adicionado com sucesso!");
                    keyPress();

                }
                case 2 -> {
                    System.out.println("\n-Listar todas os Produtos");
                    estante.listarProdutos();
                    keyPress();


                }
                case 3 -> {
                    System.out.println("\n-Listar todas os Produtos Emprestados ");
                    estante.listarProdutosEmprestados();
                    keyPress();
                }
                case 4 -> {
                    System.out.println("\n Buscar Produto por Titulo");

                    System.out.println("Digite o titulo do produto: ");
                    leia.skip("\\R?");
                    titulo = leia.nextLine();
                    Optional<Produto> produtoOp = Optional.ofNullable(estante.buscarTitulo(titulo));
                    if(produtoOp.isPresent()){
                        produtoOp.get().visualizar();
                    }else{
                        System.out.println("Produto não encontrado");
                    }
                }
                case 5 -> {
                    System.out.println("\n Atualizar Produto");

                    System.out.println("Digite o titulo do produto: ");
                    leia.skip("\\R?");
                    titulo = leia.nextLine();

                    Produto produto = estante.buscarTitulo(titulo);
                    if(produto != null){

                        System.out.println("Digite o novo titulo:");
                        leia.skip("\\R?");
                        String novoTitulo = leia.nextLine();
                        System.out.println("Digite o tipo de produto 1-Livro, 2-Manga");
                        tipo = leia.nextInt();
                        System.out.println("Digite o data do produto EX(DD/MM/YYYY): ");
                        leia.skip("\\R?");
                        dataPublicacao = leia.nextLine();
                        System.out.println("Digite o numero de paginas: ");
                        numeroPaginas = leia.nextInt();
                        System.out.println("Digite o genero do produto");
                        genero = leia.next();
                        System.out.println("Digite a distribuidor do produto: ");
                        leia.skip("\\R?");
                        distribuidora = leia.nextLine();
                        System.out.println("Digite o valor da produto: ");
                        valor = leia.nextFloat();
                        System.out.println("Digite o autor do produto: ");
                        leia.skip("\\R?");
                        autor = leia.nextLine();
                        switch (tipo){
                            case 1 -> {
                                System.out.println("Digite se o livro e capa dura (true/false): ");
                                capaDura = leia.nextBoolean();
                                System.out.println("Digite se o livro e emprestavel (true/false): ");
                                emprestavel = leia.nextBoolean();
                                emprestado = false;
                                estante.alterarProduto(new Livro(tipo,valor,dataPublicacao,autor,novoTitulo,genero,distribuidora,numeroPaginas,capaDura,emprestavel,emprestado),titulo);
                            }
                            case 2 -> {
                                System.out.println("Digite o artista do manga: ");
                                artista = leia.nextLine();
                                estante.alterarProduto(new Manga(tipo,valor,dataPublicacao,autor,novoTitulo,genero,distribuidora,numeroPaginas,artista),titulo);
                            }
                        }
                    }else{
                        System.out.println("Produto não encontrado!");
                    }

                    keyPress();
                }
                case 6 -> {
                    System.out.println("\n Apagar Produto");
                    System.out.println("Digite o titulo do produto: ");
                    leia.skip("\\R?");
                    titulo = leia.nextLine();

                    estante.removerProduto(titulo);
                    keyPress();

                }
                case 7 -> {
                    System.out.println("\n-Emprestar Produto");

                    System.out.println("Digite o titulo do produto: ");
                    leia.skip("\\R?");
                    titulo = leia.nextLine();
                    Produto produto = estante.buscarTitulo(titulo);
                    if(produto != null){
                        try {
                            estante.emprestarProduto(produto);

                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }else{
                        System.out.println("Produto não encontrado");
                    }

                    keyPress();

                }

            }

        }

    }

    public static void keyPress(){
        try {

            System.out.println("\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");

        }

    }
}