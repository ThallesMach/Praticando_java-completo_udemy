
//	--->Seção-5: Estrutura condicional - Aula36-Exercício 01  -->14/05/2021.

package aula36;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula36_Exercicio_01 {

	
	public static void main(String[] args) {
	
		System.out.println("--------------------------------------------------------");
		System.out.println("-->Fazer um programa para ler um número inteiro,");
		System.out.println("    e depois dizer se este número é negativo ou não.");
		System.out.println("--------------------------------------");
		System.out.println(" * Exemplos");
		System.out.println("    Entrada:  -10, Saída: NEGATIVO ");
		System.out.println("    Entrada:    8, Saída: NAO NEGATIVO ");
		System.out.println("    Entrada:    0, Saída: NAO NEGATIVO ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java	-------	");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digita um número depois aperte Entre: ");
		int x = sc.nextInt();
		
		if (x < 0) {
			  System.out.println("  Seu Nº é NEGATIVO");
		} else {
			  System.out.println(" Seu Nº Não é NEGATIVO");
		}
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("--------------------------------------------------------");		
		
		sc.close();
	}

}


/**
 * @author Thalles machado
 *
 */