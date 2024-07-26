package exercicio_02;

public class Estudante {
    
    String nome;
    int idade;
    double nota;

    public boolean aprovado(){
        if (nota >= 7){
            
            return true;
        }
        else {
            return false;
        }
    }
}
