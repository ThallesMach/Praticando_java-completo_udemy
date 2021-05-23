
//	----->Seção-10 Aula 90 - Vetores Parte 02		--->22/05/2021.

package application90;

import java.util.Locale;
import java.util.Scanner;

import entities90.Product90;

/**
 * @author Thalles machado
 *
 */
public class Program90 {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-9 Aula 90 - Vetores Parte 02  ");
		System.out.println("-----------------------------------------------------------------------------");

		System.out.println("***Problema exemplo 02 *** ");
		System.out.println("--->Fazer um programa para ler um número inteiro N e os dados ");
		System.out.println("    (nome e preço) de N Produtos. Armazene os N produtos em um vetor. ");
		System.out.println("     Em seguida, mostrar o preço médio dos produtos. ");
		System.out.println("-------------------------------------");
		System.out.println("* Exmplo: ");
		System.out.println("  Input:   | Output:      ");
		System.out.println("     3     |  AVERAGE PRICE= 700.00 ");
		System.out.println("    Tv     |   ");
		System.out.println("   900.00  |   ");
		System.out.println("    Fryer  |   ");
		System.out.println("   400.00  |   ");
		System.out.println("    Fryer  |   ");
		System.out.println("   800.00  |   ");

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product90[] vect = new Product90[n];
		
		for (int i = 0; i < vect.length; i++) { // for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product90(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;      // 	double avg = sum / n;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		
		sc.close();

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");

	}

}

/**
 * @author Thalles machado
 *
 */