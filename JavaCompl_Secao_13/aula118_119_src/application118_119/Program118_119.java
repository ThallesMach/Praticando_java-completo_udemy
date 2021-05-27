
//	----->Seção-13 Aula 118 e 119 - Exercício  	--->26/05/2021.

package application118_119;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums118_119.WorkerLevel118_119;
import entities118_119.Department118_119;
import entities118_119.HourContrat118_119;
import entities118_119.Worker118_119;


/**
 * @author Thalles machado
 *
 */
public class Program118_119 {

	
	public static void main(String[] args) throws ParseException {
	
	
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-13 Aula 118 e 119 - Exercício    ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("*** No PDF tem intrudução do exercíco *** ");
		System.out.println("---------------------------------------------------------------");
		System.out.println();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name:  ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker118_119 worker = new Worker118_119(workerName, WorkerLevel118_119.valueOf(workerLevel), baseSalary, new Department118_119(departmentName)  );

		System.out.print("How many contracts to this worker?  ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next() );
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContrat118_119 contract = new HourContrat118_119(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2) );
		int year = Integer.parseInt(monthAndYear.substring(3) );
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartement().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month) ) );
		
		
		sc.close();
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */