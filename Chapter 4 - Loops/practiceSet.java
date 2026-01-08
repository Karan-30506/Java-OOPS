import java.util.Scanner;

class Ch4_Question_1 {
    /*
        Print the Following Pattern
        * * * * *
        * * * *
        * * *
        * *
        * 
    */
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Ch4_Question_2 {
    // Sum first n Even Numbers --> n(n+1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value N: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1; 
        while(i <= n) {
            sum += 2 * i;
            i++;
        }
        System.out.printf("Sum of first %d even natural numbers = %d\n", n, sum);
        sc.close();
    }
}

class Ch4_Question_3 {
    // Write a program to print Multiplication table of a given numebr N
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value N: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, i * n);
        }

        sc.close();
    }
}

class Ch4_Question_4 {
    // Find factorial of a given Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value N: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.printf("Factorial of %d = %d\n", n, fact);
        sc.close();
    }
}
