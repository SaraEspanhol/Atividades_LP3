package atividade03_java;

class Bispo extends Peca {
    public Bispo(int x, int y, Cor cor) {
        super(x, y, cor);
    }

    // Movimentos respectivos do Bispo

    @Override
    public boolean mover(int novoX, int novoY) {
        if (Math.abs(novoX - getX()) == Math.abs(novoY - getY())) {
            setPosicao(novoX, novoY);
            return true;
        }
        return false;
    }
    // Configuracao para exibir a letra 'B'representando a peca Bispo

    @Override
    public String toString() {
        return "B";
    }
}