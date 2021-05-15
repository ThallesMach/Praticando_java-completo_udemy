
//	-----> Seção-6 Aula 47 - Exercícios de Teste de mesa 03 com while  -->14/05/2021.

package aula47;

/**
 * @author Thalles machado
 *
 */
public class Aula47_Teste_mesa03 {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------------------------");
		System.out.println("---> Seção-6 Aula 47 - Exercícios de Teste de mesa 03 com while ");	
		
		int x = 100;
		int y = 100;
		
		while (x != y)  {
			System.out.print("olha");
			
			x = (int) Math.sqrt(y);
			
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