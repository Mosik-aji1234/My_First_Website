import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime
        currenDateTime = LocalDateTime.now();
        DateTimeFormatter
        formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        String formattedDateTime = currenDateTime.format(formatter);
        System.out.println("Current Date and Time:" + formattedDateTime);
    }
}