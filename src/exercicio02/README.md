# Exercício 2: Nota do Aluno (Padrão Observer)

Neste exercício, a comunicação é direta: um estado muda e todos os interessados são notificados para reagir à *mesma* mudança de estado.

## Problema

Crie um programa que lê a nota de um aluno.
-   Se o aluno for **aprovado**, o objeto `Pais` irá dar parabéns.
-   Se o aluno ficar em **recuperação**, o objeto `Professor` exibe que está preparando a prova.
-   Se o aluno for **reprovado**, o objeto `Coordenador` exibe uma mensagem de rematrícula.

## Solução e Padrão Aplicado

Foi utilizado o **Padrão Observer**.

-   **Subject (Sujeito):** A classe `Aluno` é o sujeito observado. Ela mantém uma lista de seus observadores e os notifica quando sua nota (estado) é alterada.
-   **Observers (Observadores):** As classes `Pais`, `Professor` e `Coordenador` são os observadores. Elas implementam uma interface `Observer` e reagem à notificação, filtrando internamente se a mudança de estado lhes interessa.

Este padrão foi ideal aqui porque a relação entre o `Aluno` e seus observadores é direta e bem definida.