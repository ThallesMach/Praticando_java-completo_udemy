
//		---> Seção-6 Aula 49 - Exercício 01   -->16/05/2021.

package aula49;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula49_Exercicio_01 {

	
	public static void main(String[] args) {
	
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("-----> Seção-6 Aula 49 - Exercício 01 ---");

		System.out.println("-->Escreva um programa que repita a leitura de uma senha até que ela seja válida.");
		System.out.println("    Para cada leitura de senha incorreta informada, escrever a mensagem \\\"Senha Invalida\\\". ");
		System.out.println("    Quando a senha for informada corretamente deve ser impressa a mensagem \\\"Acesso Permitido\\\" ");
		System.out.println("    e o algoritmo encerrado. Considere que a senha correta é o valor 2002.");
		
		System.out.println("--------------------------------------------");
		System.out.println(" * Exemplo: ");
		System.out.println("    Entrada: 2200 | Saída: Senha Invalida ");
		System.out.println("    Entrada: 1020 | Saída: Senha Invalida ");
		System.out.println("    Entrada: 2020 | Saída: Senha Invalida ");
		System.out.println("    Entrada: 2002 | Saída: Acesso Permitido ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java	-------	");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("* Digita a Senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println(" --> Senha Invalida ");
			System.out.println("* Digita outra vez: ");
			senha = sc.nextInt();
			System.out.printf(" O que vc digitou foi: %d %n", senha);
			
		}
		System.out.println(" --> Acesso Permitido ");

		sc.close();
		
		System.out.println("           ---> FIM <--- ");
		System.out.println("-------------------------------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */