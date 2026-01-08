// if there is a single public class then it should have the name of the File
/*
    if there are multiple classes with main methods to run them first compile the file.
    if there are 2 classes inside Lets say A and B
    to run them individually use the command
    java A
    java B
 */

import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        
        // Integer variables
        byte b = 20; // size 1 byte
        short s = 10; // size 2 bytes
        int n = 30; // size 4 bytes
        long l = 40; // size 8 bytes

        // Floating point variables
        double d = 24.30; // default value size 8 bytes
        float f = 24.30f; // write f to convert into float, size 4 bytes

        // char variables
        char ch = 'k'; // size 2 byte

        // boolean variable
        boolean bool = true; // size system depenedent

        System.out.println(b);
        System.out.println(s);
        System.out.println(n);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(ch);
        System.out.println(bool);

        // to take input from the user we use Scanner class
        Scanner sc = new Scanner(System.in);

        int ip = sc.nextInt();
        System.out.println("User Input: " + ip);
        sc.close();
    }
}
