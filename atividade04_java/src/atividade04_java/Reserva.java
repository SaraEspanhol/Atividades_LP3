package atividade04_java;

public class Reserva implements Runnable {
    private final Voo voo;

    // Construtor da classe Reserva
    public Reserva(Voo voo) {
        this.voo = voo;
    }
    
    
    
    // Método run() que será executado quando a thread for iniciada
    @Override
    public void run() {
        boolean sucesso = voo.reservarAssento();
        if (sucesso) {
            System.out.println("Reserva feita com sucesso no voo " + voo.getNumeroVoo());
        } else {
            System.out.println("Não há mais assentos disponíveis no voo " + voo.getNumeroVoo());
        }
    }
}

