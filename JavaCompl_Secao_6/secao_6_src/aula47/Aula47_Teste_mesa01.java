
//	-----> Seção-6 Aula 47 - Exercícios de Teste de mesa com while  -->14/05/2021.

package aula47;

/**
 * @author Thalles machado
 *
 */
public class Aula47_Teste_mesa01 {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------------------------");
		System.out.println("---> Seção-6 Aula 47 - Exercícios de Teste de mesa 01 com while ");

		int A = 5;
		int B = 0;
		while (A > 2) {
			System.out.print(A);
			B = B + A;
			A = A - 1;
			
			System.out.println( A + " - " + B);
		}
		System.out.printf(" Valor Final: X = %d | Y = %d %n ", A, B);

		System.out.println("        ---> FIM <--- ");
		System.out.println("---------------------------------------------------------------");

	}

}

/**
 * @author Thalles machado
 *
 */