package Exercicio_01.Calculadora;

public class Main {
    public static void main (String[] args){

        Calculadora calculadora = new Calculadora();

        calculadora.n1 = 20.2;
        calculadora.n2 = 10.5;

        calculadora.somar();
        calculadora.subtracao();
        calculadora.multiplicacao();
        calculadora.divisao();

    }
}
