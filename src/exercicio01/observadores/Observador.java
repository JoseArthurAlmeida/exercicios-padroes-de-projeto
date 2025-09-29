package exercicio01.observadores;

import exercicio01.eventos.Evento;

public interface Observador {
    void notificar(Evento evento);
}
