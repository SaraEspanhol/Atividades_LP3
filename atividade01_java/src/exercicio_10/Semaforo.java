package exercicio_10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Semaforo {
    private String estado; // "verde", "amarelo", "vermelho"
    private Lock lock = new ReentrantLock();

    public Semaforo(String estadoInicial) {
        this.estado = estadoInicial;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mudarEstado() {
        lock.lock();
        try {
            switch (estado) {
                case "verde":
                    estado = "amarelo";
                    break;
                case "amarelo":
                    estado = "vermelho";
                    break;
                case "vermelho":
                    estado = "verde";
                    break;
            }
        } finally {
            lock.unlock();
        }
    }
}
