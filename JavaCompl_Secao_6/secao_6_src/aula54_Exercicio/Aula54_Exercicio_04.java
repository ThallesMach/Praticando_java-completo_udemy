
//	-----> Seção-6 Aula 54 - Exercício 04   -->16/05/2021.

package aula54_Exercicio;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula54_Exercicio_04 {

	public static void main(String[] args) {

		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");
		System.out.println("-----> Seção-6 Aula 54 - Exercício 04  ");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"-->Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo   ");
		System.out
				.println("   segundo. Se o denominador for igual a zero, mostrar a mensagem \"divisao impossivel\". ");

		System.out.println("------------------------------------------------------");
		System.out.println(" * Exemplo: ");
		System.out.println("    Entrada:  3    |     ");
		System.out.println("    Entrada:  3 -2 | Saída: -1.5 ");
		System.out.println("    Entrada: -8  0 | Saída: divisao impossivel ");
		System.out.println("    Entrada:  0  8 | Saída:  0.0    ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java  -------	");

		Scanner sc = new Scanner(System.in);

		System.out.println(" Digita Nº inteiro: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println(" Divisao impossivel");
			} else {
				double div = (double) x / y;
				System.out.printf(" %.1f%n", div);
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
