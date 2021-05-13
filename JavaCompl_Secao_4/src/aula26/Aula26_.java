
//	---> Seção-4 Aula 26 Entrada de dados em Java - Parte 1

package aula26;

/**
 * @author Thalles machado
 *
 */

import java.util.Locale;
import java.util.Scanner;

public class Aula26_ {

	public static void main(String[] args) {

//		System.out.println(" Teste Aula 26");
		
//		Scanner sc = new Scanner(System.in);
		
//		String x;
//		x = sc.next();
//		System.out.println("Voce digitou: "+ x);
		
//		System.out.println("--------//----------");
		
//		int x;
//		x = sc.nextInt();
//		System.out.println("Voce digitou: "+ x);

		System.out.println("--------//----------");
		
//		double x;
//		x = sc.nextDouble();  //Localidade do sistema
//		System.out.println("Voce digitou: "+ x);
//		System.out.printf("Voce digitou: %.2f%n", x);
		
		System.out.println("--------//----------");
		
		
/*		ATENÇÃO:
			Para considerar o separador de decimais como ponto, ANTESda declaração do Scanner, 
				faça:
					Locale.setDefault(Locale.US);
*/
		
		Locale.setDefault(Locale.US);  // Agora tem q Digita com Ponto  " . "
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();  //Localidade do sistema
		System.out.println("Voce digitou: "+ x);
		System.out.printf("Voce digitou: %.2f%n", x);
		
		System.out.println("--------//----------");
		
		sc.close();

		/**
		 * @author Thalles machado
		 *
		 */
	}

}
