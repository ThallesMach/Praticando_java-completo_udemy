
//	---> Seção-4 Aula30-Exercício 04.1  ---> 13/05/2021.

package aula30;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula30_Exercicio_04_1 {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("--->Fazerum programa que leia o número de um funcionário,");
		System.out.println("   seu número de horas trabalhadas, ");
		System.out.println("    o valor que recebe por hora e calcula o salário desse funcionário. ");
		System.out.println("    A seguir, mostre o número e o salário do funcionário, com duas casas decimais.");
		System.out.println("-------------------------------------------------------------------------------------");
		
		System.out.println("  ---> Exemplos: ");
		System.out.println(" * 	 Nº Fucion: 25  | T/horas: 100hs  | Valor h: $ 5.50 ");
		System.out.println(" *  NUMBER Fucion = 25  |  SALARY = U$ 550.00 ");
		System.out.println("------------------------------------------------------------");
		System.out.println(" * 	 Nº Fucion:  1  | T/horas: 200hs  | Valor h: $ 20.50 ");
		System.out.println(" *  NUMBER Fucion =  1  |  SALARY = U$ 4100.00 ");
		System.out.println("------------------------------------------------------------");
		System.out.println(" * 	 Nº Fucion:  6  | T/horas: 145hs  | Valor h: $ 15.55 ");
		System.out.println(" *  NUMBER Fucion =  6  |  SALARY = U$ 2254.75 ");
		System.out.println("------------------------------------------------------------");

		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		
		System.out.println("-------------------------/////-------------------------------");
		System.out.println("         --- Exercício Feito em Código Java --- ");

		double a = 25, b = 100, c = 5.5;
		double salary01 = b * c;		
		System.out.printf(" * 	   Nº Fucion: %.0f  | T/horas: %.0fhs  | Valor h: $ %.2f \n ",a, b, c);
		System.out.printf(" *  NUMBER Fucion =  %.0f  |  SALARY = U$ %.2f \n", a, salary01);
		System.out.println("------------------------------------------------------------");

		double d = 2, e = 200, f = 20.5;
		double salary02 = e * f;		
		System.out.printf(" * 	   Nº Fucion: %.0f  | T/horas: %.0fhs  | Valor h: $ %.2f \n ",d, e, f);
		System.out.printf(" *  NUMBER Fucion =  %.0f  |  SALARY = U$ %.2f \n", d, salary02);
		System.out.println("------------------------------------------------------------");

		double r = 6, s = 145, t = 15.55;
		double salary03 = s * t;		
		System.out.printf(" * 	   Nº Fucion: %.0f  | T/horas: %.0fhs  | Valor h: $ %.2f \n ",r, s, t);
		System.out.printf(" *  NUMBER Fucion =  %.0f  |  SALARY = U$ %.2f \n", r, salary03);
		System.out.println("------------------------------------------------------------");
		System.out.println("---------------------///////////////---------------------------");
		
		System.out.println("-------------------------/////-------------------------------");

		System.out.println("---------------- Outro jeito com Scanner --------------------");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, S, T, Salary;
		
		System.out.println(" Digita Nº Funcionário e Aperte Entre: ");
		R = sc.nextDouble();
		System.out.println(" Digita Nº h/t e Aperte Entre: ");
		S = sc.nextDouble();
		System.out.println(" Digita o valor p/h e Aperte Entre: ");
		T = sc.nextDouble();
		
		Salary = S * T;		
		System.out.printf(" * 	   Nº Fucion: %.0f  | T/horas: %.0fhs  | Valor h: $ %.2f \n ",R, S, T);
		System.out.printf(" *  NUMBER Fucion =  %.0f  |  SALARY = U$ %.2f \n", R, Salary);
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("---------------------////////////////--------------------------");
		System.out.println("-----------------------/// FIM ///-----------------------------");
		System.out.println("////////////////////////// FIM ////////////////////////////////");
		
		sc.close();
		
		/**
		 * @author Thalles machado
		 *
		 */
		
	}

}
