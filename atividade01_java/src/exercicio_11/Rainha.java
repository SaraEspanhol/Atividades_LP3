package exercicio_11;

class Rainha extends Peca {
    public Rainha(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        if (novoX == x || novoY == y || Math.abs(novoX - x) == Math.abs(novoY - y)) {
            x = novoX;
            y = novoY;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "R";
    }
}
