
//	----->Seção-13 Aula 115 - Enumerações  	--->23/05/2021.

package application115;

import java.util.Date;

import entities.enums115.OrderStatus115;
import entities115.Order115;

/**
 * @author Thalles machado
 *
 */
public class Program115 {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-13 Aula 115 - Enumerações    ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("*** Enumerações *** ");
		System.out.println("---------------------------------------------------------------");

		System.out.println();
		System.out.println("---------------------------------------------------------------");


		Order115 order = new Order115(1080, new Date(), OrderStatus115.PENDING_PAYMENT );
		
		System.out.println(order);
		
		OrderStatus115 os1 = OrderStatus115.DELIVERED;
		
		OrderStatus115 os2 = OrderStatus115.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */