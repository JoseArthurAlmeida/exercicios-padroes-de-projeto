package exercicio02.observadores;

import exercicio02.pattern.Observador;

public class Coordenador implements Observador {

    @Override
    public void atualizar(String status, double nota) {
        if ("Reprovado".equals(status)) {
            System.out.println("Coordenador: O aluno foi reprovado com nota " + nota + ". A rematrícula para o próximo período está disponível.");
        }
    }
}
