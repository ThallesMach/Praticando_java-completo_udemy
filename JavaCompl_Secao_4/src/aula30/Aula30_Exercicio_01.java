
//	---> Seção-4 Aula30-Exercício 01  ---> 13/05/2021.

package aula30;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula30_Exercicio_01 {

	public static void main(String[] args) {

		System.out.println("-------------------------------------------------------------");
		System.out.println(
				" ---> Seção-4 Aula30-Exercício 01\n" + "       Faça um programa para ler dois valores inteiros,\n"
						+ "	 e depois mostrar na tela a soma desses números com uma mensagem explicativa,\n"
						+ "	 conforme exemplos.");
		System.out.println("-------------------------------------------------------------");

		System.out.println("  ---> Exemplos:\n" 
				+ " * 	Entrada:  10, 30   |  Saída:  SOMA =  40\n"
				+ " * 	Entrada: -30, 10   |  Saída:  SOMA = -20\n"
				+ " * 	Entrada:   0,  0   |  Saída:  SOMA =   0.");
		System.out.println("-------------------------------------------------------------");

		System.out.println("         --- Exercício Feito em Código Java --- ");
		int a = 10;
		int b = 30;
		int soma01 = a + b;
		System.out.printf("	 Entrada:  %d, %d  |  Saída:  SOMA =  %d %n", a, b, soma01);

		double c = -30;
		int d = 10;
		double soma02 = c + d;
		System.out.printf("	 Entrada: %.0f, %d  |  Saída:  SOMA = %.0f %n", c, d, soma02);

		double e = 0;
		int f = 0;
		double soma03 = e + f;
		System.out.printf("	 Entrada:   %.0f,  %d  |  Saída:  SOMA =   %.0f. %n", e, f, soma03);
//		System.out.println("-------------------------------------------------------------");	

		System.out.println("-------------------------/////-------------------------------");

		System.out.println("---------------- Outro jeito com Scanner --------------------");
		Scanner sc = new Scanner(System.in);

		double A, B, soma;

		System.out.println(" Digita um Número e aperte Entre: ");
		A = sc.nextInt();
		System.out.println(" Digita outro Número para Soma e aperte Entre: ");
		B = sc.nextInt();

		soma = A + B;

		System.out.printf("----------> SOMA de %.0f + %.0f = %.0f %n", A, B, soma);

		System.out.println("-----------------------/// FIM ///-----------------------------");
		System.out.println("////////////////////////// FIM ////////////////////////////////");

		sc.close();

	}

}
