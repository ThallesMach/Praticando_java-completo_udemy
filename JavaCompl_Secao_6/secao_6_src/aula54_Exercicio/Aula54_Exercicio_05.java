
//	-----> Seção-6 Aula 54 - Exercício 05   -->16/05/2021.

package aula54_Exercicio;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula54_Exercicio_05 {


	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("-----> Seção-6 Aula 54 - Exercício 05 - Fatorial  ");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");

		System.out.println("-->Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.  ");
		System.out.println("   Lembrando que, por definição, fatorial de 0 é 1. ");

		System.out.println("----------------------------------------");
		System.out.println(" * Exemplo: ");
		System.out.println("    Entrada:  4 | Saída: 24 ");
		System.out.println("    Entrada:  1 | Saída: 1 ");
		System.out.println("    Entrada:  5 | Saída: 120    ");
		System.out.println("    Entrada:  0 | Saída: 1    ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java  -------	");

		Scanner sc = new Scanner(System.in);

		System.out.println("* Fatorial digita Nº: ");
		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat *= i;   // fat = fat * i;
		}
		
		System.out.printf("-->Nº Fatorial %d, a Resultado: %d  %n", n, fat);
		
		sc.close();
		

		System.out.println("           ---> FIM <--- ");
		System.out.println("-----------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */
