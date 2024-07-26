package exercicio_10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Semaforo semaforo1 = new Semaforo("verde");
        Semaforo semaforo2 = new Semaforo("vermelho");
        Semaforo semaforo3 = new Semaforo("verde");

        List<Semaforo> percurso1 = new ArrayList<>();
        percurso1.add(semaforo1);
        percurso1.add(semaforo2);
        percurso1.add(semaforo3);

        Carro carro1 = new Carro("1", percurso1);
        Carro carro2 = new Carro("2", percurso1);

        carro1.start();
        carro2.start();

        // Mudança dos estados dos semáforos em intervalos regulares
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000); // Mudança a cada 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                semaforo1.mudarEstado();
                semaforo2.mudarEstado();
                semaforo3.mudarEstado();
                System.out.println("Estados dos semáforos atualizados.");
            }
        }).start();
    }
}