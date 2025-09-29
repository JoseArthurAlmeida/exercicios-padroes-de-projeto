package exercicio01.observadores;

import exercicio01.eventos.DigitouSim;
import exercicio01.eventos.Evento;

public class ObservadorSim implements Observador{
    @Override
    public void notificar(Evento evento) {
        if (evento instanceof DigitouSim){
            System.out.println("RECEBI NOTIFICAÇÃO DO TIPO <<DigitouSim>>");
        }
    }
}
