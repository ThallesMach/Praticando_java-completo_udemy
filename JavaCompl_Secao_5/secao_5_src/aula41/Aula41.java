
//	--->Seção-5: Estrutura condicional - Aula 41 Escopo e inicialização  -->14/05/2021.

package aula41;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula41 {

	public static void main(String[] args) {

		System.out.println("-------------------------------------");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** Digita o valor do preço e aperte Entre: ");
		double price = sc.nextDouble();
		
		double discount;
		
		if (price > 100.0) {
			 discount = price * 0.1;
		}
		else {
			 discount = 0;
		}
		System.out.println(discount);

		sc.close();
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("-------------------------------------");

	}

}

/**
 * @author Thalles machado
 *
 */