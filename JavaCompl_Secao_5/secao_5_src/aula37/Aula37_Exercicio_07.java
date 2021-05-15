
//	--->Seção-5: Estrutura condicional - Aula37-Exercício 07   -->14/05/2021.

package aula37;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula37_Exercicio_07 {

	
	public static void main(String[] args) {
	

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-->Leia 2 valores com uma casa decimal (x e y),");
		System.out.println("    que devem representar as coordenadas de um ponto em um plano. ");
		System.out.println("    A seguir, determine qual o quadrante ao qual pertence o ponto, ");
		System.out.println("    ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).");
		System.out.println(" Se o ponto estiver na origem, escreva a mensagem “Origem”.");
		System.out.println(" Se o ponto estiver sobre um dos eixos escreva“Eixo X” ou “Eixo Y”,"
				+ " conforme for a situação. ");
		
		System.out.println("--------------------------------------------");
		System.out.println(" * Exemplos ");
		System.out.println("    Entrada:  4.5  -2.2 | Saída: Q4 ");
		System.out.println("    Entrada:   0.1  0.1 | Saída: Q3 ");
		System.out.println("    Entrada:   0.0  0.0 | Saída: Origiem ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java	-------	");
		 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" Digita o primeiro valor em casa decimal e depois aperte Entre: ");
		double a = sc.nextDouble();
		System.out.println(" Digita o segundo valor em casa decimal e depois aperte Entre: ");
		double b = sc.nextDouble();
		
		if (a == 0.0 && b == 0.0) {
			System.out.println(" --> Origem");
		}
		else if (a == 0.0) {
			System.out.println(" --> Eixo Y");
		}
		else if (b == 0.0) {
			System.out.println(" --> Eixo X");
		}
		else if (a > 0.0 && b > 0.0) {
			System.out.println(" --> Q1");
		}
		else if (a < 0.0 && b > 0.0) {
			System.out.println(" --> Q2");
		}
		else if (a < 0.0 && b < 0.0) {
			System.out.println(" --> Q3");
		}
		else {
			System.out.println(" --> Q4");
		}
		
		sc.close();
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("-------------------------------------------------------------------------");		 
	}

}


/**
 * @author Thalles machado
 *
 */