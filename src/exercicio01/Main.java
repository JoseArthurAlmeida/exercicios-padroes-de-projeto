package exercicio01;

import exercicio01.eventos.DigitouNao;
import exercicio01.eventos.DigitouOutraCoisa;
import exercicio01.eventos.DigitouSim;
import exercicio01.gerenciador.GerenciadorEventos;
import exercicio01.observadores.ObservadorNao;
import exercicio01.observadores.ObservadorOutraCoisa;
import exercicio01.observadores.ObservadorSim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorEventos gerenciadorEventos = new GerenciadorEventos();

        gerenciadorEventos.adicionarObservador(new ObservadorSim());
        gerenciadorEventos.adicionarObservador(new ObservadorNao());
        gerenciadorEventos.adicionarObservador(new ObservadorOutraCoisa());

        System.out.println("Digite SIM, NÃO ou qualquer outra coisa:");
        System.out.println("Para sair, digite 'SAIR'");
        System.out.println("----------------------------------------");

        while (true) {
            System.out.print("Entrada: ");
            String entrada = scanner.nextLine().toUpperCase();

            if (entrada.equals("SAIR")) {
                break;
            }

            switch (entrada) {
                case "SIM" -> gerenciadorEventos.dispararEvento(new DigitouSim());
                case "NAO", "NÃO" -> gerenciadorEventos.dispararEvento(new DigitouNao());
                default -> gerenciadorEventos.dispararEvento(new DigitouOutraCoisa());
            }

            System.out.println();

        }
        scanner.close();
        System.out.println("Encerrando o programa...");
    }
}
