package atividade04_java;

public class Voo {
    private final String numeroVoo;
    private final int capacidadeTotal;
    private int assentosReservados;

   // Construtor da classe Voo
    public Voo(String numeroVoo, int capacidadeTotal) {
        this.numeroVoo = numeroVoo;
        this.capacidadeTotal = capacidadeTotal;
        this.assentosReservados = 0;
    }

    // Metodo para reservar assento, verificando se existem assentos disponíveis
    public synchronized boolean reservarAssento() {
        if (assentosReservados < capacidadeTotal) {
            assentosReservados++;
            return true;
        }
        return false;
    }

   
    public String getNumeroVoo() {
        return numeroVoo;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public int getAssentosReservados() {
        return assentosReservados;
    }
}
