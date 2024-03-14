package exercicios.exercicio_02;

import java.util.*;

public class ex02{
	public static void main(String[] args) {
		//Criar a lista
		List<String> minhaListaCompras = new ArrayList<>();
		
		//Adicionar itens a lista
		minhaListaCompras.add("Arroz");
		minhaListaCompras.add("Feijão");
		minhaListaCompras.add("Macarrão");
		minhaListaCompras.add("CupNoodles");
		minhaListaCompras.add("Refrigerante");
		
		//Imprimir a Lista
		for(String itens : minhaListaCompras){
			System.out.println(itens);
		}
		
		System.out.println("Removendo iten: Feijão");
		
		//Remover item da Lista
		minhaListaCompras.remove(1);
		
		//Imprimir a Lista Final
		for (String itens : minhaListaCompras) {
			System.out.println(itens);
		}
		
		
	}

}