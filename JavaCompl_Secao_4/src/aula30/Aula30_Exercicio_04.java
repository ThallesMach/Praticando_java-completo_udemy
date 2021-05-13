
//	---> Seção-4 Aula30-Exercício 04  ---> 13/05/2021.

package aula30;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula30_Exercicio_04 {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("-->Fazer um programa paraler o código de uma peça 1,");
		System.out.println("   o número de peças 1, o valor unitário de cada peça 1,");
		System.out.println("   o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.");
		System.out.println("   Calcule e mostre o valor a ser pago.");
		System.out.println("----------------------------------------------------------------------------------");

		System.out.println("  ---> Exemplos: ");
		System.out.println("         ****** Código | Unidade | Valor da Peça  |");
		System.out.println(" * 	Entrada:   12  |   1     |     5.30       |  ");
		System.out.println(" * 	Entrada:   16  |   2     |     5.10       |  ");
		System.out.println(" *         Saída: VALOR A PAGAR: R$ 15.50 ");
		System.out.println("------------------------------------------------------");
		
		System.out.println("         ****** Código | Unidade | Valor da Peça  |");
		System.out.println(" * 	Entrada:   13  |   2     |     5.30       |  ");
		System.out.println(" * 	Entrada:  161  |   4     |     5.20       |  ");
		System.out.println(" *         Saída: VALOR A PAGAR: R$ 51.40 ");
		System.out.println("------------------------------------------------------");
		
		System.out.println("         ****** Código | Unidade | Valor da Peça  |");
		System.out.println(" * 	Entrada:    1  |   1     |     5.10       |  ");
		System.out.println(" * 	Entrada:    2  |   1     |     5.10       |  ");
		System.out.println(" *         Saída: VALOR A PAGAR: R$ 30.20 ");
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		System.out.println("----------------------------------------------------------------------------------");		
		
		System.out.println("-------------------------/////-------------------------------");
		System.out.println("         --- Exercício Feito em Código Java --- ");

		Locale.setDefault(Locale.US);
		
		double a = 1, b = 5.30, c = 2, d = 5.10; 
		double resultado001 = (a * b) + (c * d );
		System.out.println("         ****** Código | Unidade | Valor da Peça  |");
		System.out.printf(" * 	Entrada:   12  |    %.0f    |     %.2f       |   \n", a, b);
		System.out.printf(" * 	Entrada:   16  |    %.0f    |     %.2f       |   \n", c, d);
		System.out.printf(" *          Saída: VALOR A PAGAR: R$ %.2f  \n", resultado001 );
		System.out.println("---------------------///////////////---------------------------");		

		double e = 4, f = 5.30, g = 2, j = 5.20; 
		double resultado002 = (e * f) + (g * j );
		System.out.println("         ****** Código | Unidade | Valor da Peça  |");
		System.out.printf(" * 	Entrada:   13  |    %.0f    |     %.2f       |   \n", e, f);
		System.out.printf(" * 	Entrada:  161  |    %.0f    |     %.2f       |   \n", g, j);
		System.out.printf(" *          Saída: VALOR A PAGAR: R$ %.2f  \n", resultado002 );
		System.out.println("---------------------///////////////---------------------------");	
		
		double r = 1, s = 5.10, t = 1, u = 5.10; 
		double resultado003 = (r * s) + (t * u );
		System.out.println("         ****** Código | Unidade | Valor da Peça  |");
		System.out.printf(" * 	Entrada:    1  |    %.0f    |     %.2f       |   \n", r, s);
		System.out.printf(" * 	Entrada:    2  |    %.0f    |     %.2f       |   \n", t, u);
		System.out.printf(" *          Saída: VALOR A PAGAR: R$ %.2f  \n", resultado003 );
		System.out.println("---------------------///////////////---------------------------");
		
		System.out.println("-------------------------/////-------------------------------");

		System.out.println("---------------- Outro jeito com Scanner --------------------");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;
	    System.out.println("--- Entrada de dados 01 ---");
	    System.out.println(" Digita o código e Aperte Entre: ");
	    cod1 = sc.nextInt();
	    System.out.println(" Digita a unidade e Aperte Entre: ");
	    qte1 = sc.nextInt();
	    System.out.println(" Digita o valor da Peça e Aperte Entre: ");
	    preco1 = sc.nextDouble();

	    System.out.println("--- Entrada de dados 02 ---");
	    System.out.println(" Digita o código e Aperte Entre: ");
	    cod2 = sc.nextInt();
	    System.out.println(" Digita a unidade e Aperte Entre: ");
	    qte2 = sc.nextInt();
	    System.out.println(" Digita o valor da Peça, com ponto sem a vírgula e Aperte Entre: ");
	    preco2 = sc.nextDouble();

	    total = (preco1 * qte1) + (preco2 * qte2);

//	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

	    System.out.println("---------------------------------------------------");
		System.out.println("         ****** Código | Unidade | Valor da Preça |");
		System.out.printf(" * 	Entrada:    %d  |    %d    |     %.2f       |   \n", cod1, qte1, preco1);
		System.out.printf(" * 	Entrada:    %d  |    %d    |     %.2f       |   \n", cod2, qte2, preco2);
		System.out.printf(" *          Saída: VALOR A PAGAR: R$ %.2f  \n", total );
		System.out.println("---------------------////////////////--------------------------");
		System.out.println("-----------------------/// FIM ///-----------------------------");
		System.out.println("////////////////////////// FIM ////////////////////////////////");
		
		sc.close();
	}

}
