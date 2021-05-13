
//	---> Seção-4 Aula30-Exercício 03  ---> 13/05/2021.

package aula30;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula30_Exercicio_03 {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("-->Fazer um programa para ler quatro valores inteiros A, B, C e D.");
		System.out.println("    A seguir, calcule e mostre a diferença do produto de");
		System.out.println("    A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B -C * D)");
		System.out.println("----------------------------------------------------------------------------------");

		System.out.println("  ---> Exemplos:\n" + " * 	Entrada:  5  |  Saída: DIFERENCA = -26 \n"
				+ " * 	Entrada:  6  |  \n" + " * 	Entrada:  7  |  \n" + " * 	Entrada:  8  |  ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("         --- Exercício Feito em Código Java --- ");

		int a = 5, b = 6, c = 7, d = 8;
		int diferencia = (a * b - c * d);
		System.out.printf("	 Entrada: %d  |  Saída: DIFERENCA = %d %n", a, diferencia);
		System.out.printf("	 Entrada: %d  |  \n", b);
		System.out.printf("	 Entrada: %d  |  \n", c);
		System.out.printf("	 Entrada: %d  |  \n", d);
		System.out.println("----------------------------------------------------------------------------------");

		System.out.println("-------------------------/////-------------------------------");

		System.out.println("---------------- Outro jeito com Scanner --------------------");

		Scanner sc = new Scanner(System.in);

		int e, f, g, j;
		System.out.println(" Digita 4 Números, cada valor Aperte Entre: ");
		e = sc.nextInt();
		f = sc.nextInt();
		g = sc.nextInt();
		j = sc.nextInt();

		int diferencia001 = (e * f - g * j);
		System.out.printf("	 Entrada: %d  |  Saída: DIFERENCA = %d %n", e, diferencia001);
		System.out.printf("	 Entrada: %d  |  \n", f);
		System.out.printf("	 Entrada: %d  |  \n", g);
		System.out.printf("	 Entrada: %d  |  \n", j);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("-----------------------/// FIM ///-----------------------------");
		System.out.println("////////////////////////// FIM ////////////////////////////////");

		sc.close();

	}

}
