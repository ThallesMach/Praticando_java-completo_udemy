
//	--->Seção-8 Aula 70 - Exercício 03   -->19/05/2021.

package application70_03;

import java.util.Locale;
import java.util.Scanner;

import entities70_03.Student70_03;



/**
 * @author Thalles machado
 *
 */
public class Program_70_03 {

	public static void main(String[] args) {

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("----->Seção-8 Aula 70 - Exercício 03  ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("***Exercício 03 ***");
		System.out.println("-->Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano   ");
		System.out.println("    (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no  ");
		System.out.println("    ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam ");
		System.out.println("    para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Studentpara ");
		System.out.println("    resolver este problema. ");

		System.out.println("--------------------------------------------------------------------------");
		System.out.println(" *Exemplo: ");
		System.out.println("	Entrada:    | Saída:     ");
		System.out.println("     Alex Green | FINAL GRADE = 90.00   ");
		System.out.println("       27.00    | PASS        ");
		System.out.println("       31.00    |             ");
		System.out.println("       32.00    |             ");
		System.out.println("------------------------------------------");
		System.out.println("	Entrada:    | Saída:     ");
		System.out.println("     Alex Green | FINAL GRADE = 52.00   ");
		System.out.println("       17.00    | FAILED                ");
		System.out.println("       20.00    | MISSING 8.00 POINTS   ");
		System.out.println("       15.00    |                       ");
		System.out.println();

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		System.out.println("	-------	Código em Java	-------	");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student70_03 stud = new Student70_03();
		
		System.out.println("*Digita Nome: ");
		stud.name =sc.nextLine();
		System.out.println("*Digita Nota1: ");
		stud.grade1 = sc.nextDouble();
		System.out.println("*Digita Nota2: ");
		stud.grade2 = sc.nextDouble();
		System.out.println("*Digita Nota3: ");
		stud.grade3 = sc.nextDouble();
		
		System.out.printf("-->Nota Final: %.2f %n", stud.finalGrade() );
		
		if (stud.finalGrade() < 60) {
			System.out.println("Failed ");
			System.out.printf("Missing %.2f Points %n", stud.missingPoints() );
		}else {
			System.out.println("Pass ");
		}
		sc.close();
		
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */
