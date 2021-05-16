
//		---> Seção-6 Aula 49 - Exercício 02   -->16/05/2021.

package aula49_Exercicio;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula49_Exercicio_02 {

	public static void main(String[] args) {
	
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("-----> Seção-6 Aula 49 - Exercício 02 ---");

		System.out.println("-->Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema ");
		System.out.println("   cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo ");
		System.out.println("   menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).");

		System.out.println("-----------------------------------------");
		System.out.println(" * Exemplo: ");
		System.out.println("    Entrada:  2,  2 | Saída: primeiro ");
		System.out.println("    Entrada:  3, -2 | Saída: quarto ");
		System.out.println("    Entrada: -8, -1 | Saída: terceiro ");
		System.out.println("    Entrada: -7,  1 | Saída: segundo ");
		System.out.println("    Entrada:  0,  2 | Saída: Código inválido ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java	-------	");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("* Digita a primeira Coordenadas: ");
		int x = sc.nextInt();
		System.out.println("* Digita a segunda Coordenadas: ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
			
		}

		sc.close();	
		

		System.out.println("           ---> FIM <--- ");
		System.out.println("-------------------------------------------------------------------------------------------------");
	}

}


//		Exercício não todo compreendido 


/**
 * @author Thalles machado
 *
 */
