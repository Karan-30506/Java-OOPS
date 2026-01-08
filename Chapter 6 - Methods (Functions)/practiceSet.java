import java.util.Scanner;

class Ch6_Question_1 {
    public static void main(String[] args) {
        // write a program to print mulitplication table of a number

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a Number: ");
        int n = sc.nextInt();

        printTable(n);

        sc.close();
    }

    static void printTable(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
}

class Ch6_Question_2 {
    // Print the following pattern
    /*
        *
        * *
        * * *
        * * * *
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter the Number: ");
        int n = sc.nextInt();

        printPattern(n);
        
        sc.close();
    }

    static void printPattern(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}

class Ch6_Question_3 {
    // Recursive function to find sum of first n natural numbers

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            System.out.printf("Enter N: ");
            int n = sc.nextInt();

            System.out.printf("Sum = %d\n", getSum(n));
        
        sc.close();
    }

    static int getSum(int n) {
        if(n == 0)
            return 0;
        return n + getSum(n - 1);
    }
}

class Ch6_Question_4 {
    // print the followig pattern using recursion
    /*
        * * * *
        * * *
        * * 
        * 
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter N: ");
        int n = sc.nextInt();

        printRecPattern(n, 0);
        
        sc.close();
    }

    static void printRecPattern(int n, int i) {
        if(n == 0)
            return;

        if(i == n) {
            System.out.println();
            printRecPattern(n - 1, 0);
            return;
        }

        System.out.printf("* ");
        printRecPattern(n, i + 1);
    }
}