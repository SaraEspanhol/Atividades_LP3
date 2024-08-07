package atividade03_java;


class Peao extends Peca {
    public Peao(int x, int y, Cor cor) {
        super(x, y, cor);
    }
    // Movimentos respectivos do Peao

    @Override
    public boolean mover(int novoX, int novoY) {
        int direcao = (getCor() == Cor.BRANCO) ? 1 : -1;
        if (novoX == getX() && (novoY == getY() + direcao || (getY() == (getCor() == Cor.BRANCO ? 1 : 6) && novoY == getY() + 2 * direcao))) {
            setPosicao(novoX, novoY);
            return true;
        }
        return false;
    }
    
    // Configuracao para exibir a letra 'P'representando a peca Peao

    @Override
    public String toString() {
        return "P";
    }
}
