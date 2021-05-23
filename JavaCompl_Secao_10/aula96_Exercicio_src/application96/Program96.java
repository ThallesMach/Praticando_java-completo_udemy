
//	----->Seção-10 Aula 96 - Exercício Listas 		--->22/05/2021.

package application96;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities96.Employee96;

/**
 * @author Thalles machado
 *
 */
public class Program96 {

	
	public static void main(String[] args) {
	
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-10 Aula 96 - Exercício Listas    ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("** Na Seção-10 tem PDF desse exercício *** ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" How many employees will be registered? 3   ");
		System.out.println();
		System.out.println("  Emplyoee #1:  ");
		System.out.println("  Id: 333  ");
		System.out.println("  Name: Maria Brown  ");
		System.out.println("  Salary: 4000.00  ");
		System.out.println();
		System.out.println("  Emplyoee #2: ");
		System.out.println("  Id: 536  ");
		System.out.println("  Name: Alex Grey  ");
		System.out.println("  Salary: 3000.00  ");
		System.out.println();
		System.out.println("  Emplyoee #3:  ");
		System.out.println("  Id: 772  ");
		System.out.println("  Name: Bob Green  ");
		System.out.println("  Salary: 5000.00  ");
		System.out.println();
		System.out.println("  Enter the employee id that will have salary increase : 536  ");
		System.out.println("  Enter the percentage: 10.0  ");
		System.out.println();
		System.out.println("  List of employees:  ");
		System.out.println("  333, Maria Brown, 4000.00  ");
		System.out.println("  536, Alex Grey, 3300.00  ");
		System.out.println("  772, Bob Green, 5000.00  ");
		System.out.println();
		System.out.println("---------------------------------------------------------------");		
		System.out.println("---------------------------------------------------------------");		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee96> list = new ArrayList<>();
		
//		Part 01 - Reading Data:
		
		System.out.println(" How many employees will be registered?  ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Employee #"+ i +": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while( hasId(list, id) ) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee96(id, name, salary) );
		}
		
//		Part 02 - UpDate Salary Of Given Employee:
		
		System.out.println();
		System.out.print(" Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee96 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println(" This id does not exist! ");
		} else {
			System.out.print(" Entrer the percentage: ");
			double precentage = sc.nextDouble();
			emp.increaseSalary(precentage);
		}
		
//		Part 03 - Listing Employee:
		
		System.out.println();
		System.out.println(" List of employee: ");
		for (Employee96 objX : list) {
			System.out.println(objX);
		}
		
		sc.close();
		
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
		
	}

	private static boolean hasId(List<Employee96> list, int id) {
		Employee96 emp = list.stream().filter(x -> x.getId() == id ).findFirst().orElse(null);
		
		// TODO Auto-generated method stub
//		return false;
		return emp != null;
	}

}


/*
 Correção em vídeo do exercício proposto:
 
 	https://youtu.be/Xj-osdBe3TE 
 
 */


/**
 * @author Thalles machado
 *
 */