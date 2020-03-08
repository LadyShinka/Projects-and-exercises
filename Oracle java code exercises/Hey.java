import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Hey {
    public static void main(String[] args) {
ArrayList <DateTimeFormatter> ldtFormattersList = new ArrayList<>();
ldtFormattersList.add(DateTimeFormatter.ISO_WEEK_DATE);
ldtFormattersList.add(DateTimeFormatter.BASIC_ISO_DATE);
ldtFormattersList.add(DateTimeFormatter.ISO_LOCAL_TIME);
ldtFormattersList.add(DateTimeFormatter.ISO_LOCAL_DATE);
ldtFormattersList.add(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
ldtFormattersList.add(DateTimeFormatter.ISO_TIME);
ldtFormattersList.add(DateTimeFormatter.ISO_DATE);
ldtFormattersList.add(DateTimeFormatter.ISO_DATE_TIME);
ldtFormattersList.add(DateTimeFormatter.ISO_ORDINAL_DATE);

LocalDateTime ldt = LocalDateTime.now();
    ldtFormattersList.forEach(c -> {
	System.out.println(ldt.format(c));});
	  //Type your code...
}
}