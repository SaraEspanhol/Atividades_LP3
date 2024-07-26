package exercicio_11;

class Cavalo extends Peca {
    public Cavalo(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        if ((Math.abs(novoX - x) == 2 && Math.abs(novoY - y) == 1) ||
            (Math.abs(novoX - x) == 1 && Math.abs(novoY - y) == 2)) {
            x = novoX;
            y = novoY;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "C";
    }
}