package exercicio01.observadores;

import exercicio01.eventos.DigitouOutraCoisa;
import exercicio01.eventos.Evento;

public class ObservadorOutraCoisa implements Observador {
    @Override
    public void notificar(Evento evento) {
        if (evento instanceof DigitouOutraCoisa) {
            System.out.println("RECEBI NOTIFICAÇÃO DO TIPO <<DigitouOutraCoisa>>");
        }
    }
}