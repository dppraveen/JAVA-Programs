import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class DateDisplay{
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		//System.out.println(date);
		DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		String dat =date.format(d);
		System.out.println(dat);
	}
}
