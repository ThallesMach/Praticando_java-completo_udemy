
//	-----> Seção-6 Aula 54 - Exercício 06 - Calcular Divisores.   -->16/05/2021.

package aula54_Exercicio;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula54_Exercicio_06 {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("-----> Seção-6 Aula 54 - Exercício 06 - Calcular Divisores.  ");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");

		System.out.println("-->Ler um número inteiro N e calcular todos os seus divisores.  ");

		System.out.println("------------------------------------");
		System.out.println(" * Exemplo: ");
		System.out.println("    Entrada:  4 | Saída: 1 ");
		System.out.println("     			| Saída: 2 ");
		System.out.println("     			| Saída: 3  ");
		System.out.println("    		 	| Saída: 6  ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java  -------	");

		
		Scanner sc = new Scanner(System.in);

		System.out.println("* Digita Nº inteiro: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
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
