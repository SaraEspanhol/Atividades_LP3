package exercicio_09;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Hotel {
    private List<Quarto> quartos;
    private List<Reserva> reservas;

    public Hotel() {
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void fazerReserva(Cliente cliente, int numeroQuarto, Date dataInicio, Date dataFim) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto && quarto.isDisponivel()) {
                Reserva reserva = new Reserva(cliente, quarto, dataInicio, dataFim);
                reservas.add(reserva);
                quarto.setDisponivel(false);
                System.out.println("Reserva realizada com sucesso para o cliente " + cliente.getNome());
                return;
            }
        }
        System.out.println("Quarto não disponível para reserva.");
    }

    public void listarReservas() {
        for (Reserva reserva : reservas) {
            System.out.println("Cliente: " + reserva.getCliente().getNome() + ", Quarto: " + reserva.getQuarto().getNumero() +
                    ", Data Início: " + reserva.getDataInicio() + ", Data Fim: " + reserva.getDataFim());
        }
    }
}
