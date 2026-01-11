import java.util.Timer;
import java.util.TimerTask;

public class timerTasks {
    public static void main(String[] args) {
        // Timer ==> Class that schedules tasks at specific times or periodically
        //           Useful for: Sending Notifications, scheduled updates, repetitive messages

        // TimerTasks ==> Represents the tasks that will be executed by the timer class
        //                We need to extend the timertasks class to define our task
        //                Create a subclass of this Timertask Class or create an Anonymous class and @override the method of run()

        // Countdown Timer

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {

            int count = 10;

            @Override
            public void run() {
                if(count >= 0) {
                    System.out.println(count);
                    count--;
                }
                else {
                    System.out.println("BOOM!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(timerTask, 1000, 1000);
    }
}
