package aula24_Exrc;

import java.util.Locale;

public class aula24_Exrcicio1 {
	
	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code= 5290;
		char gender= 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure= 53.234567;
		
/*		Em seguida, usando os valores das variáveis, produza a seguinte saída na tela do console:
 * 		Products:
 * 
 * 			Computer, 
 * 				which priceis $ 2100,00 
 * 				Office desk, which priceis $ 650,50
 * 
 * 				Record: 30 year sold, code 5290 and gender: F
 * 
 * 				Measue with eight decimal places: 53,23456700
 * 				Rouded(three decimal places): 53,235 
 * 				US decimal point: 53.235
*/
		System.out.println("------------------///-------------------------");
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measuewith eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded(three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		System.out.println("------------------///-------------------------");
		
		
	}

}
