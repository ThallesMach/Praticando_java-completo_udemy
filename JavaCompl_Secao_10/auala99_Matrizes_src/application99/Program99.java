
//	----->Seção-10 Aula 99 - Matrizes  Exercício		--->22/05/2021.

package application99;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Program99 {

	public static void main(String[] args) {


		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-10 Aula 99 - Matrizes  Exercício  ");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("***Exercçio Exemplo  *** ");
		System.out.println("--->Fazer um programa para ler um número inteiro N e uma matriz de ");
		System.out.println("    ordem N contendo números inteiros. Em seguida, mostrar a diagonal	");
		System.out.println("    principal e a quantidade de valores negativos da matriz. ");
		System.out.println("-------------------------------------");
		System.out.println("* Exmplo: ");
		System.out.println("   Input:      |  Output:  ");
		System.out.println("     3         |  Main diagonal:  ");
		System.out.println("     5 -3  10  |  5 8 -4          ");
		System.out.println("    15  8   2  |  Negative numbers = 2  ");
		System.out.println("     7  9  -4  |                   ");
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) {   // for (int i = 0; i < n; i++) {
			for (int j = 0; j < mat[i].length; j++) {   // for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println(" Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {   // for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " "  );
		}
		System.out.println();
		
		
		int count = 0;
		for (int i = 0; i < mat.length; i++) {     // for (int i = 0; i < n; i++) {
			for (int j = 0; j < mat[i].length; j++) {  // for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0 ) {
					count++;
				}
			}
		}
		System.out.println(" Negative numbers = "+ count);
		

		sc.close();
		

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");		
	}

}



/**
 * @author Thalles machado
 *
 */