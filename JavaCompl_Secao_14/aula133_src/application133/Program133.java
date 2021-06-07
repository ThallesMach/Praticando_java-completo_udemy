
//	----->Seção-14 Aula 133 - Métodos abstratos	--->06/06/2021.

package application133;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enuns133.Color133;
import entities133.Circle133;
import entities133.Rectangle133;
import entities133.Shape133;

/**
 * @author Thalles machado
 *
 */
public class Program133 {

	
	public static void main(String[] args) {
	
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("--->Seção-14 Aula 133 - Métodos abstratos     ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("*** No PDF tem introdução do exercício *** ");
		System.out.println("---------------------------------------------------------------");
		System.out.println();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape133> list = new ArrayList<Shape133>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.println("Shape # "+ i +" data: ");
			System.out.print("Rectangle or Circle (r/c) ? ");
			
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK / BLUE / RED): ");
			Color133 color = Color133.valueOf(sc.next() );
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle133(color, width, height) );
			} 
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle133(color, radius) );
			}
		}
		
		System.out.println();
		System.out.println("* Shape Areas: ");
		for (Shape133 shape : list) {
			System.out.println(String.format(" %.2f ", shape.area() ) );
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