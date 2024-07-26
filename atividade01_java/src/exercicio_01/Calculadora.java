package exercicio_01;

public class Calculadora {
    double n1;
    double n2;
    double resultado;


    public void somar(){
        resultado = n1 + n2;
        System.out.println("O resultado da soma é = " + resultado);
    }

    public void subtracao(){
        resultado = n1 - n2;
        System.out.println("O resultado da subtracão é = " + resultado);
    }

    public void multiplicacao(){
        resultado = n1 * n2;
        System.out.println("O resultado da multiplicacão é = " + resultado);
    }

    public void divisao(){
        if (n2 == 0){
            System.out.println("Esta divisão não é possível pois o dividento é igual a 0");
        }
        else{
            resultado = n1/n2;
            System.out.println("O resultado da divisão é = " + resultado);
        }
    }

}