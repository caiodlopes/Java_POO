package dateExemple;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class App {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		// para imprimir a data no fuso GMT, 00
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		// cria uma data do instante atual
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());

		// Cria a primeira data
		Date x3 = new Date(0L);

		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 13:30:15");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println("X1: " + sdf2.format(x1));
		System.out.println("X2: " + sdf2.format(x2));
		System.out.println("X3: " + sdf2.format(x3));
		System.out.println("Y1: " + sdf2.format(y1));
		System.out.println("Y2: " + sdf2.format(y2));
		System.out.println("Y3: " + sdf2.format(y3));
		System.out.println("--------------------------");
		System.out.println("X1: " + sdf3.format(x1));
		System.out.println("X2: " + sdf3.format(x2));
		System.out.println("X3: " + sdf3.format(x3));
		System.out.println("Y1: " + sdf3.format(y1));
		System.out.println("Y2: " + sdf3.format(y2));
		System.out.println("Y3: " + sdf3.format(y3));
	}
}
