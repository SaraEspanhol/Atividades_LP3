package exercicio_09;

import java.util.Date;
 

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.adicionarQuarto(new Quarto(101));
        hotel.adicionarQuarto(new Quarto(102));
        hotel.adicionarQuarto(new Quarto(103));

        Cliente cliente1 = new Cliente("João Espanhol", "2468");
        Cliente cliente2 = new Cliente("Sara Espanhol", "13579");

        hotel.fazerReserva(cliente1, 101, new Date(), new Date(System.currentTimeMillis() + 86400000L)); // 1 dia de reserva
        hotel.fazerReserva(cliente2, 101, new Date(), new Date(System.currentTimeMillis() + 86400000L)); // Tentativa de reserva no mesmo quarto

        hotel.listarReservas();
    }
}
