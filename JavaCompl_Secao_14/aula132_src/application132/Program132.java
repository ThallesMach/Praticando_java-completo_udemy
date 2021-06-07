
//	----->Seção-14 Aula 132 - Classes abstratas	--->06/06/2021.

package application132;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities132.Account132;
import entities132.BusinessAccount132;
import entities132.SavingsAccount132;

/**
 * @author Thalles machado
 *
 */
public class Program132 {

	public static void main(String[] args) {
	

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("--->Seção-14 Aula 132 - Classes abstratas     ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("*** No PDF tem introdução do exercício *** ");
		System.out.println("---------------------------------------------------------------");
		System.out.println();

		Locale.setDefault(Locale.US);
		List<Account132> list = new ArrayList<>();
		
		list.add(new SavingsAccount132(1001, "Alex", 500.00, 0.01) );
		list.add(new BusinessAccount132(1002, "Maria", 1000.0, 400.0) );
		list.add(new SavingsAccount132(1004, "Bob", 300.0, 0.01) );
		list.add(new BusinessAccount132(1005, "Anna", 500.0, 500.0) );
		
		double sum = 0;
		for (Account132 acc132 : list) {
			sum += acc132.getBalance();
		}
		System.out.printf(" Total balance: %.2f %n", sum);
		
		for (Account132 acc002 : list) {
			acc002.deposit(10.0);
		}
		for (Account132 acc003 : list) {
			System.out.printf("* Update balance for account %d: %.2f %n", acc003.getNember(), acc003.getBalance() );
		}
		
		

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */