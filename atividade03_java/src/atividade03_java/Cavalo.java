package atividade03_java;

class Cavalo extends Peca {
    public Cavalo(int x, int y, Cor cor) {
        super(x, y, cor);
    }

    // Movimentos respectivos do Cavalo

    @Override
    public boolean mover(int novoX, int novoY) {
        if ((Math.abs(novoX - getX()) == 2 && Math.abs(novoY - getY()) == 1) ||
            (Math.abs(novoX - getX()) == 1 && Math.abs(novoY - getY()) == 2)) {
            setPosicao(novoX, novoY);
            return true;
        }
        return false;
    }
    
    // Configuracao para exibir a letra 'C'representando a peca Cavalo

    @Override
    public String toString() {
        return "C";
    }
}