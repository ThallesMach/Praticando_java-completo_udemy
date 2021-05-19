
//	--->Seção-8 Aula 73 - Exercício de fixação   -->19/05/2021.

package application73;

import java.util.Locale;
import java.util.Scanner;

import util73.CurrencyConverter73;

/**
 * @author Thalles machado
 *
 */
public class Program_73 {

	public static void main(String[] args) {

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("----->Seção-8 Aula 73 - Exercício de fixação   ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("***Exercício de fixação ***");
		System.out.println(
				"-->Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por    ");
		System.out.println(
				"    uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda ");
		System.out.println(
				"    que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter ");
		System.out.println("    para ser responsável pelos cálculos. ");

		System.out.println("--------------------------------------------------------------------------");
		System.out.println(" *Exemplo: ");
		System.out.println("    What is the dollar price? 3.10    ");
		System.out.println("    How many dollars will be bought? 200.00 ");
		System.out.println("    Amount to be paid in reais= 657.20      ");
		System.out.println();

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		System.out.println("	-------	Código em Java	-------	");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter73.dollarToReal(amount, dollarPrice);
		
		System.out.printf("Amount to be paid in reais= %.2f%n", result);
		sc.close();

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */
