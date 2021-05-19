
//	--->Seção-8 Aula 70 - Exercício 02   -->19/05/2021.

package application70_02;

import java.util.Locale;
import java.util.Scanner;

import entities70_02.Employee70_02;


/**
 * @author Thalles machado
 *
 */
public class Program_70_02 {

	public static void main(String[] args) {

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("----->Seção-8 Aula 70 - Exercício 02  ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("***Exercício 02 ***");
		System.out.println("-->Fazer um programa para ler os valores da largura e altura de um retângulo. Em   ");
		System.out.println("    seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o ");
		System.out.println("    salário do funcionário com base em uma porcentagem dada (somente o salário bruto é");
		System.out.println("    afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe");
		System.out.println("    projetada abaixo. ");

		System.out.println("--------------------------------------------------------------------------");
		System.out.println(" *Exemplo: ");
		System.out.println("	Name: Joao Silva ");
		System.out.println("	Gross salary: 6000.00	");
		System.out.println("	Tax: 1000.00	");
		System.out.println();
		System.out.println("  Employee: Joao Silva, $ 5000.00 ");
		System.out.println("  Which percentage to increase salary? 10.0  ");
		System.out.println("  Update ddata: Joao Silva, $ 5600.00 ");

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		System.out.println("	-------	Código em Java	-------	");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee70_02 emp = new Employee70_02();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+ emp );
		System.out.println();
		System.out.println("Wich percentage to increase salary? ");
		double precentage = sc.nextDouble();
		emp.increaSalary(precentage);
		
		System.out.println();
		System.out.println("Update data: "+ emp);
		sc.close();
		
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */
