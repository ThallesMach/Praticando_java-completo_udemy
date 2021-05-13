
//	--->Seção-4 Aula30-Exercícios para Iniciantes - PARTE 1
//		Link de Exemplo:  
//			03 10 Estrutura sequencial em Java exercício resolvido 01
//			    https://youtu.be/Ah1Y6d6deq0

package aula30;

import java.util.Locale;
import java.util.Scanner;


public class Aula30_Exemplo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimeto = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimeto;
		double preco = area * metroQuadrado;

//		System.out.println(" Area = "+ area);
//		System.out.println(" Preço = "+ preco);
		System.out.printf(" Area = %.2f%n ", area);
		System.out.printf(" Preço = %.2f%n ", preco);

		sc.close();

		
		
		
		/**
		 * @author Thalles machado
		 *
		 */
	}

}
