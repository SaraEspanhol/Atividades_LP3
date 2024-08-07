package atividade03_java;

class Tabuleiro {
    private Peca[][] tabuleiro;

    // Inicializa o tabuleiro de tamanho 8x8
    public Tabuleiro() {
        tabuleiro = new Peca[8][8];
    }

    // Método para adicionar uma peça no tabuleiro
    public void adicionarPeca(Peca peca, int x, int y) {
        tabuleiro[x][y] = peca;
    }

    // Método para mover uma peça no tabuleiro com check de limites
    public boolean moverPeca(int x, int y, int novoX, int novoY) {
        if (novoX < 0 || novoX >= 8 || novoY < 0 || novoY >= 8) {
            return false;
        }
        Peca peca = tabuleiro[x][y];
        Peca destino = tabuleiro[novoX][novoY];
        if (peca != null && (destino == null || destino.getCor() != peca.getCor()) && peca.mover(novoX, novoY)) {
            tabuleiro[novoX][novoY] = peca;
            tabuleiro[x][y] = null;
            return true;
        }
        return false;
    }

    // Método para imprimir o tabuleiro
    public void imprimirTabuleiro() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabuleiro[i][j] != null) {
                    System.out.print(tabuleiro[i][j].getClass().getSimpleName().charAt(0) + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}

