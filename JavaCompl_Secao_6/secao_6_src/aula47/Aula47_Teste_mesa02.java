
//	-----> Seção-6 Aula 47 - Exercícios de Teste de mesa 02 com while  -->14/05/2021.

package aula47;

/**
 * @author Thalles machado
 *
 */
public class Aula47_Teste_mesa02 {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------------------------");
		System.out.println("---> Seção-6 Aula 47 - Exercícios de Teste de mesa 02 com while ");

		int x = 2;
		int y = 0;
		
		while (x < 60) {
			System.out.println(x);
			x = x * 2;
			y = y + 10;
			
			System.out.println( x + " - " + y);
		}
		System.out.printf(" Valor Final: X = %d | Y = %d %n ", x, y);			

		System.out.println("        ---> FIM <--- ");
		System.out.println("---------------------------------------------------------------");

	}

}

/**
 * @author Thalles machado
 *
 */