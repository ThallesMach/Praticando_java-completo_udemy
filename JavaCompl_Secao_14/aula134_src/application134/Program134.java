
//	----->Seção-14 Aula 134 - Exercício Fixação	--->06/06/2021.

package application134;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities134.Company134;
import entities134.Individual134;
import entities134.TaxaPayer134;

/**
 * @author Thalles machado
 *
 */
public class Program134 {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("--->Seção-14 Aula 134 - Exercício Fixação     ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("*** No PDF tem introdução do exercício *** ");
		System.out.println("---------------------------------------------------------------");
		System.out.println();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxaPayer134> list = new ArrayList<TaxaPayer134>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual134(name, income, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company134(name, income, numberOfEmployees));
			}
			
		}
		double sum = 0;
		System.out.println();
		System.out.println("Taxes PAID: ");
		for (TaxaPayer134 tp : list) {
			double tax  = tp.tax();
			System.out.println(tp.getName()+ ": $ "+ String.format("%.2f", tax) );
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */