
//	--->Seção-8 Aula 64 - Resolvendo um problema sem orientação a objetos  -->17/05/2021.

package application64;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Program_64 {

	public static void main(String[] args) {
		

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("----->Seção-8 Aula 64 - Resolvendo um problema sem orientação a objetos ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("***Problema exemplo***");
		System.out.println("-->Fazer um programapara ler as medidas dos lados de dois triângulos X e Y  ");
		System.out.println("    (suponha medidas válidas).Em seguida, mostrar o valor das áreas dos dois  ");
		System.out.println("    triângulos e dizer qual dos dois triângulos possui a maior área.");
		System.out.println("  A fórmula para calcular a área de um triângulo a partir das medidas ");
		System.out.println("   de seus lados a, b e c é a seguinte(fórmuladeHeron): ");
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(" *Exemplo: ");
		System.out.println(" Enter the measures of triangle X:  |  Enter the measures of triangle Y:  ");
		System.out.println("                 3.00               |   			7.50 	");
		System.out.println("                 4.00               |   			4.50 	");
		System.out.println("                 5.00               |   			4.02 	");
		System.out.println("  		TriangleX area: 6.0000     ");
		System.out.println("  		TriangleY area: 7.5638     ");
		System.out.println("  		Largerarea: Y              ");
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		System.out.println("	-------	Código em Java	-------	");
		
		
		Locale.setDefault(Locale.US); 
		Scanner sc= new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA+ xB+ xC) / 2.0;
		double areaX = Math.sqrt(p* (p-xA) * (p-xB) * (p-xC));
		
		p = (yA+ yB+ yC) / 2.0;
		double areaY= Math.sqrt(p* (p-yA) * (p-yB) * (p-yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX> areaY) {
			System.out.println("Largerarea: X");
		}else {
			System.out.println("Largerarea: Y");
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
