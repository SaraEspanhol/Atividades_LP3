package exercicio_08;

public class Main {
    
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(3);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());

        Circulo circulo = new Circulo(7);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        Retangulo retangulo = new Retangulo(7, 2);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }

}
