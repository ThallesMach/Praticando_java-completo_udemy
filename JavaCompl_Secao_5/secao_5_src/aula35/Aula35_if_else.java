
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
		
		System.out.println(" Quantas horas? ");
		int horas = sc.nextInt();
		
		if (horas < 12) {
			System.out.println(" Bom dia");
		}
		else if (horas < 18) {
				System.out.println(" Boa Tarde");		
		}
		
		else {
				System.out.println(" Boa Noite");
		}
		
		System.out.println("--------------------------------------------------");
				
		sc.close();

	}

}

/**
 * @author Thalles machado
 *
 */