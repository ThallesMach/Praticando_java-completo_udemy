
 //	-----> Seção-6 Aula 54 - Exercício 01   -->16/05/2021.

package aula54_Exercicio;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula54_Exercicio_01 {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----> Seção-6 Aula 54 - Exercício 01  ");
		System.out.println("-----------------------------------------------------------------------------");

		System.out.println("-->Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre  ");
		System.out.println("    os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.");
		System.out.println("------------------------------");
		System.out.println(" * Exemplo: ");
		System.out.println("    Entrada:  8 | Saída: 1 ");
		System.out.println("    Entrada:    | Saída: 3 ");
		System.out.println("    Entrada:    | Saída: 5 ");
		System.out.println("    Entrada:    | Saída: 7 ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java  -------	");
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("* Digita algum Nº: ");
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
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
