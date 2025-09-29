package exercicio02.model;

import exercicio02.pattern.Observador;
import exercicio02.pattern.Subject;

import java.util.ArrayList;
import java.util.List;

public class Aluno implements Subject {
    private final List<Observador> observadores;
    private double nota;
    private String status;

    public Aluno() {
        observadores = new ArrayList<>();
    }

    public void setNota(double nota) {
        this.nota = nota;
        definirStatus();
        notificarObservadores();
    }

    private void definirStatus() {
        if (this.nota >= 70) {
            this.status = "Aprovado";
        } else if (this.nota >= 50) {
            this.status = "Recuperação";
        } else {
            this.status = "Reprovado";
        }
    }

    @Override
    public void adicionarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    @Override
    public void notificarObservadores() {
        this.observadores.forEach(observador -> {
            observador.atualizar(status, nota);
        });
    }
}
