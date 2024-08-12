package atividade04_java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SistemaReserva {
    public static void main(String[] args) {
        // Cria um voo com capacidade para 5 assentos
        Voo voo = new Voo("DW-200", 5);

        // Cria um ExecutorService com um pool de 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Tenta reservar 10 assentos
        for (int i = 0; i < 10; i++) {
            executor.submit(new Reserva(voo));
        }

        // Encerra o ExecutorService
        executor.shutdown();

        try {
            // Aguarda a conclusão de todas as tarefas
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        // Print do resultado final
        System.out.println("Assentos reservados: " + voo.getAssentosReservados());
    }
}

