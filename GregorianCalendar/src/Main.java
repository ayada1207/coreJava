import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		LocalTime currentTime =  LocalTime.now();
		LocalTime timeZone = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		Calendar c = new GregorianCalendar();
		int year = c.get(Calendar.YEAR);
		int day = c.get(Calendar.DATE);
		int month = c.get(Calendar.MONTH);
		
		System.out.println(currentTime);
		System.out.println(timeZone);
		System.out.println(year+"/"+ day +"/"+month);

	}

}
