
//	---> Seção-4 Aula 26 Entrada de dados em Java - Parte 1
//		Para ler um caractere
//			Suponha uma variável tipo char declarada:
//				char x;
//				x = sc.next().charAt(0);

package aula26;

import java.util.Locale;
import java.util.Scanner;

public class Aula26_01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		char x;
//		x = sc.next().charAt(0);
//		System.out.println(" Voce digitou: "+ x);
		
		System.out.println("----//----------");
		
		String x;  // Maria
		int y;     // 30
		double z;  // 4.5
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println(" Dados digitandos:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		System.out.println("----//----------");
		
		sc.close();

	}

}
