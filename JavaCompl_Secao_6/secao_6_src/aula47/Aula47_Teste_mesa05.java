
//	-----> Seção-6 Aula 47 - Exercícios de Teste de mesa 05 com while  -->14/05/2021.

package aula47;

/**
 * @author Thalles machado
 *
 */
public class Aula47_Teste_mesa05 {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------------------------");
		System.out.println("---> Seção-6 Aula 47 - Exercícios de Teste de mesa 05 com while ");	
		
		int x = 2;
		int y = 10;
		
		System.out.println("Olá");
		
		while (x < y) {
			System.out.println(x + "-" + y);
			x = x * 2;
			y = y + 1;
			
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