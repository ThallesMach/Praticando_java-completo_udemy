
//	--->Seção-5: Estrutura condicional - Aula39 _Estrutura Switch-case  -->14/05/2021.

package aula39;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula39_Switch_Case {

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
		int x = sc.nextInt();
		
		String dia;
		
		switch(x) {
		case 1:
			dia = " Domingo";
		break;
		case 2:
			dia = " Segunda";
		break;
		case 3:
			dia = " Terca";
		break;
		case 4:
			dia = " Quarta";
		break;
		case 5:
			dia = " Quinta";
		break;
		case 6:
			dia = " Sexta";
		break;
		case 7:
			dia = " Sábado";
		break;
		default:
			dia = " valor invalido";
		break;
		}
		System.out.println(" Dia da semana: "+ dia);
		sc.close();
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("-------------------------------------------------------");
		
	}

}

/**
 * @author Thalles machado
 *
 */