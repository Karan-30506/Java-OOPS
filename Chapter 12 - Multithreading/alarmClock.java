import java.io.File;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

class Clock implements Runnable {

    private final LocalTime alarmTime;
    private final DateTimeFormatter formatter;

    Clock(LocalTime alarmTime, DateTimeFormatter formatter) {
        this.alarmTime = alarmTime;
        this.formatter = formatter;
    }

    @Override
    public void run() {
        while(LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);
                String currentTime = LocalTime.now().format(formatter);
                System.out.printf("\rCurrent Time: %s  ", currentTime);
            }
            catch (InterruptedException e) {
                System.out.println("Thread was Interrupted");
            }
        }

        try(Scanner sc = new Scanner(System.in)) {

            File soundFile = new File("alarm.wav");
            
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            clip.start();

            System.out.print("\n\nPress Enter to Stop the Alarm: ");
            sc.nextLine();
            clip.close();
        }
        catch (Exception e) {
            System.out.println("Error Playing Alarm Music");
            System.out.println(e);
        }
    }
}

public class alarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;

        while(alarmTime == null) {
            try {
                System.out.printf("Enter Alarm Time ( HH:mm:ss ): ");
                String time = sc.nextLine();

                alarmTime = LocalTime.parse(time, formatter);
                System.out.printf("Alarm Time: %s\n", alarmTime.toString());

            }
            catch (DateTimeException e) {
                System.out.println("Invalid Time Entered");
            }
        }

        Clock alarm_clock = new Clock(alarmTime, formatter);
        Thread alarmThread = new Thread(alarm_clock);

        alarmThread.start();

        try {
            alarmThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread was Interrupted");
        }
        
        sc.close();
    }
}
