import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // Loops are of three types
        // 1. for loop
        // 2. while loop
        // 3. do-while loop
        for (int i = 0; i < 10; i++) {
            System.out.printf("Day %d\n", i + 1);
        }

        int i = 1; 
        while(i <= 10) {
            System.out.printf("Day %d\n", i);
            i++;
        }

        // do-while loops are used when we want to execute the loop body atleast once
        // they are generally used to create menu driven programs and to give the user the control as to when to stop the loop

        Scanner sc = new Scanner(System.in);
        String user_choice = "";

        do {
            System.out.println("Hello User");

            System.out.print("Do you want to run the loop again ( Y / N ): ");
            user_choice = sc.nextLine();
            System.out.println(user_choice);
        } while(user_choice.equalsIgnoreCase("y"));

        sc.close();
    }
}
