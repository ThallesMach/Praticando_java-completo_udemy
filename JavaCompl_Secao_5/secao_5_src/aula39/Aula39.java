
//	--->Seção-5: Estrutura condicional - Aula39 _Sem o uso da Estrutura Switch-case  -->14/05/2021.

package aula39;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula39 {

	public static void main(String[] args) {
	
		
		System.out.println("----------------------------------");
		System.out.println("***Problema exemplo***");
	    System.out.println("-->Fazer um programa para ler um valor inteiro de 1 a 7 representando um  ");
	    System.out.println("   dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).");
	    System.out.println("   Escrever na tela o dia da semana correspondente, conforme exemplos.");
	    
		System.out.println("-------------------------------------------------------");
		System.out.println(" * Exemplos ");
		System.out.println("    Entrada:  1 | Saída: Diada semana: domingo ");
		System.out.println("    Entrada:  4 | Saída: Diada semana: quarta ");
		System.out.println("    Entrada:  9 | Saída: Diada semana: valor inválido ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java sem o uso do Switch-case	-------	");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("**Digita um número entre 1 á 7, depois aperte Entre: ");
		int x= sc.nextInt();
		
		String dia;
		if(x== 1) {
			dia= "--> Domingo";
		}else if(x== 2) {
			dia= "--> Segunda";
		}else if(x== 3) {
			dia= "--> Terca";
		}else if(x== 4) {
			dia= "--> Quarta";
		}else if(x== 5) {
			dia= "--> Quinta";
		}else if(x== 6) {
			dia= "--> Sexta";
		}else if(x== 7) {
			dia= "--> Sábado";
		}else {
			dia= "valor invalido";
		}
		System.out.println("Dia da semana: "+ dia);
		
		sc.close();
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("-------------------------------------------------------");
		
	}

}

/**
 * @author Thalles machado
 *
 */