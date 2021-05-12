

package course_javaprogramacao;

import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
				
		System.out.println("------------");
		System.out.println(" Ola Mundo");
		System.out.println("------------");
		System.out.print(" Sem Quebra de Linha ");
		System.out.println("------------");
		System.out.println("---///------");
		
//		System.out.println(y);
//		System.out.println(x);
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);  // igual  System.out.printf("%.4f\n", x);

		System.out.println("---///------");
//		ATENÇÃO:Para considerar o separador de decimais como ponto, 
//		ANTES da declaração do Scanner, faça: 
		Locale.setDefault(Locale.US);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.println("---///------");
//		Concatenar
		System.out.println("RESULTADO = " + x + " METROS");

		System.out.println("---///------");
//		%f = ponto flutuante
//		%n = quebra de linha
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		System.out.println("---///-----");	
//		Regra geral para printf: "TEXTO1 %fTEXTO2 %fTEXTO3", variavel1, variavel2
//		%f = ponto flutuante 
//		%d = inteiro
//		%s = texto
//		%n = quebra de linha
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.000;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		
		System.out.println("----------------///-----------------------------");

//		MAIS INFORMAÇÕES: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
		
/*		Resumo da aula
 * 		•System.out.print
 * 		•System.out.println
 * 		•System.out.printf
 * 		•%d
 * 		•%f
 * 		•%s
 * 		•%n
 * 		•Locale
 * 		•Como concatenar vários elementos em um mesmo comando de escrita
 * 		•Exemplos
	*/	
		
	}

}