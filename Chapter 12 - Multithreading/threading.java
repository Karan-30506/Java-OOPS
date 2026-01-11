import java.util.Scanner;

class MyTask implements Runnable {
    @Override 
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                // System.out.println(i);
            }
            System.out.println("Time's Up!!");
            System.exit(0);
        }
        catch (InterruptedException e) {
            System.out.println("Thread as interrupted");
        }
    }
}

public class threading {
    public static void main(String[] args) {
        // Threading ==> Allows a program to run multiple tasks simultaneously
        //               Helps improve performance with time consuming operations
        // There are two ways of creating a thread
        // 1. Extend the Thread Class.
        // 2. Implementing the Runnable Interface

        MyTask task = new MyTask();
        Thread thread = new Thread(task);

        Scanner sc = new Scanner(System.in);
        
        System.out.println("You have 5 seconds to Enter your name!");

        thread.setDaemon(true); // setting this true will end the program when the main thread code is completed
        thread.start();

        System.out.printf("Enter your Name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);
        
        sc.close();
    }
}
