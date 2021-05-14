
//	--->Seção-5 Aula_35-Estrutura condicional (if-else)

package aula35;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula35_if_else {

	public static void main(String[] args) {

		System.out.println("--------------------------------------------------");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutos = sc.nextInt();
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);

		System.out.println("--------------------------------------------------");
		
		sc.close();

	}

}
