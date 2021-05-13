
//	---> Seção-4 Aula 27 Entrada de dados em Java - Parte 2
//			Para ler um texto ATÉ A QUEBRA DE LINHA

package aula27;

import java.util.Scanner;

public class Aula27_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		String s1, s2, s3;
//		s1= sc.nextLine();
//		s2= sc.nextLine();
//		s3= sc.nextLine();
//		System.out.println("DADOS DIGITADOS:");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);

		System.out.println("-----//---------");
		System.out.println();
//		--> ATENÇÃO: quebra de linha pendente
		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

//		Resumo da aula
//		•Scanner
//			•next()
//			•nextInt()
//			•nextDouble()
//			•next().charAt(0)
//		•Locale
//		•Como ler até a quebra de linha
//			•nextLine()
//			•como limpar o buffer de leitura

		sc.close();

	}

}
