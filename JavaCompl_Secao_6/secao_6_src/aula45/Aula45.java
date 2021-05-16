
//	-----> Seção-6 Aula 45 - Estrutura repetitiva enquanto (while)   -->14/05/2021.

package aula45;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula45 {

	public static void main(String[] args) {

		System.out.println("-------------------------------------");

		Scanner sc = new Scanner(System.in);

		System.out.println("* Digita Nº decrescente 5 á 0 : ");
		int x = sc.nextInt();

		int soma = 0;
		while (x != 0) {
			soma += x; // soma = soma + x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		System.out.println(x);

		System.out.println("        ---> FIM <--- ");
		System.out.println("-------------------------------------");

	}

}

/*
	Resumo da aula
		•Estrutura repetitiva"enquanto"
		•Recomendada quando não se sabe previamente a quantidade de repetições
			•Regra:
				•V: executa e volta
				•F: pula fora
*/

				
/**
 * @author Thalles machado
 *
 */