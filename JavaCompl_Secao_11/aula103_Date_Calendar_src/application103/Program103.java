
//	----->Seção-11 Aula 103 - Manipulando um Date com Calendar  	--->23/05/2021.

package application103;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Thalles machado
 *
 */
public class Program103 {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-11 Aula 103 - Manipulando um Date com Calendar    ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("*** Somando uma unidade de tempo *** ");
		System.out.println("---------------------------------------------------------------");

		System.out.println();
		System.out.println("---------------------------------------------------------------");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2021-05-23T15:42:07Z") );
		
		System.out.println(sdf.format(d) );
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();   
		System.out.println(sdf.format(d) );
		
		System.out.println("----------");
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: "+ minutes);
		System.out.println("Month: "+ month);

		
		
		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");
	}

}

/**
 * @author Thalles machado
 *
 */