
//	-----> Seção-6 Aula 44    -->14/05/2021.
//			Como utilizar o DEBUG no Eclipse (execução passo a passo)

package aula44;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula44 {

	public static void main(String[] args) {

		System.out.println("-------------------------------------");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("* Digita a Largura: ");
		double largura = sc.nextDouble();
		System.out.println("* Digita a Comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.println("* Digita a Metro Quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf(" AREA = %.2f %n", area);
		System.out.printf(" PRECO = %.2f %n", preco);

		sc.close();

		System.out.println("        ---> FIM <--- ");
		System.out.println("-------------------------------------");

	}

}

/**
 * @author Thalles machado
 *
 */