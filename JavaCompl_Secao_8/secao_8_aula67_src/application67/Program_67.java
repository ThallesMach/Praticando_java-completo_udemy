
//	--->Seção-8 Aula 67 - Começando a resolver um segundo problema exemplo  -->17/05/2021.

package application67;

import java.util.Locale;
import java.util.Scanner;

import entities67.Product_67;

/**
 * @author Thalles machado
 *
 */
public class Program_67 {

	public static void main(String[] args) {
		

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("----->Seção-8 Aula 67 - Começando a resolver um segundo problema exemplo ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("***Outro exemplo***");
		System.out.println("-->Fazer um programa para ler os dados de um produto em estoque ");
		System.out.println("   (nome, preço e quantidade no estoque ). Em seguida: ");
		System.out.println("• Mostrar os dados do produto ( nome, preço, quantidade no estoque, valor total no estoque)");
		System.out.println("• Realizar uma entrada no estoque e mostrar novamente os dados do produto   ");
		System.out.println("• Realizar uma saída no estoque e mostrar novamente os dados do produto   ");
		System.out.println( );
		System.out.println("   Para resolver este problema, você deve criar ");
		System.out.println("    uma CLASSE conforme projeto ao lado:");
	
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(" *Exemplo: ");
		System.out.println(" Enter product data: ");
		System.out.println(" Name: TV	");
		System.out.println(" Price: 900.00	");
		System.out.println(" Quantity in stock: 10	");
		System.out.println(" Product data: TV, $ 900.00, 10 units, Total: $ 9000.00     ");
		System.out.println(" Enter the number of products to be added in stock: 5      ");
		System.out.println(" Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00    ");
		System.out.println(" Enter the number of products to be removed from stock: 3  ");
		System.out.println(" Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00    ");
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------//////////--------------------------------");
		System.out.println("	-------	Código em Java	-------	");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product_67 product = new Product_67();
		System.out.println("Entrer product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.quantity =sc.nextInt();
		
		System.out.println(product.name +", "+ product.price +", "+ product.quantity );
		
		
		sc.close();

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */
