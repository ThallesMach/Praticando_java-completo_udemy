
//--->Seção-8 Aula65 - Criando uma classe com Três atributos para representar melhor o triângulo  -->17/05/2021.

package application65;

import java.util.Locale;
import java.util.Scanner;

import entities65.Triangle_65;

/**
 * @author Thalles machado
 *
 */
public class Program_65 {

	public static void main(String[] args) {
		

		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("--->Seção-8 Aula65 - Criando uma classe com Três atributos para representar melhor o triângulo ");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("***Problema exemplo***");
		System.out.println("-->Fazer um programa para ler as medidas dos lados de dois triângulos X e Y  ");
		System.out.println("    (suponha medidas válidas).Em seguida, mostrar o valor das áreas dos dois  ");
		System.out.println("    triângulos e dizer qual dos dois triângulos possui a maior área.");
		System.out.println("  A fórmula para calcular a área de um triângulo a partir das medidas ");
		System.out.println("   de seus lados a, b e c é a seguinte(fórmula de Heron): ");
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(" *Exemplo: ");
		System.out.println(" Enter the measures of triangle X:  |  Enter the measures of triangle Y:  ");
		System.out.println("                 3.00               |   			7.50 	");
		System.out.println("                 4.00               |   			4.50 	");
		System.out.println("                 5.00               |   			4.02 	");
		System.out.println("  		TriangleX area: 6.0000     ");
		System.out.println("  		TriangleY area: 7.5638     ");
		System.out.println("  		Larger area: Y              ");
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		System.out.println("	-------	Código em Java	-------	");
		
		
		Locale.setDefault(Locale.US); 
		Scanner sc= new Scanner(System.in);

//		double xA, xB, xC, yA, yB, yC;
		
		Triangle_65 x, y;
		x = new Triangle_65();
		y = new Triangle_65();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a+ x.b+ x.c) / 2.0;
		double areaX = Math.sqrt(p* (p-x.a) * (p-x.b) * (p-x.c));
		
		p = (y.a+ y.b+ y.c) / 2.0;
		double areaY= Math.sqrt(p* (p-y.a) * (p-y.b) * (p-y.c));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX> areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		sc.close();
		

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */
