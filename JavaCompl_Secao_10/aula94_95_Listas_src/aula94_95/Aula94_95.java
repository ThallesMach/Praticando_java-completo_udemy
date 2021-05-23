
//	----->Seção-10 Aula 94 95 - Listas 		--->22/05/2021.

package aula94_95;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Thalles machado
 *
 */
public class Aula94_95 {

	public static void main(String[] args) {
	
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-10 Aula 94 e 95 - Listas    ");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println(" --- Laço \"for each\" ---  ");
		System.out.println();
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("  Demo  ");
		System.out.println(" •Tamanho da lista: size() ");
		System.out.println(" •Obter o elemento de uma posição: get(position)  ");
		System.out.println(" •Inserir elemento na lista: add(obj), add(int, obj) ");
		System.out.println(" •Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)  ");
		System.out.println(" •Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)  ");
		System.out.println(" •Filtrar lista com base em predicado:  ");
		System.out.println("    List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList() );   ");
		System.out.println(" •Encontrar primeira ocorrência com base em predicado:  ");
		System.out.println("   Integer result= list.stream().filter(x-> x> 4).findFirst().orElse(null);  ");
		System.out.println();
		System.out.println(" •Assuntos pendentes: ");
		System.out.println("   •interfaces  ");
		System.out.println("   •generics    ");
		System.out.println("   •predicados (lambda)  ");
		
		System.out.println("---------------------------------------------------------------");
		
		List<String> list = new ArrayList<>() ;   // 		List<String> list = new ArrayList<String>() ;
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println("------------------------");		
		System.out.println(list.size() );    //  size()  Tamanho da lista 
		
//		list.remove("Anna");
//		list.remove(1);
		
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("------------------------");		

		System.out.println("------ Remove Predicado ------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M' );
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("------------------------");		

		System.out.println("------ Encontra aposição de um elemento ------------------");
		System.out.println("Index of Bob: "+ list.indexOf("Bob") );
		System.out.println("Index of Marco: "+ list.indexOf("Marco") );
		System.out.println("------------------------");		

		System.out.println("------ Filtra a Lista q começa com Letra ------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A' ).collect(Collectors.toList() );
		for(String x: result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");		

		System.out.println("--- Encontra um Elemento da Lista com base Predicado ------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);		
		System.out.println(name);
		System.out.println("-------");
		String name2 = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);		
		System.out.println(name2);
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
		
	}

}

/**
 * @author Thalles machado
 *
 */