
//	-----> Seção-7 Aula 60 - Comentários em Java (básico)   -->16/05/2021.

package aula60_Comentarios;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */

/*
 * Este programa calcula as raízes de uma equação do segundo grau Os valores dos
 * coeficientes devem ser digitados um por linha
 */
public class Aula60_Comentarios {

	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------------");
		System.out.println("-----> Seção-7 Aula 60 - Comentários em Java (básico) ");
		System.out.println("------------------------------------------------------------------");

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		double a, b, c, delta;
		System.out.println("Digite os valores dos 3 coeficientes:");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = b* b-4 * a* c; // cálculo do valor de delta
		System.out.println(" Resultado coeficiente do Delta: "+ delta);
		
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */