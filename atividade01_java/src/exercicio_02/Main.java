package exercicio_02;

public class Main {
    
    public static void main (String[] args){

        Estudante estudante = new Estudante();
        estudante.nota = 0.5;

        boolean situacao = estudante.aprovado();

        if (situacao == true){
            
            System.out.println("Aluno aprovado com nota " + estudante.nota);

        }else {
            System.out.println("Aluno reprovado com nota " + estudante.nota);
        }
        

    }
}
