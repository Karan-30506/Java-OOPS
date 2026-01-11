import java.time.*;
import java.time.format.DateTimeFormatter;

public class date_and_time {
    public static void main(String[] args) {
        
        // LocalDate to get the current Data
        LocalDate date = LocalDate.now();
        System.out.printf("\nCurrent Date: %s\n\n", date.toString());

        // LocalTime to get the current Time
        LocalTime time = LocalTime.now();
        System.out.printf("Current Time: %s\n\n", time.toString());

        // To get both together we can use LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();
        String[] result = dateTime.toString().split("T");
        System.out.printf("Current Date-Time: %s %s\n\n", result[0], result[1]);

        // Custom Format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = LocalDateTime.now().format(formatter);
        System.out.printf("Formatted Date-Time: %s\n\n", formattedDateTime);

        // Custom Date
        String customDateTime = LocalDateTime.of(2006, 05, 30, 9, 30, 24).format(formatter); 
        System.out.printf("Custom Date-Time: %s\n\n", customDateTime);
    }
}