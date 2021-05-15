
//	--->Seção-5: Estrutura condicional --->14/05/2021.
//					Aula38 Sintaxe opcional - operadores de atribuição cumulativa

package aula38;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula38 {

	
	public static void main(String[] args) {
	
		System.out.println("------------------------------------------------------------------------");
		System.out.println("***Problema exemplo***");
		System.out.println("-->Uma operadora de telefonia cobra R$50.00 por um plano básico que ");
		System.out.println("    dá direito a 100 minutos de telefone. Cada minuto que exceder a");
		System.out.println("    franquia de 100 minutos custa R$2.00. Fazer um programa para ler a");
		System.out.println("    quantidade de minutos que uma pessoa consumiu, daí mostrar o valor");
		System.out.println("    a ser pago.");
		System.out.println("--------------------------------------------------");
		System.out.println(" * Exemplos ");
		System.out.println("    Entrada:  22 | Saída: Valor a pagar: R$ 50.00 ");
		System.out.println("    Entrada: 103 | Saída: Valor a pagar: R$ 56.00 ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java	-------	");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**Digita os minutos e aperte Entre: ");
		int minutos = sc.nextInt();
		
		double conta = 50.00;
		if (minutos > 100) {
			conta += (minutos - 100) * 2;   //conta = conta + (minutos - 100) * 2;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
				
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}


/**
 * @author Thalles machado
 *
 */