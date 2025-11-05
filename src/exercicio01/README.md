# Exercício 1: Entrada do Usuário (Padrão Mediator)

## Problema

Crie um programa que lê uma entrada do usuário.
-   Se ele digitar "SIM", deve ser lançado um evento do tipo `DigitouSim`.
-   Se digitar "NÃO", deve ser lançado um evento do tipo `DigitouNao`.
-   Se digitar outra coisa, deve ser lançado um evento do tipo `DigitouOutraCoisa`.

Devem existir 3 observadores, e cada um deve reagir **apenas ao seu evento de interesse**.

## Solução e Padrão Aplicado

Foi utilizado o **Padrão Mediator**, implementado como um **Gerenciador de Eventos** que internamente usa o Padrão Observer.

Este padrão foi a melhor escolha, pois promove um **desacoplamento total** entre os componentes e transfere a responsabilidade de roteamento e filtragem para o mediador.
