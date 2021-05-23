
//	----->Seção-10 Aula 100 - Matrizes  Exercício	--->22/05/2021.

package application100;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Program100 {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-10 Aula 100 - Matrizes  Exercício  ");
		System.out.println("-----------------------------------------------------------------------------");

		System.out.println("***Exercçio Exemplo  *** ");
		System.out.println("--->Fazer um programa para ler um número inteiro N e uma matriz de ");
		System.out.println("    ordem N contendo números inteiros. Em seguida, mostrar a diagonal	");
		System.out.println("    principal e a quantidade de valores negativos da matriz. ");
		System.out.println("-------------------------------------");
		System.out.println("* Exmplo:    ");
		System.out.println("   3   4       ");
		System.out.println("  10   8  15  12  ");
		System.out.println("  21  11  23   8  ");
		System.out.println("  14   5  13  19  ");
		System.out.println("   8  ");
		System.out.println("  Position 0,1: ");
		System.out.println("  Left: 10  ");
		System.out.println("  Right: 15 ");
		System.out.println("  Down: 11 ");
		System.out.println("  Position 1,3: ");
		System.out.println("  Left: 23 ");
		System.out.println("  Up:  12 ");
		System.out.println("  Down: 19 ");

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de Linhas:  ");
		int m = sc.nextInt();
		System.out.print("Quantidade de Colunas:  ");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}
		
		
		sc.close();
		

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}


/**
 * @author Thalles machado
 *
 */