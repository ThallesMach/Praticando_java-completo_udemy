
//	-----> Seção-6 Aula 54 - Exercício 03   -->16/05/2021.

package aula54_Exercicio;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula54_Exercicio_03 {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----> Seção-6 Aula 54 - Exercício 03  ");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"-->Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste  ");
		System.out.println(
				"   de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes ");
		System.out.println("   conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, ");
		System.out.println("    o segundo valor tem peso 3 e o terceiro valor tem peso 5. ");

		System.out.println("----------------------------------------------");
		System.out.println(" * Exemplo: ");
		System.out.println("    Entrada:    3             | Saída: 5.7 ");
		System.out.println("    Entrada:  6.5  4.3   6.2  | Saída: 6.3 ");
		System.out.println("    Entrada:  5.1  4.2   8.1  | Saída:  9.3 ");
		System.out.println("    Entrada:  8.0  9.0  10.0  | Saída:   ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java  -------	");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" Digita valor inteiro Nº: ");
		int n = sc.nextInt();
		System.out.println("-->O que vc digitou: "+ n);

		for (int i = 0; i < n; i++) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf(" Resposta da Meida: %.1f%n", media);
			System.out.println("-------------------------------------------------");
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
