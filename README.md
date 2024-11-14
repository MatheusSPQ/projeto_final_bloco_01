```mermaid
classDiagram
    class Produto {
        <<abstract>>
        double valor
        Date dataPublicacao
        String autor
        int numeroPaginas
        String genero
        +getters/setters()
    }
    
    class Livro {
        String distribuidora
        boolean capaDura
        boolean emprestavel
        String emprestadoEm
        String devolverEm
        +getters/setters()
    }
    
    class Mangas {
        String artista
        String distribuidora
        +getters/setters()
    }
    
    class Estante {
        int numeroDeProdutos
        HashMap~Produto, Integer~ produtos
        +listarEstante()
        +listarEmprestaveis()
        +listarEmprestados()
        +addNaEstante(Produto, int)
        +atualizarEstante(Produto, int)
        +deletarDaEstante(Produto)
        +emprestarProduto(String)
    }
    
    class EstanteRepository {
        <<interface>>
        +listarEstante()
        +listarEmprestaveis()
        +listarEmprestados()
        +addNaEstante(Produto, int)
        +atualizarEstante(Produto, int)
        +deletarDaEstante(Produto)
        +emprestarProduto(String)
    }
    
    Produto <|-- Livro
    Produto <|-- Mangas
    Estante --|> EstanteRepository
    Estante --> Produto : contém
