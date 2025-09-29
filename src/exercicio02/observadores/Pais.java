package exercicio02.observadores;

import exercicio02.pattern.Observador;

public class Pais implements Observador {
    @Override
    public void atualizar(String status, double nota) {
        if ("Aprovado".equals(status)) {
            System.out.println("Pais: Parabéns, filho! Você foi aprovado com nota " + nota + ".");
        }
    }
}
