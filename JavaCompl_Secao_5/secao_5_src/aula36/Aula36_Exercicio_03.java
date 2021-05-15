
//	--->Seção-5: Estrutura condicional - Aula36-Exercício 03  -->14/05/2021.

package aula36;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula36_Exercicio_03 {

	public static void main(String[] args) {


		System.out.println("---------------------------------------------------------------------------");
		System.out.println("-->Leia 2 valores inteiros (A e B). ");
		System.out.println("  Após, o programa deve mostrar uma mensagem ");
		System.out.println("   'São Multiplos' ou 'Não são Multiplos', " );
		System.out.println("   'São Multiplos' ou Não são Multiplos', " );
		System.out.println("   indicando se os valores lidos são múltiplos entre si. Atenção: ");
		System.out.println("   os números devem poder ser digitados em ordem crescente ou decrescente.");
		System.out.println("----------------------------------------------");
		System.out.println(" * Exemplos ");
		System.out.println("    Entrada:  6, 24 | Saída: São Multiplos ");
		System.out.println("    Entrada:  6, 25 | Saída: Não São Multiplos");
		System.out.println("    Entrada: 25,  6 | Saída: São Multiplos ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java	-------	");

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digita um número depois aperte Entre: ");
		int a = sc.nextInt();
		System.out.println(" Digita mais um número depois aperte Entre: ");
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
				System.out.println(" ---> São Multiplos ");
		} else {
				System.out.println(" ---> Não São Multiplos ");
		}
		
		sc.close();

		System.out.println("        ---> FIM <--- ");
		System.out.println("---------------------------------------------------------------------------");
		
	}

}

/**
 * @author Thalles machado
 *
 */