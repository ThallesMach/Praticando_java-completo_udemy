
//	--->Seção-8 Aula 70 - Exercício 01   -->19/05/2021.

package application70_01;

import java.util.Locale;
import java.util.Scanner;

import entities70_01.Rectangle70_01;

/**
 * @author Thalles machado
 *
 */
public class Program_70_01 {

	public static void main(String[] args) {

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("----->Seção-8 Aula 70 - Exercício 01  ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("***Exercício 01 ***");
		System.out.println("-->Fazer um programa para ler os valores da largura e altura   ");
		System.out.println("    de um retângulo. Em seguida, mostrar na tela o valor de  ");
		System.out.println("    sua área, perímetro e diagonal. Usar uma classe como ");
		System.out.println("    mostrado no projeto ao lado. ");

		System.out.println("--------------------------------------------------------------------------");
		System.out.println(" *Exemplo: ");
		System.out.println("	Enter rectangle width and height: ");
		System.out.println("	 3.00	");
		System.out.println("	 4.00	");
		System.out.println(" AREA = 12.00	");
		System.out.println(" PERIMETER = 14.00   ");
		System.out.println(" DIAGONAL = 5.00     ");

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		System.out.println("	-------	Código em Java	-------	");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle70_01 rect = new Rectangle70_01();

		System.out.println(" Enter rectangle width and height:  ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();

		System.out.printf(" Area = %.2f %n", rect.area() );
		System.out.printf(" Perimeter = %.2f %n", rect.perimeter() );
		System.out.printf(" Diagonal = %.2f %n", rect.diagonal() );		

		sc.close();

		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */
