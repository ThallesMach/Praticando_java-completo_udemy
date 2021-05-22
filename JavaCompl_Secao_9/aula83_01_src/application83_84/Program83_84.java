
//	----->Seção-9 Aula 83 e 84 - Correção do exercício de fixação 	--->22/05/2021.

package application83_84;

import java.util.Locale;
import java.util.Scanner;

import entities83_84.Account83_84;

/**
 * @author Thalles machado
 *
 */
public class Program83_84 {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-9 Aula 83 e 84 - Correção do exercício de fixação ");
		System.out.println("-----------------------------------------------------------------------------");

		System.out.println("   --- Na Seção-9 tem PDF do exmplo --- ");

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("***Problema exemplo 01 *** ");
		System.out.println(" Enter account number: 8532 ");
		System.out.println(" Enter account holder: Alex Green	");
		System.out.println(" Is there na initial deposit (y/n)? y	");
		System.out.println(" Enter initial deposit value: 500.00	");
		System.out.println();
		System.out.println(" Account data:   ");
		System.out.println(" Account 8532, Holder: Alex Green, Balance: $ 500.00    ");
		System.out.println();
		System.out.println(" Entera deposit value: 200.00  ");
		System.out.println(" Updated account data:  ");
		System.out.println(" Account 8532, Holder: Alex Green, Balance: $ 700.00   ");
		System.out.println();
		System.out.println(" Entera withdraw value: 300.00  ");
		System.out.println(" Updated account data:  ");
		System.out.println(" Account 8532, Holder: Alex Green, Balance: $ 395.00   ");

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("***Problema exemplo 02 *** ");
		System.out.println(" Enter account number: 7801 ");
		System.out.println(" Enter account holder: Maria Brown	");
		System.out.println(" Is there na initial deposit (y/n)? n	");
		System.out.println();
		System.out.println(" Account data:   ");
		System.out.println(" Account 7801, Holder: Maria Brown, Balance: $ 0.00    ");
		System.out.println();
		System.out.println(" Entera deposit value: 200.00  ");
		System.out.println(" Updated account data:  ");
		System.out.println(" Account 7801, Holder: Maria Brown, Balance: $ 200.00   ");
		System.out.println();
		System.out.println(" Entera withdraw value: 198.00  ");
		System.out.println(" Updated account data:  ");
		System.out.println(" Account 7801, Holder: Maria Brown, Balance: $ -3.00   ");
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		System.out.println("	-------	Código em Java	-------	");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account83_84 account;
		
		System.out.println(" Enter account number:  ");
		int number = sc.nextInt();
		System.out.println(" Enter account holder:  ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println(" Is there na initial deposit (y/n)?  ");
		char response =sc.next().charAt(0);
		if (response == 'y') {
			System.out.println(" Enter initial deposit value:  ");
			double initialDeposit = sc.nextDouble();
			account = new Account83_84(number, holder, initialDeposit);
		} else {
			account = new Account83_84(number, holder);
		}
		
		System.out.println();
		System.out.println(" Account data:   ");
		System.out.println(account);
		
		System.out.println();
		System.out.print(" Enter a deposit value:  ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println(account);
		
		System.out.println();
		System.out.print(" Enter a withdraw value:  ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println(account);
		
		sc.close();

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");

	}

}

/**
 * @author Thalles machado
 *
 */