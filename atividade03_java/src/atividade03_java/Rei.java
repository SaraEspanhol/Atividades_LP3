package atividade03_java;

class Rei extends Peca {
    public Rei(int x, int y, Cor cor) {
        super(x, y, cor);
    }

    // Movimentos respectivos do Rei

    @Override
    public boolean mover(int novoX, int novoY) {
        if (Math.abs(novoX - getX()) <= 1 && Math.abs(novoY - getY()) <= 1) {
            setPosicao(novoX, novoY);
            return true;
        }
        return false;
    }
    // Configuracao para exibir a letra 'R'representando a peca Rei
    @Override
    public String toString() {
        return "R";
    }
}
