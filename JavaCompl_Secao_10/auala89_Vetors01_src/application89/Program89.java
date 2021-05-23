
//	----->Seção-10 Aula 89 - Vetores Parte 01		--->22/05/2021.

package application89;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Program89 {

	public static void main(String[] args) {


		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-10 Aula 89 - Vetores Parte 01  ");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("***Problema exemplo 01 *** ");
		System.out.println("--->Fazer um programa para ler um número inteiro N e a altura de N ");
		System.out.println("    pessoas. Armazene as N altura sem um vetor.Em seguida, mostrar a	");
		System.out.println("    altura média dessas pessoas. ");
		System.out.println("-------------------------------------");
		System.out.println("* Exmplo: ");
		System.out.println("  Input:   | Output:      ");
		System.out.println("     3     |  AVERAGE HEIGHT= 1.69");
		System.out.println("     1.72  |   ");
		System.out.println("     1.56  |   ");
		System.out.println("     1.80  |   ");
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digita Números de pessoas:  ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
			for (int i = 0; i < n; i++) {
				sum += vect[i];
			}
		double avg = sum / n;
		
		System.out.println(" Altura Média das pessoas");
		System.out.printf(" AVERAGE HEIGHT: %.2f %n ", avg);
		
		sc.close();


		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
		
	}

}


/**
 * @author Thalles machado
 *
 */