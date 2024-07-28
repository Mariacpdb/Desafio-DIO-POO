# Desafio-DIO-POO
Modelagem e Diagramação de um Componente iPhone


```mermaid
classDiagram
    class iPhone {
        +ReprodutorMusical reprodutorMusical
        +AparelhoTelefonico aparelhoTelefonico
        +Navegador navegador
    }

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
    }

    class AparelhoTelefonico {
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
    }

    class Navegador {
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> Navegador
````
