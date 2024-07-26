package exercicio_11;

class Rei extends Peca {
    public Rei(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        if (Math.abs(novoX - x) <= 1 && Math.abs(novoY - y) <= 1) {
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
