
//	-----> Seção-6 Aula 54 - Exercício 07 - Calcular Divisores.   -->16/05/2021.

package aula54_Exercicio;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula54_Exercicio_07 {

	public static void main(String[] args) {

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("-----> Seção-6 Aula 54 - Exercício 07   ");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------");

		System.out.println("-->Fazer um programa para ler um número inteiro positivo N. ");
		System.out.println("   O programa deve então mostrar na tela N linhas, começando de 1 até N. ");
		System.out.println(
				"   Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.");

		System.out.println("---------------------------------------");
		System.out.println(" * Exemplo: ");
		System.out.println("    Entrada: 5  | Saída: 1 1 1 ");
		System.out.println("     			| Saída: 2 4 8 ");
		System.out.println("     			| Saída: 3 9 27 ");
		System.out.println("    		 	| Saída: 5 25 125 ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java  -------	");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("*Digita um número inteiro positivo Nº: ");
		int n = sc.nextInt();
		
//		int n = 5;

		for (int i = 1; i <= n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		sc.close();

		System.out.println("           ---> FIM <--- ");
		System.out.println("-----------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */
