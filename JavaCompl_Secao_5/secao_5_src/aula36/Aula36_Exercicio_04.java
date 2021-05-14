
//	--->Seção-5 Aula36-Exercício 04


package aula36;

import java.util.Scanner;

/**
 * @author machado
 *
 */
public class Aula36_Exercicio_04 {

	
	public static void main(String[] args) {


		System.out.println("-----------------------------------------------------------------------");
		System.out.println("-->Leia a hora inicial e a hora final de um jogo.");
		System.out.println("    A seguir calcule a duração do jogo, ");
		System.out.println("    sabendo que o mesmo pode começar em um dia e terminar em outro,");
		System.out.println("    tendo uma duração mínima de 1 hora e máxima de 24 horas.");

		System.out.println("---------------------------------------");
		System.out.println(" * Exemplos ");
		System.out.println("    Entrada: 16,  2 | Saída: O JOGO DUROU 10 HORA(S) ");
		System.out.println("    Entrada:  0,  0 | Saída: O JOGO DUROU 24 HORA(S) ");
		System.out.println("    Entrada:  2, 16 | Saída: O JOGO DUROU 14 HORA(S)  ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java	-------	");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digita a Hora inicial e aperte Entre: ");
		int horaInicial = sc.nextInt();
		System.out.println(" Digita a Hora Final e aperte Entre: ");
		int horasFinal = sc.nextInt();
		
		int duracao;
		
		if (horaInicial < horasFinal) {
			duracao = horasFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horasFinal;
		}
		
		System.out.println(" -->  O Jogo durou "+ duracao +" Horas ");
		
		
		sc.close();
		
		System.out.println("-----------------------------------------------------------------------");
		
	}

}


/**
 * @author machado
 *
 */