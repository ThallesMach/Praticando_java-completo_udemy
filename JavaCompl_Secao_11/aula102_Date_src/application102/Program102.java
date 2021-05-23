
//	----->Seção-11 Aula 102 - Trabalhando com datas - Date  	--->23/05/2021.

package application102;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Thalles machado
 *
 */
public class Program102 {

	public static void main(String[] args) throws ParseException {

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("----->Seção-11 Aula 102 - Trabalhando com datas - Date    ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("*** SimpleDateFormat *** ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" •Define formatos para conversão entre Date e String ");
		System.out.println("   •dd/MM/yyyy-> 23/05/2021");
		System.out.println("   •dd/MM/yyyyHH:mm:ss-> 23/05/2021 11:42:07");

		System.out.println();
		System.out.println("---------------------------------------------------------------");		
		System.out.println("---------------------------------------------------------------");	
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis() );
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L );
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT") );
		
		
		Date y1 = sdf1.parse("23/05/2021");
		Date y2 = sdf2.parse("23/05/2021  11:42:07");
		Date y3 = Date.from(Instant.parse("2021-05-23T15:42:07Z") );

		System.out.println("-------------------------");
		System.out.println(" y1 "+ y1 );
		System.out.println(" y2 "+ y2 );
		System.out.println(" x1 "+ x1 );
		System.out.println(" x2 "+ x2 );		
		System.out.println(" x3 "+ x3 );	
		System.out.println(" x4 "+ x4 );
		System.out.println(" y3 "+ y3 );
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println(" y1 "+sdf1.format(y1) );
		System.out.println(" y2 "+sdf2.format(y2) );
		System.out.println(" x1 "+sdf2.format(x1) );  // data com hora Atual
		System.out.println(" x2 "+sdf2.format(x2) );		
		System.out.println(" x3 "+sdf2.format(x3) );  // hora UTC	
		System.out.println(" x4 "+sdf2.format(x4) );  // criar uma data há 5 da manhã de 1970	
		System.out.println(" y3 "+sdf2.format(y3) );

		System.out.println();
		System.out.println("-----------Formato UTC --------------");
		System.out.println(" y1 "+sdf3.format(y1) );
		System.out.println(" y2 "+sdf3.format(y2) );
		System.out.println(" x1 "+sdf3.format(x1) );
		System.out.println(" x2 "+sdf3.format(x2) );		
		System.out.println(" x3 "+sdf3.format(x3) );	
		System.out.println(" x4 "+sdf3.format(x4) );	
		System.out.println(" y3 "+sdf3.format(y3) );
		
		

		System.out.println("        ---> FIM <--- ");
		System.out.println("------------------------------------------------------------------------");		
	}

}



/**
 * @author Thalles machado
 *
 */