package estanteWeb;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numeroPaginas, opcao;
        String autor, titulo, genero, dataPublicacao, artista,distribuidora,emprestadoEm,devolverEm;
        float valor;
        boolean emprestavel,capaDura;

        while (true){
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                      ESTANTE WEB                    ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Adicionar Produto                    ");
            System.out.println("            2 - Listar todas os Produtos             ");
            System.out.println("            3 - Listar todas os Produtos Emprestados ");
            System.out.println("            4 - Listar todas os Produtos Emprestaveis");
            System.out.println("            5 - Buscar Produto por Titulo            ");
            System.out.println("            6 - Atualizar Produto                    ");
            System.out.println("            7 - Apagar Produto                       ");
            System.out.println("            8 - Retirar Produto                      ");
            System.out.println("            9 - Emprestar Produto                    ");
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

            }

        }

    }
}