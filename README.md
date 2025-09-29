# Estudo de Padrões de Projeto em Java: Observer e Mediator

Este repositório contém a implementação de dois exercícios práticos em Java, projetados para demonstrar o uso e as diferenças entre dois padrões de projeto fundamentais: **Observer** e **Mediator** (implementado como um Gerenciador de Eventos/Event Bus).

## Padrões de Projeto Abordados

-   **Observer**: Define uma dependência um-para-muitos entre objetos, de modo que quando um objeto (o *Subject*) muda de estado, todos os seus dependentes (os *Observers*) são notificados e atualizados automaticamente.
-   **Mediator (Event Bus)**: Define um objeto que encapsula como um conjunto de objetos interage. O Mediator promove o baixo acoplamento ao impedir que os objetos se refiram uns aos outros explicitamente, e permite que suas interações sejam variadas independentemente.

---

## Estrutura do Repositório

O código está organizado em pacotes distintos para cada exercício

```
src/
├── exercicio01/       # Solução usando o Padrão Mediator (Event Bus)
│   ├── Main.java
│   ├── eventos/
│   ├── gerenciador/
│   └── observadores/
│
└── exercicio02/       # Solução usando o Padrão Observer
    ├── Main.java
    ├── model/
    ├── pattern/
    └── observers/
```

---
## Exercício 1: Entrada do Usuário (Padrão Mediator)

Neste cenário, a comunicação é indireta e baseada em diferentes tipos de eventos. Os componentes não se conhecem, e cada observador está interessado em um tipo de evento específico.

### Problema

Crie um programa que lê uma entrada do usuário.
-   Se ele digitar "SIM", deve ser lançado um evento do tipo `DigitouSim`.
-   Se digitar "NÃO", deve ser lançado um evento do tipo `DigitouNao`.
-   Se digitar outra coisa, deve ser lançado um evento do tipo `DigitouOutraCoisa`.

Devem existir 3 observadores, e cada um deve reagir **apenas ao seu evento de interesse**.

### Solução e Padrão Aplicado

Foi utilizado o **Padrão Mediator**, implementado como um **Gerenciador de Eventos** que internamente usa o Padrão Observer.

Este padrão foi a melhor escolha, pois promove um **desacoplamento total** entre os componentes e transfere a responsabilidade de roteamento e filtragem para o mediador.

---
## Exercício 2: Nota do Aluno (Padrão Observer)

Neste exercício, a comunicação é direta: um estado muda e todos os interessados são notificados para reagir à *mesma* mudança de estado.

### Problema

Crie um programa que lê a nota de um aluno.
-   Se o aluno for **aprovado**, o objeto `Pais` irá dar parabéns.
-   Se o aluno ficar em **recuperação**, o objeto `Professor` exibe que está preparando a prova.
-   Se o aluno for **reprovado**, o objeto `Coordenador` exibe uma mensagem de rematrícula.

### Solução e Padrão Aplicado

Foi utilizado o **Padrão Observer**.

-   **Subject (Sujeito):** A classe `Aluno` é o sujeito observado. Ela mantém uma lista de seus observadores e os notifica quando sua nota (estado) é alterada.
-   **Observers (Observadores):** As classes `Pais`, `Professor` e `Coordenador` são os observadores. Elas implementam uma interface `Observer` e reagem à notificação, filtrando internamente se a mudança de estado lhes interessa.

Este padrão foi ideal aqui porque a relação entre o `Aluno` e seus observadores é direta e bem definida.