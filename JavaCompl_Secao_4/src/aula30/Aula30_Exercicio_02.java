
//	---> Seção-4 Aula30-Exercício 02  ---> 13/05/2021.


package aula30;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula30_Exercicio_02 {

	
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("----->Faça um programa para ler o valor do raio de um círculo,");
		System.out.println("	e depois mostrar o valor da área deste círculo com quatro casas");
		System.out.println("	decimais conforme exemplos.");
		System.out.println("	  Fórmula da área: area = π . raio2 ");
		System.out.println("	  Considere o valor de π = 3.14159");
		System.out.println("-------------------------------------------------------------------------");

		System.out.println("  ---> Exemplos:\n"
				+ " * 	Entrada:   2.00   |  Saída: A=12.5664 \n"
				+ " * 	Entrada: 100.64   |  Saída: A=31819.3103 \n"
				+ " * 	Entrada: 150.00   |  Saída: A=70685.7750 .");
		System.out.println("-------------------------------------------------------------");

		System.out.println("         --- Exercício Feito em Código Java --- ");
		
		double a = 2.00,  pi01 = 3.14159;
		double resultado01 = a * a * pi01;
		System.out.printf("	 Entrada:    %.2f  |  Saída: A =  %.4f %n", a,  resultado01);
		
		double b = 100.64,  pi02 = 3.14159;
		double resultado02 = b * b * pi02;
		System.out.printf("	 Entrada:  %.2f  |  Saída: A =  %.4f %n", b,  resultado02);
		
		double c = 150.00,  pi03 = 3.14159;
		double resultado03 = c * c * pi03;
		System.out.printf("	 Entrada:  %.2f  |  Saída: A =  %.4f %n", c,  resultado03);

		System.out.println("-------------------------------------------------------------");

		System.out.println("-------------------------/////-------------------------------");

		System.out.println("---------------- Outro jeito com Scanner --------------------");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
	    
		System.out.println(" Digita valor da Área e parte Entre: ");
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("   	   Entrada: %.2f   |   Resultado: da A = %.4f %n", R, A);

		System.out.println("-----------------------/// FIM ///-----------------------------");
		System.out.println("////////////////////////// FIM ////////////////////////////////");

	    
		sc.close();
		
		
	}

}
