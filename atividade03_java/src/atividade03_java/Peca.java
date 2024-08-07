package atividade03_java;

//Classe abstrata Peca define uma peça de xadrez
abstract class Peca {
    private int x, y;
    private Cor cor;

    // Construtor para inicializar os atributos
    public Peca(int x, int y, Cor cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }
    // Método abstrato que deve ser implementado pelas subclasses com os movimentos especificos
    public abstract boolean mover(int novoX, int novoY);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Cor getCor() {
        return cor;
    }

    // Método protegido para alterar a posição da peça
    protected void setPosicao(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Método abstrato para exibir a inicial da peca
    public abstract String toString();

}