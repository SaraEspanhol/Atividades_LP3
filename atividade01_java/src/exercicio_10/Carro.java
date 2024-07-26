package exercicio_10;

import java.util.List;

class Carro extends Thread {
    private String id;
    private List<Semaforo> percurso;

    public Carro(String id, List<Semaforo> percurso) {
        this.id = id;
        this.percurso = percurso;
    }

    @Override
    public void run() {
        for (Semaforo semaforo : percurso) {
            while (semaforo.getEstado().equals("vermelho")) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Carro " + id + " passou pelo semáforo " + semaforo.getEstado());
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Carro " + id + " chegou ao destino.");
    }
}