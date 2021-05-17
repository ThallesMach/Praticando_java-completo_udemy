
//	-----> Seção-7 Aula 58 - Operadores bitwise   -->16/05/2021.

package aula58_bitwise;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula58_bitwise {

	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------------");
		System.out.println("-----> Seção-7 Aula 58 - Operadores bitwise ");
		System.out.println("------------------------------------------------------------------");

		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;	//int mask = 32;
		
		System.out.println("Digita o nº bit:");
		int n = sc.nextInt();
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}
		sc.close();

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */