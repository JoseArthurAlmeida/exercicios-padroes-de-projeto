package exercicio02;

import exercicio02.model.Aluno;
import exercicio02.observadores.*;
import exercicio02.pattern.Observador;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Observador pais = new Pais();
        Observador professor = new Professor();
        Observador coordenador = new Coordenador();

        aluno.adicionarObservador(pais);
        aluno.adicionarObservador(professor);
        aluno.adicionarObservador(coordenador);

        System.out.println("--- Aluno aprovado ---");
        aluno.setNota(70);

        System.out.println("\n--- Aluno em recuperação ---");
        aluno.setNota(69);

        System.out.println("\n--- Aluno reprovado ---");
        aluno.setNota(49);
    }
}
