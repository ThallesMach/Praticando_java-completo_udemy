
//	---> Seção-4 Aula30-Exercício 06  ---> 13/05/2021.

package aula30;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula30_Exercicio_06 {

	public static void main(String[] args) {

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("--->Fazerum programa que leia três valores");
		System.out.println("     com ponto flutuante de dupla precisão:");
		System.out.println("     A, B e C. Em seguida, calcule e mostre: ");

		System.out.println("  a) a área do triângulo retângulo que tem A por base e C por altura.");
		System.out.println("  b) a área do círculo de raio C. (pi = 3.14159)");
		System.out.println("  c) a área do trapézio que tem A e B por bases e C por altura. ");
		System.out.println("  d) a área do quadrado que tem lado B. ");
		System.out.println("  e) a área do retângulo que tem lados A e B.");
		System.out.println("--------------------------------------------------------------------------------------------------------");

		System.out.println("  ---> Exemplo: ");
		System.out.println(" *  Entrada:  A: 3.0  | B: 4.0  | C:  5.2");
		System.out.println(" *  Saída:  ");
		System.out.println("    TRIANGULO: 7.800 | CIRCULO: 84.949 | TRAPEZIO: 18.200 | QUADRADO: 16.000 | RETANGULO: 12.000");
		System.out.println("--------------------------------------------------------------------------------------------------------");

		System.out.println(" *  Entrada:  A: 12.7  | B: 10.4  | C:   15.2");
		System.out.println(" *  Saída:  ");
		System.out.println("    TRIANGULO: 96.520 | CIRCULO: 725.833 | TRAPEZIO: 175.560 | QUADRADO: 108.160 | RETANGULO: 132.080 ");
		System.out.println("--------------------------------------------------------------------------------------------------------");

		
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

		System.out.println("-------------------------/////-------------------------------");
		System.out.println("         --- Exercício Feito em Código Java --- ");

		double a = 3.0, b = 4.0, c =  5.2;
		
		double triangulo01 = a * c / 2.0;
		double circulo01 = 3.14159 * c * c;
		double trapezio01 = (a + b) / 2.0 * c;
		double quadrado01 = b * b;
		double retangulo01 = a * b;		
		
		System.out.println(" *  Entrada:  A: 3.0  | B: 4.0  | C:  5.2");
		System.out.println(" *  Saída:  ");
		System.out.printf("    TRIANGULO: %.3f | CIRCULO: %.3f | TRAPEZIO: %.3f | QUADRADO: %.3f | RETANGULO: %.3f \n", 
				triangulo01, circulo01, trapezio01, quadrado01, retangulo01);
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		
		double d =  12.7, e = 10.4, f = 15.2;
		
		double triangulo02 = d * f / 2.0;
		double circulo02 = 3.14159 * f * f;
		double trapezio02 = (d + e) / 2.0 * f;
		double quadrado02 = e * e;
		double retangulo02 = d * e;		
		
		System.out.println(" *  Entrada:  A: 3.0  | B: 4.0  | C:  5.2");
		System.out.println(" *  Saída:  ");
		System.out.printf("    TRIANGULO: %.3f | CIRCULO: %.3f | TRAPEZIO: %.3f | QUADRADO: %.3f | RETANGULO: %.3f \n", 
				triangulo02, circulo02, trapezio02, quadrado02, retangulo02);
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("---------------------///////////////---------------------------");

		
		System.out.println("-------------------------/////-------------------------------");

		System.out.println("---------------- Outro jeito com Scanner --------------------");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println(" Digita valor de A e aperte Entre: ");		
		A = sc.nextDouble();
		System.out.println(" Digita valor de B e aperte Entre: ");
		B = sc.nextDouble();
		System.out.println(" Digita valor de C e aperte Entre: ");
		C = sc.nextDouble();
		
		triangulo01 = A * C / 2.0;
		circulo01 = 3.14159 * C * C;
		trapezio01 = (A + B) / 2.0 * C;
		quadrado01 = B * B;
		retangulo01 = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo01);
		System.out.printf("CIRCULO: %.3f%n", circulo01);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio01);
		System.out.printf("QUADRADO: %.3f%n", quadrado01);
		System.out.printf("RETANGULO: %.3f%n", retangulo01);
		
		System.out.println("---------------------////////////////--------------------------");
		System.out.println("-----------------------/// FIM ///-----------------------------");
		System.out.println("////////////////////////// FIM ////////////////////////////////");
		
		
		sc.close();
		
		
		/**
		 * @author Thalles machado
		 *
		 */
	}

}
