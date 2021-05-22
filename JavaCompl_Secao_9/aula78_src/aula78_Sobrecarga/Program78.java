
//	----->Seção-9 Aula 78 - Sobrecarga		--->21/05/2021.

package aula78_Sobrecarga;

import java.util.Locale;
import java.util.Scanner;

import entities78.Product78;



/**
 * @author Thalles machado
 *
 */
public class Program78 {

	public static void main(String[] args) {

		System.out
				.println("-------------------------------------------------------------------------------------------");
		System.out.println("----->Seção-9 Aula 78 - Sobrecarga ");
		System.out
				.println("-------------------------------------------------------------------------------------------");
		System.out.println("***Outro exemplo***");
		System.out.println("-->Fazer um programa para ler os dados de um produto em estoque ");
		System.out.println("   (nome, preço e quantidade no estoque ). Em seguida: ");
		System.out
				.println("• Mostrar os dados do produto ( nome, preço, quantidade no estoque, valor total no estoque)");
		System.out.println("• Realizar uma entrada no estoque e mostrar novamente os dados do produto   ");
		System.out.println("• Realizar uma saída no estoque e mostrar novamente os dados do produto   ");
		System.out.println();
		System.out.println("   Para resolver este problema, você deve criar ");
		System.out.println("    uma CLASSE conforme projeto ao lado:");

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("***Problema exemplo ");
		System.out.println(" Enter product data: ");
		System.out.println(" Name: TV	");
		System.out.println(" Price: 900.00	");
		System.out.println(" Quantity in stock: 10	");
		System.out.println(" Product data: TV, $ 900.00, 10 units, Total: $ 9000.00     ");
		System.out.println(" Enter the number of products to be added in stock: 5      ");
		System.out.println(" Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00    ");
		System.out.println(" Enter the number of products to be removed from stock: 3  ");
		System.out.println(" Update ddata: TV, $ 900.00, 12 units, Total: $ 10800.00    ");

		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		System.out.println("	-------	Código em Java	-------	");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Product76 product = new Product76();
		
//		System.out.println(product.name);
//		System.out.println(product.price);
//		System.out.println(product.quantity);
		
//		---------------------------------------
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
//		System.out.print("Quantity in stock: ");
//		int quantity = sc.nextInt();
		Product78 product = new Product78( name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/*
 
	Palavra this
	
	•É uma referência para o próprio objeto
	•Usos comuns:
		•Diferenciar atributos de variáveis locais
		•Passar o próprio objeto como argumento na chamada de um método ou construtor

*/


/**
 * @author Thalles machado
 *
 */