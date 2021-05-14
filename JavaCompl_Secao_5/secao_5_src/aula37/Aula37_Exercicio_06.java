
//	--->Seção-5 Aula37-Exercício 06


package aula37;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author machado
 *
 */
public class Aula37_Exercicio_06 {

	public static void main(String[] args) {

		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("-->Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem");
		System.out.println("    dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) ");
		System.out.println("    este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos,");
		System.out.println("    deverá ser impressa a mensagem “Fora de intervalo”.");
		System.out.println("--------------------------------------------");
		System.out.println(" * Exemplos ");
		System.out.println("    Entrada:  25.01 | Saída: Intervalo (25,50] ");
		System.out.println("    Entrada:  25.00 | Saída: Intervalo [0,25] ");
		System.out.println("    Entrada:  100.00 | Saída: Intervalo (75,100] ");
		System.out.println("    Entrada:  -25.02 | Saída: Fora de intervalo ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java	-------	");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digita um Nº e depois aperte Entre: ");
		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("---> Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("---> Intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("---> Intervalo (25,50]");
		}
		else if (numero <= 75.0) {
			System.out.println("---> Intervalo (50,75]");
		}		
		else {
			System.out.println("---> Intervalo (75,100]");
		}
		
		
		sc.close();
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("-------------------------------------------------------------------------------------------");		
		
	}

}


/**
 * @author machado
 *
 */