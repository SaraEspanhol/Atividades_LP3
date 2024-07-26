package exercicio_11;


class Peao extends Peca {
    public Peao(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        // Movimento básico do peão (não considerando captura ou movimento inicial de duas casas)
        if (novoX == x && novoY == y + 1) {
            y = novoY;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "P";
    }
}
