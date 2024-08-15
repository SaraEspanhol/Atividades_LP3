package exercicio04;

import java.util.Stack;

public class Stack_ex4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Elemento 01");
        stack.push("Elemento 02");
        stack.push("Elemento 03");

        System.out.println("Elemento a ser removido: " + stack.pop());  // Remove e exibe 
    }
}
