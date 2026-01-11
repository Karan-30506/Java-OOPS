import java.util.Scanner;

enum Day {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    
    private final int dayNumber;

    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }
}

public class enums {
    public static void main(String[] args) {
        // Enums ==> (Enumerations) A Special kind of class that
        //           helps us write custom constants.
        //           They improve code readability and reliability.
        //           More efficient with switches while comparing Strings

        try(Scanner sc = new Scanner(System.in)) {
            System.out.printf("Enter the day of the week: ");
            String response = sc.next().toUpperCase();

            Day day = Day.valueOf(response);

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
                    -> System.out.println("It is a weekday");

                case SATURDAY, SUNDAY
                    -> System.out.println("It is a weekend");
            }
        }
        catch(IllegalArgumentException e) {
            System.out.println("Enter a valid day of the week");
        }
    }
}
