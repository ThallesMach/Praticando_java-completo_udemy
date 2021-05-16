
//	-----> Seção-6 Aula 55 - Estrutura Repetitiva faça-enquanto (do-while)   -->16/05/2021.

package aula55_do_while;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula55_do_while {

	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("-----> Seção-6 Aula 55 - Estrutura repetitiva faça-enquanto (do-while)  ");
		System.out.println("------------------------------------------------------------------------");

		System.out.println(" * Problema um exemplo:");
		System.out.println(
				"-->Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.");
		System.out.println("   Perguntarseousuáriodesejarepetir(s/n).Casoousuáriodigite\"s\",repetiroprograma.");
		System.out.println("------------------------------------------------------------------------------------------------ ");
		System.out.println("*Exemplo:");
		System.out.println("   Digite a temperatura em Celsius: 30.0");
		System.out.println("   Equivalente em Fahrenheit: 86.0 ");
		System.out.println("   Deseja repetir (s/n)? s ");
		System.out.println("   Digite a temperatura em Celsius: 21.0 ");
		System.out.println("   Equivalente em Fahrenheit: 69.8 ");
		System.out.println("   Deseja repetir (s/n)? s ");
		System.out.println("   Digite a temperatura em Celsius: -10.5 ");
		System.out.println("   Equivalente em Fahrenheit: 13.1 ");
		System.out.println("   Deseja repetir (s/n)? n ");
		
		System.out.println("---------------////////////////--------------------------------------");
		System.out.println("	-------	Código em Java -------	");

		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		char resp;
		do{
			System.out.print("  Digite a temperatura em Celsius: ");
			double C= sc.nextDouble();
			double F= 9.0 * C/ 5.0 + 32.0;
			System.out.printf("  Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("   Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
			} while(resp!= 'n');
		
		sc.close();
		
		
		System.out.println("           ---> FIM <--- ");
		System.out.println("-----------------------------------------------------------------------------");
	}

}

/*
 * Resumo da aula •Estrutura repetitiva "faça-enquanto" •O bloco de comandos
 * executa pelo menos uma vez, pois a condição é verificada no final. •Regra:
 * •V: volta •F: pula fora
 * 
 * do { comando 1 comando 2 } while(condição);
 */

/**
 * @author Thalles machado
 *
 */
