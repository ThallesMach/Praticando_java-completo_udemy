
//	--->Seção-8 Aula 71 - Versão 02 Membros estáticos - Parte 1   -->19/05/2021.

package application71_02;

import java.util.Locale;
import java.util.Scanner;

import util72.Calculator72;

/**
 * @author Thalles machado
 *
 */
public class Program_71_02 {


	public static void main(String[] args) {

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("----->Seção-8 Aula 71 - Versão 02 Membros estáticos - Parte 1   ");
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
		
		Calculator72 calcul = new Calculator72();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calcul.circumference(radius);
		double v = calcul.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calcul.PI);
		sc.close();

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}
	
	

}


/**
 * @author Thalles machado
 *
 */
