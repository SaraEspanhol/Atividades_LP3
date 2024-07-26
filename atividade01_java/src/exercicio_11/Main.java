package exercicio_11;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Peca rei = new Rei(0, 0);
        Peca rainha = new Rainha(1, 1);
        Peca bispo = new Bispo(2, 0);
        Peca cavalo = new Cavalo(3, 0);
        Peca torre = new Torre(4, 0);
        Peca peao = new Peao(6, 1);

        tabuleiro.adicionarPeca(rei, 0, 0);
        tabuleiro.adicionarPeca(rainha, 1, 1);
        tabuleiro.adicionarPeca(bispo, 2, 0);
        tabuleiro.adicionarPeca(cavalo, 3, 0);
        tabuleiro.adicionarPeca(torre, 4, 0);
        tabuleiro.adicionarPeca(peao, 6, 1);

        System.out.println("Tabuleiro Inicial:");
        tabuleiro.imprimirTabuleiro();

        tabuleiro.moverPeca(0, 0, 1, 1); // Movimento inválido para o Rei
        tabuleiro.moverPeca(1, 1, 3, 3); // Movimento válido para a Rainha
        tabuleiro.moverPeca(2, 0, 4, 2); // Movimento válido para o Bispo
        tabuleiro.moverPeca(3, 0, 5, 1); // Movimento válido para o Cavalo
        tabuleiro.moverPeca(4, 0, 4, 5); // Movimento válido para a Torre
        tabuleiro.moverPeca(6, 1, 6, 2); // Movimento válido para o Peão

        System.out.println("Tabuleiro Final:");
        tabuleiro.imprimirTabuleiro();
    }
}