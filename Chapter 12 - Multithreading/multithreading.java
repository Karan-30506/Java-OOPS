import java.util.concurrent.Semaphore;

public class multithreading {
    public static void main(String[] args) {

        // Multithreading ==> Enables a program to run multiple threads simulataneously
        //                    Useful for background tasks or time-consuming operations

        // Instead of creating our own Runnable classes we can use the concept of Anonymous Classes

        // Semaphores are used to make the threads work in order
        // Currently they will print PING PONG in a random order hence we use Semaphores
        Semaphore ping = new Semaphore(1); // PING has initial permit as 1 so PING will be printed first
        Semaphore pong = new Semaphore(0); // PONG has initial permit 0 so PONG will be printed later

        // To change the order simply swap the number of permits

        Thread thread_1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i = 1; i <= 5; i++) {
                        // take the PING permit first
                        ping.acquire();
                        System.out.println("**PING**");
                        
                        // release the PONG permit
                        pong.release();
                        
                        Thread.sleep(1000);
                    }
                }
                catch(InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + "was interrupted");
                }
            }
        });

        Thread thread_2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i = 1; i <= 5; i++) {
                        // take the PONG permit released by thread 1
                        pong.acquire();
                        System.out.println("**PONG**\n");

                        // release back the PING permit for thread 1
                        ping.release();

                        Thread.sleep(1000);
                    }
                }
                catch(InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + "was interrupted");
                }
            }
        });

        System.out.println("**Game Start**");
        
        thread_1.start();
        thread_2.start();
        
        try {
            thread_1.join();
            thread_2.join();
        }
        catch(InterruptedException e) {
            System.out.println("Main Thread was Interrupted");
        }

        // this code runs only after both the threads are finished
        System.out.println("**Game Over**");
    }
}
