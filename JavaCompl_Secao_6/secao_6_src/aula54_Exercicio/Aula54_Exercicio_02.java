
 //	-----> Seção-6 Aula 54 - Exercício 02   -->16/05/2021.

package aula54_Exercicio;

import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula54_Exercicio_02 {


	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----> Seção-6 Aula 54 - Exercício 02  ");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

		System.out.println("-->Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.  ");
		System.out.println("    Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando");
		System.out.println("    essas informações conforme exemplo (use a palavra \"in\" para dentrodo intervalo, e \"out\" para fora do intervalo). ");
		System.out.println("------------------------------");
		System.out.println(" * Exemplo: ");
		System.out.println("    Entrada:   5  |  ");
		System.out.println("    Entrada:  14  |  ");
		System.out.println("    Entrada:  123 |  ");
		System.out.println("    Entrada:  10  |  ");
		System.out.println("    Entrada: -25  | Saída: 2 in   ");
		System.out.println("    Entrada:  32  | Saída: 3 out  ");
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------//////////---------------------------");
		System.out.println("	-------	Código em Java  -------	");
		
		Scanner sc = new Scanner(System.in);

		System.out.println(" Digita valor inteiro Nº: ");
		int n = sc.nextInt();
		System.out.println("-->Quantidade de vezes no Loop For: "+ n);
		
		int in = 0;
		int out = 0;
		
		for (int i=0; i<n; i++) {
			System.out.println(" --> i dentro do Loop For: "+i);
			
			System.out.println("*Digita Nº: ");
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

		System.out.println("           ---> FIM <--- ");
		System.out.println("-----------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */
