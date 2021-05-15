
//	--->Seção-5: Estrutura condicional - Aula 40 Expressão Condicional Ternária  -->14/05/2021.

package aula40;

/**
 * @author Thalles machado
 *
 */
public class Aula40_Condicional_Ternaria {

	public static void main(String[] args) {
	
		System.out.println("-------------------------------------");
	
//		double preco = 34.5;
//		
//		double desconto;
//		if(preco< 20.0) {
//			desconto = preco* 0.1;
//		}else {
//			desconto = preco* 0.05;
//		}
//		System.out.println( desconto);
		
		double preco = 34.5;
		double desconto = (preco< 20.0) ? preco* 0.1 : preco* 0.05;
		System.out.println( desconto);
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("-------------------------------------");
		
	}

}

/**
 * @author Thalles machado
 *
 */