/**
 * 
 */
package util73;

/**
 * @author Thalles machado
 *
 */
public class CurrencyConverter73 {

	public static double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}

}

/**
 * @author Thalles machado
 *
 */