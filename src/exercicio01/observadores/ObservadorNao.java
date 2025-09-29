package exercicio01.observadores;

import exercicio01.eventos.DigitouNao;
import exercicio01.eventos.Evento;

public class ObservadorNao implements Observador {
    @Override
    public void notificar(Evento evento) {
        if (evento instanceof DigitouNao) {
            System.out.println("RECEBI NOTIFICAÇÃO DO TIPO <<DigitouNao>>");
        }
    }
}
