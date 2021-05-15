
//	--->Seção-5: Estrutura condicional - Aula36-Exercício 02  -->14/05/2021.


package aula36;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula36_Exercicio_02 {

	public static void main(String[] args) {
	
		System.out.println("--------------------------------------------------------");
		System.out.println("-->Fazer um programa para ler um número ");
		System.out.println("   inteiro e dizer se este número é par ou ímpar.");
		System.out.println("-----------------------------------");
		System.out.println(" * Exemplos ");
		System.out.println("    Entrada:   12 | Saída: PAR ");
		System.out.println("    Entrada:  -27 | Saída: IMPAR ");
		System.out.println("    Entrada:    0 | Saída: PAR ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java	-------	");

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digita um número depois aperte Entre: ");
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
				System.out.println(" PAR");
		} else {
				System.out.println(" IMPAR");
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