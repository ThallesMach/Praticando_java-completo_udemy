
//	----->Seção-10 Aula 91 - Exercício de fixação 		--->22/05/2021.

package application91;

//import java.text.ParseException;
import java.util.Scanner;

import entities91.Rent91;

/**
 * @author Thalles machado
 *
 */
public class Program91 {

//	public static void main(String[] args) throws ParseException{

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-10 Aula 91 - Exercício de fixação   ");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("** Na Seção-10 tem PDF desse exercício *** ");
		
		System.out.println("--------------------------------------------");
		System.out.println("*How many rooms will be rented? 3 ");
		System.out.println();
		System.out.println("Rent #1:   ");
		System.out.println("Name:  Maria Green ");
		System.out.println("Email: maria@gmail.com   ");
		System.out.println("Room:  5  ");
		System.out.println();
		System.out.println("Rent #2:   ");
		System.out.println("Name:  Marco Antonio  ");
		System.out.println("Email: marco@gmail.com   ");
		System.out.println("Room:  1  ");
		System.out.println();
		System.out.println("Rent #3:   ");
		System.out.println("Name:  Alex Brown ");
		System.out.println("Email: alex@gmail.com   ");
		System.out.println("Room:  8  ");
		System.out.println();
		System.out.println("  Busy rooms:  ");
		System.out.println("  1: Marco Antonio, marco@gmail.com  ");
		System.out.println("  5: Maria Green, maria@gmail.com    ");
		System.out.println("  8: Alex Brown, alex@gmail.com      ");
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		
//		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent91[] vect = new Rent91[10];
		
		System.out.println(" How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			System.out.println();
			System.out.println(" Rent #"+ i + ": ");
			System.out.println(" Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println(" E-mail: ");
			String email = sc.nextLine();
			System.out.println(" Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent91(name, email);
		}
		
		System.out.println();
		System.out.println(" Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i +": "+ vect[i]);
			}
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