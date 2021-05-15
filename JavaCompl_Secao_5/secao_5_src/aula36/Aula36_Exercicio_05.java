
//	--->Seção-5: Estrutura condicional - Aula36-Exercício 05  -->14/05/2021.

package aula36;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula36_Exercicio_05 {

	public static void main(String[] args) {
	
		
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("-->Com base na tabela abaixo, escreva um programa que leia o código de um item");
		System.out.println("    e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.");
		System.out.println(" --- O código do item, está em imagem no PDF de Exercícios Aula36 --- ");
		System.out.println("--------------------------------------------");
		System.out.println(" * Exemplos ");
		System.out.println("    Entrada:  3, 2 | Saída: Total: R$ 10.00 ");
		System.out.println("    Entrada:  2, 3 | Saída: Total: R$ 13.50 ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java	-------	");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digita o código do item e aperta Entre: ");
		int codigo = sc.nextInt();
		System.out.println(" Digita o código de mais um item e aperta Entre: ");
		int quant = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quant * 4.0;
		}
		else if (codigo == 2) {
			total = quant * 4.5;
		}
		else if (codigo == 3) {
			total = quant * 5.0;
		}
		else if (codigo == 4) {
			total = quant * 2.0;
		}
		else {
			total = quant * 1.5;
		}

		System.out.printf(" ---> Total: R$ %.2f%n", total);
		
		sc.close();
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */