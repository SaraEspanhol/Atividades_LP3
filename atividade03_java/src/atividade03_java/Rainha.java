package atividade03_java;

class Rainha extends Peca {
    public Rainha(int x, int y, Cor cor) {
        super(x, y, cor);
    }

    // Movimentos respectivos da Rainha

    @Override
    public boolean mover(int novoX, int novoY) {
        if (novoX == getX() || novoY == getY() || Math.abs(novoX - getX()) == Math.abs(novoY - getY())) {
            setPosicao(novoX, novoY);
            return true;
        }
        return false;
    }
    
    // Configuracao para exibir a letra 'R'representando a peca Rainha

    @Override
    public String toString() {
        return "R";
    }
}
