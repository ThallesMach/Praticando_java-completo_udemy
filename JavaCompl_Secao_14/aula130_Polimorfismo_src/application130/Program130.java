
//	----->Seção-14 Aula 130 - Exercício resolvido Praticando  Herança e Polimorfismo	--->06/06/2021.

package application130;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities130.Employee130;
import entities130.OutsourcedEmployee130;

/**
 * @author Thalles machado
 *
 */
public class Program130 {


	public static void main(String[] args) {
	
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-14 Aula 130 - Exercício Praticando  Herança e Polimorfismo    ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("*** No PDF tem introdução do exercício *** ");
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee130> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees:  ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee # " + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee130(name, hours, valuePerHour, additionalCharge) );
			}
			else {
				list.add(new Employee130(name, hours, valuePerHour) );
			}
			
			
		}
		
		System.out.println();
		System.out.println("--> PAYMENTS:");
		for (Employee130 emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
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