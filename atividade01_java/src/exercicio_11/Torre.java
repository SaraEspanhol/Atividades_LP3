package exercicio_11;

class Torre extends Peca {
    public Torre(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        if (novoX == x || novoY == y) {
            x = novoX;
            y = novoY;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "T";
    }
}