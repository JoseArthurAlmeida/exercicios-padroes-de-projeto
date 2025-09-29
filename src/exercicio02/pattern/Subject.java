package exercicio02.pattern;

public interface Subject {
    void adicionarObservador(Observador observador);
    void notificarObservadores();
}
