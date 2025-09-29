package exercicio01.gerenciador;

import exercicio01.eventos.Evento;
import exercicio01.observadores.Observador;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEventos {
    private final List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void dispararEvento(Evento evento) {
        for (Observador observador : observadores) {
            observador.notificar(evento);
        }
    }
}
