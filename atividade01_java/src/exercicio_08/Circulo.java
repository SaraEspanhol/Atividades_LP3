package exercicio_08;

public class Circulo implements FormaGeometrica{
    private double raio;
    private double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * PI * raio;
    }
}
