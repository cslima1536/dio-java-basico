# POO-Desafio 
DIO - Trilha Java Básico- Desafio POO
# iPhone Component

O componente iPhone é uma representação simplificada das funcionalidades de um iPhone, incluindo Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Classes e Interfaces

### `ReprodutorMusical`

Uma interface que define as operações relacionadas à reprodução de música.

- `tocar()`: Inicia a reprodução de música.
- `pausar()`: Pausa a reprodução de música.
- `selecionarMusica()`: Seleciona uma música para reprodução.

### `AparelhoTelefonico`

Uma interface que define as operações relacionadas ao uso do telefone.

- `ligar()`: Inicia uma chamada telefônica.
- `atender()`: Atende uma chamada telefônica.
- `iniciarCorreioVoz()`: Inicia o correio de voz.

### `NavegadorInternet`

Uma interface que define as operações relacionadas à navegação na internet.

- `exibirPagina()`: Exibe uma página no navegador da internet.
- `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página no navegador.

### `iPhone`

Uma classe que implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`, representando um iPhone com suas funcionalidades.

Exemplo de uso:

```java
ReprodutorMusical reprodutor = new iPhone();
reprodutor.tocar();  // Tocando música no reprodutor musical do iPhone.

AparelhoTelefonico telefone = new iPhone();
telefone.ligar();    // Iniciando uma chamada telefônica no iPhone.

NavegadorInternet navegador = new iPhone();
navegador.exibirPagina();  // Exibindo uma página no navegador da Internet do iPhone.
