

package aula49;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula49_Exercicio_03 {

	public static void main(String[] args) {

		
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("-----> Seção-6 Aula 49 - Exercício 02 ---");
		
		System.out.println("-->Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.");
		System.out.println("   Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: ");
		System.out.println("    1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) ");
		System.out.println("   deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4.");
		System.out.println("   Deve ser escrito a mensagem: \"MUITO OBRIGADO\" e a quantidade de clientes que abasteceram cada tipo de combustível,");
		System.out.println("     conforme exemplo.");
		
	
		System.out.println("-----------------------------------------");
		System.out.println(" * Exemplo: ");
		System.out.println("    Entrada:  8 | Saída: MUITO OBRIGADO ");
		System.out.println("    Entrada:  1 | Saída: Alcool: 1 ");
		System.out.println("    Entrada:  7 | Saída: Gasolina: 2 ");
		System.out.println("    Entrada:  2 | Saída: Diesel: 0 ");
		System.out.println("    Entrada:  4 | Saída: Código inválido  ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java	-------	");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("* Digita o código 1 á 4 do tipo de combustível abastecido. ");
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
			System.out.printf(" Tipo digitando: %d %n", tipo);
		}

		System.out.println(" --MUITO OBRIGADO");
		System.out.println(" --Alcool: " + alcool);
		System.out.println(" --Gasolina: " + gasolina);
		System.out.println(" --Diesel: " + diesel);
		
		sc.close();
		

		System.out.println("           ---> FIM <--- ");
		System.out.println("-------------------------------------------------------------------------------------------------");
	}

}


/**
 * @author Thalles machado
 *
 */
