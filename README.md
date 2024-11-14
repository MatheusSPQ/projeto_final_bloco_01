```mermaid
classDiagram
    class Produto {
        <<abstract>>
        float valor
        Date dataPublicacao
        String autor, titulo
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
    
    class EstanteController {
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
    EstanteRepository <|.. EstanteController
    
