
//	-----> Seção-7 Aula 61 - Funções 01 (sintaxe)   -->16/05/2021.

package aula61_Funcoes;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula61_Funcoes_02 {

	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------------");
		System.out.println("-----> Seção-7 Aula 61 - Funções 01 (sintaxe) ");
		System.out.println("------------------------------------------------------------------");
		System.out.println("*** Problema exemplo ");
		System.out.println("-->Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.");
		System.out.println("    Enter three numbers: ");
		System.out.println("     5");
		System.out.println("     8");
		System.out.println("     3");
		System.out.println("     Higher= 8 ");

		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java	-------	");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enterthreenumbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showResult(higher);
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;

		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher= " + value);

		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------");
	}

}



/**
 * @author Thalles machado
 *
 */