
//	--->Seção-8 Aula 72 - Versão 03 Membros estáticos - Parte 2   -->19/05/2021.

package application72;

import java.util.Locale;
import java.util.Scanner;

import util72.Calculator72;

/**
 * @author Thalles machado
 *
 */
public class Program_72 {


	public static void main(String[] args) {

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("----->Seção-8 Aula 72 - Versão 03 Membros estáticos - Parte 2   ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("***Problema exemplo ***");
		System.out.println("-->Fazer um programa para ler um valor numérico qualquer, e daí mostrar    ");
		System.out.println("    quanto seria o valor de uma circunferência e do volume de uma esfera ");
		System.out.println("    para um raio daquele valor. Informar também o valor de PI com duas ");
		System.out.println("    casas decimais. ");

		System.out.println("--------------------------------------------------------------------------");
		System.out.println(" *Exemplo: ");
		System.out.println("    Enter radius:   3.0    ");
		System.out.println("    Circumference: 18.85 ");
		System.out.println("    Volume:       113.10       ");
		System.out.println("    PI value:       3.14      ");
		System.out.println();

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		System.out.println("	-------	Código em Java	-------	");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Calculator72 calcul = new Calculator72();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator72.circumference(radius);
		double v = Calculator72.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator72.PI);
		sc.close();

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}
	
	

}


/**
 * @author Thalles machado
 *
 */
