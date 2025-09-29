package exercicio02.observadores;

import exercicio02.pattern.Observador;

public class Professor implements Observador {

    @Override
    public void atualizar(String status, double nota) {
        if ("Recuperação".equals(status)) {
            System.out.println("Professor: O aluno está em recuperação com nota " + nota + ". Estou preparando a prova.");
        }
    }
}
