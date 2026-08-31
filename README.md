# CinePrisma 🎬

Sistema de compra de ingressos de cinema em Java, rodando via terminal (sem frontend).

## Sobre o projeto

O CinePrisma simula o fluxo completo de compra de ingressos de um cinema: cadastro do cliente, escolha de filme e sessão, seleção de assentos em um mapa visual da sala e definição do tipo de ingresso, finalizando com um resumo da compra.

## Funcionalidades

- **Cadastro do cliente** — nome, idade e CPF, com validação de formato
- **Filmes em cartaz** — lista de filmes disponíveis com sinopse e classificação
- **Sessões** — escolha de dia (hoje ou dias da semana) e horário
- **Seleção de assentos** — mapa visual da sala (fileiras A–H, colunas 1–12), com controle de assentos ocupados, incluindo sessões VIP e 3D
- **Tipos de ingresso** — entrada, criança, idoso e estudante, cada um com valor próprio
- **Resumo final** — exibe filme, sessão, assentos escolhidos e valor total da compra

## Estrutura do projeto

```
cinePrisma/
└── src/
    ├── Main                    # ponto de entrada e menu principal
    ├── cadastroCliente         # leitura e validação dos dados do cliente
    ├── filmesEmCartaz          # exibição e seleção de filmes
    ├── sessoes                 # seleção de dia e horário de sessão
    ├── assentos                # mapa de assentos (sessão padrão)
    ├── assentos3D               # mapa de assentos (sessão 3D)
    ├── assentosVip              # mapa de assentos (sessão VIP)
    ├── quantidadeIngresso       # seleção de tipos de ingresso (padrão)
    ├── quantidadeIngresso3D     # seleção de tipos de ingresso (3D)
    ├── quantidadeIngressoVIP    # seleção de tipos de ingresso (VIP)
    └── mensagemFinal            # resumo final da compra
```

## Tecnologias

- Java 21
- Aplicação de terminal (sem dependências externas)

## Como executar

1. Compile as classes dentro de `Sistema-de-cinema---Java21/cinePrisma/src`
2. Execute a classe `Main`
3. Siga as instruções exibidas no terminal

## Tratamento de erros

O projeto passou por uma revisão de tratamento de erros nas entradas do usuário, garantindo que:

- Leituras numéricas sejam validadas por regex antes da conversão (evitando `InputMismatchException`)
- Opções de menu inválidas sejam tratadas com mensagens claras, sem derrubar o programa
- Fluxos de navegação (como a opção "Voltar") funcionem conforme anunciado na tela

Classes revisadas: `cadastroCliente`, `filmesEmCartaz`, `sessoes`, `mensagemFinal` e `Main`.

## Autores

Alessandro Wesley, Arthur Gomes, Eryck Paiva, Felipe Augusto, Samuel Borba, Tiago Gondim e Yan Felipe.