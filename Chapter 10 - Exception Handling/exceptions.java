import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions {

    public static void main(String[] args) {
        // Exception ==> An event that interrupts normal flow of program
        //               Handlied using try-catch and finally blocks
    
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Enter Numerator: ");
            int a = sc.nextInt();

            System.out.printf("Enter Denominator: ");
            int b = sc.nextInt();
    
            System.out.printf("Result: %.2f\n", a / b);
        }
        catch (InputMismatchException e) {
            System.out.println("Input not matched!!");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error occured!");
        }
        catch(Exception e) { // Handles all the errors
            System.out.println("Some unknown error occured!");
        }
        finally { // block always runs regardless if error occured or not
            System.out.println("Code terminated successfully...");
        }
    }

}
