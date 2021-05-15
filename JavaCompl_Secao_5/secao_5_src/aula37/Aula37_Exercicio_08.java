
//	--->Seção-5: Estrutura condicional - Aula37-Exercício 08   -->14/05/2021.

package aula37;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Thalles machado
 *
 */
public class Aula37_Exercicio_08 {

	
	public static void main(String[] args) {
	
	System.out.println("---------------------------------------------------------------------------------");	
	System.out.println("-->Em um país imaginário denominado Lisarb,");
	System.out.println("   todos os habitantes ficam felizes em pagar seus impostos, ");
	System.out.println("   pois sabem que nele não existem políticos corruptos e os recursos arrecadados");
	System.out.println("   são utilizados em benefício da população, sem qualquer desvio. ");
	System.out.println("   A moeda deste país é o Rombus, cujo símbolo é o R$. ");
	
	System.out.println("-->Leia um valor com duas casas decimais,");
	System.out.println("   equivalente ao salário de uma pessoa de Lisarb. Em seguida,");
	System.out.println("   calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda,");
	System.out.println("   segundo a tabela abaixo.");
	System.out.println("--- Os dados da Renda e imposto d Renda, está em imagem no PDF de Exercícios Aula37 <--- ");
	System.out.println("-->Lembre que, se o salário for R$ 3002.00,");
	System.out.println("    a taxa que incide é de 8% apenas sobre R$ 1000.00,");
	System.out.println("    pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00");
	System.out.println("    é isenta de Imposto de Renda. No exemplo fornecido (abaixo),");
	System.out.println("    a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total.");
	System.out.println("    O valor deveser impresso com duas casas decimais.");
	System.out.println(" ");
	
	System.out.println("------------------------------------------");
	System.out.println("*--->Exemplos ");
	System.out.println("       Entrada: 3002.00 | Saída: R$ 80.36 ");
	System.out.println("       Entrada: 1701.12 | Saída: Isento ");
	System.out.println("       Entrada: 4520.00 | Saída: R$ 355.60  ");
	System.out.println("--------------------------------------------------------");
	System.out.println("-------------------//////////---------------------------");
	System.out.println("	-------	Código em Java	-------	");
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("-->Digita o salário e aperte Entre: ");
	double salario = sc.nextDouble();
	
	double imposto;
	if (salario <= 2000.0) {
		imposto = 0.0;
	}
	else if (salario <= 3000.0) {
		imposto = (salario - 2000.0) * 0.08;
	}
	else if (salario <= 4500.0) {
		imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
	}
	else {
		imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
	}

	if (imposto == 0.0) {
		System.out.println("--> Isento");
	}
	else {
		System.out.printf(" --> R$ %.2f%n", imposto);
	}
	
	sc.close();
	
	System.out.println("        ---> FIM <--- ");
	System.out.println("---------------------------------------------------------------------------------");		
	}

}


/**
 * @author Thalles machado
 *
 */