import java.util.Scanner;

// Add Three Numbers
class Ch1_Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int c = sc.nextInt();

        System.out.println("Result: " + (a + b + c));

        sc.close();
    }
}

// Percentage of three Subjects
class Ch1_Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Marks of your Subjects");
        System.out.print("Subject 1: ");
        int a = sc.nextInt();
        System.out.print("Subject 2: ");
        int b = sc.nextInt();
        System.out.print("Subject 3: ");
        int c = sc.nextInt();

        System.out.println("Result: " + ((a + b + c) / 3) + "%");

        sc.close();
    }
}

// Greet the user
class Ch1_Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String username = sc.nextLine();

        System.out.println("Hello " + username);

        sc.close();
    }
}

// Check whether Integer or Not
class Ch1_Question_4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("Integer: " + num);
        }
        else {
            System.err.println("You did not enter an Integer");
        }

        sc.close(); 
    }
}

