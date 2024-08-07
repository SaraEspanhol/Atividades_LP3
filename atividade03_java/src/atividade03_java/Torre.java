package atividade03_java;

class Torre extends Peca {
    public Torre(int x, int y, Cor cor) {
        super(x, y, cor);
    }
    
    // Movimentos respectivos da Torre
    @Override
    public boolean mover(int novoX, int novoY) {
        if (novoX == getX() || novoY == getY()) {
            setPosicao(novoX, novoY);
            return true;
        }
        return false;
    }
    
    // Configuracao para exibir a letra 'T'representando a peca torre
    @Override
    public String toString() {
        return "T";
    }
}