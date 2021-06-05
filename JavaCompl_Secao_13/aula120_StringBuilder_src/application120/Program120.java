
//	----->Seção-13 Aula 120 - Exercício resolvido 2 (demo StringBuilder)  	--->04/06/2021.


package application120;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities120.Comment120;
import entities120.Post120;

/**
 * @author Thalles machado
 *
 */
public class Program120 {

	
	public static void main(String[] args) throws ParseException {
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-13 Aula 120 - StringBuilder    ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("*** No PDF tem intrudução do exercíco *** ");
		System.out.println("---------------------------------------------------------------");
		System.out.println();

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment120 c1 = new Comment120("Have a nice trip!");
		Comment120 c2 = new Comment120("Wow that's awesome!");
		Post120 p1 = new Post120(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment120 c3 = new Comment120("Good night");
		Comment120 c4 = new Comment120("May the Force be with you");
		Post120 p2 = new Post120(
				sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		

		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */