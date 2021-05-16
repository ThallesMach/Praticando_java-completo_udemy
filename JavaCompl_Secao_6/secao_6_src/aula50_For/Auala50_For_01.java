
//		---> Seção-6 Aula 50 - Estrutura repetitiva para (for)   -->16/05/2021.

package aula50_For;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Auala50_For_01 {

	public static void main(String[] args) {

		

		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("-----> Seção-6 Aula 50 - Estrutura repetitiva para (for) ");
		System.out.println("---------------------------------------------------------");
		System.out.println("	-------	Código em Java	-------	");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("* Digita alguma Nº: ");
		int n = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < n; i++) {    //for (int i = 0; i < n; i=i+1) {
			System.out.println(" Valor de i: "+ i);
			int x = sc.nextInt();
			soma += x;            //soma = soma + x;
			System.out.printf("--> Nº dentro do Loop For: %d | %d  %n", soma, x);
		}
		System.out.printf("-> Resultando Final: %d  %n",soma);
		
		sc.close();
		

		System.out.println("           ---> FIM <--- ");
		System.out.println("-------------------------------------------------------------------------------------------------");
	}

}


/**
 * @author Thalles machado
 *
 */
