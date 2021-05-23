
//	----->Seção-10 Aula 93 - For each 		--->22/05/2021.

package aula93_For_each;

/**
 * @author Thalles machado
 *
 */
public class Aula93_For_each {

	
	public static void main(String[] args) {
	
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-10 Aula 93 - For each    ");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println(" --- Laço \"for each\" ---  ");
		System.out.println("   Sintaxe opcional e simplificada para percorrer coleções ");
		System.out.println();
		System.out.println(" Sintaxe:   ");
		System.out.println("   for(Tipoapelido : coleção) {");
		System.out.println("      <comando 1> ");
		System.out.println("      <comando 2> ");
		System.out.println("   }  ");
		System.out.println();
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("  Demo  ");
		System.out.println(" Leitura: \"para cada objeto 'obj' contido em vect, faça:\"  ");
		System.out.println(" ");
		
		String[] vect = new String[] {" Maria", " Bob", " Alex"};

		System.out.println("*************");
		System.out.println("  For comum ");
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("*************");
		
		System.out.println("  For each ");
		for (String obj : vect) {   //  for (String string : vect) {
			System.out.println(obj);
		}
		
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
		
		
	}

}




/**
 * @author Thalles machado
 *
 */