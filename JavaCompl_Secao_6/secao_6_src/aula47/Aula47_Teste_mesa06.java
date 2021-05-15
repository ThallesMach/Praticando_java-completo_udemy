
//	-----> Seção-6 Aula 47 - Exercícios de Teste de mesa 06 com while  -->14/05/2021.

package aula47;

/**
 * @author Thalles machado
 *
 */
public class Aula47_Teste_mesa06 {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------------------------");
		System.out.println("---> Seção-6 Aula 47 - Exercícios de Teste de mesa 06 com while ");

		int x = 4;
		int y = 0;
		int i = 0;
		
		while (i < x) {
			i = i + 1;
			y = y + i;
			System.out.print(i);
			System.out.println(y);
			
			System.out.println(x + " - " + y + " - " + i);
		}
		System.out.printf(" Valor Final: X = %d | Y = %d | i = %d %n ", x, y, i);

		System.out.println("        ---> FIM <--- ");
		System.out.println("---------------------------------------------------------------");

	}

}

/**
 * @author Thalles machado
 *
 */