import java.util.Scanner;

/*
 * 
 */

/**
 * @author Thalles machado
 *
 */
public class TesteClass {

	
	public static void main(String[] args) {

		System.out.println("---------------------");
		System.out.println("Teste Ok");
		System.out.println("---------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-->Teste Digita algum Nº: ");
		double X = sc.nextDouble();
		
		System.out.println(X);
		
		
		sc.close();
	}

}
