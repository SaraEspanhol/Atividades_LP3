package atividade03_java;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();

        // Cria objetos de peças com suas posições iniciais e suas cores
        Peca reiBranco = new Rei(0, 0, Cor.BRANCO);
        Peca rainhaPreta = new Rainha(1, 1, Cor.PRETO);
        Peca bispoBranco = new Bispo(2, 2, Cor.BRANCO);
        Peca cavaloPreto = new Cavalo(3, 3, Cor.PRETO);
        Peca torreBranca = new Torre(4, 4, Cor.BRANCO);
        Peca peaoBranco = new Peao(6, 1, Cor.BRANCO);

        // Adiciona peças ao tabuleiro
        tabuleiro.adicionarPeca(reiBranco, 0, 0);
        tabuleiro.adicionarPeca(rainhaPreta, 1, 1);
        tabuleiro.adicionarPeca(bispoBranco, 2, 2);
        tabuleiro.adicionarPeca(cavaloPreto, 3, 3);
        tabuleiro.adicionarPeca(torreBranca, 4, 4);
        tabuleiro.adicionarPeca(peaoBranco, 6, 1);

        // Imprime o tabuleiro
        tabuleiro.imprimirTabuleiro();

        // Tenta mover as peças no tabuleiro
        System.out.println("Fazendo jogada");
        tabuleiro.moverPeca(0, 0, 1, 1); // Movimento inválido para o Rei (mesma célula ocupada por outra peça)
        tabuleiro.moverPeca(1, 1, 3, 3); // Movimento válido para a Rainha
        tabuleiro.moverPeca(2, 2, 4, 4); // Movimento válido para o Bispo
        tabuleiro.moverPeca(3, 3, 5, 2); // Movimento válido para o Cavalo
        tabuleiro.moverPeca(4, 4, 4, 7); // Movimento válido para a Torre
        tabuleiro.moverPeca(6, 1, 6, 3); // Movimento válido para o Peão

        // Imprime o  tabuleiro após as jogadas
        System.out.println("Após jogada:");
        tabuleiro.imprimirTabuleiro();
    }
}
