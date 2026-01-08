import java.util.Scanner;

class Ch3_Question_1 {
    public static void main(String[] args) {
        // Guess the Output of the Program
        int a = 10;
    
        if(a == 11) {
            System.out.println("11");
        }
        else {
            System.out.println("Not 11");
        }
        // output Not 11
    }
}

class Ch3_Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks of Three Subjects:");
        
        System.out.print("Subject 1: ");
        double sub1 = sc.nextDouble();
        
        System.out.print("Subject 2: ");
        double sub2 = sc.nextDouble();
        
        System.out.print("Subject 3: ");
        double sub3 = sc.nextDouble();

        double result = (sub1 + sub2 + sub3) / 3;
        
        if((sub1 < 33) || (sub2 < 33) || (sub3 < 33) || (result < 40)) {
            System.out.println("You Failed");
        }
        else {
            System.out.println("You Passed");
        }
        System.out.printf("Percentage: %.2f %%", result);

        sc.close();
    }
}

class Ch3_Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Income: ");
        double income = sc.nextDouble();

        if(income < 2.5e5) {
            System.out.println("Income Tax = 0");
        }
        else if(income >= 2.5e5 && income < 5e5) {
            System.out.printf("Income Tax = %.2f\n", income * 0.05);
        }
        else if(income >= 5e5 && income < 1e6) {
            System.out.printf("Income Tax = %.2f\n", income * 0.2);
        }
        else {
            System.out.printf("Income Tax = %.2f\n", income * 0.3);
        }
        sc.close();
    }
}
    
class Ch3_Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year: ");
        int year = sc.nextInt();

        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("It is a Leap Year");
        }
        else {
            System.out.println("It is not a Leap Year");
        }
        sc.close();
    }
}

class Ch3_Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Website URL: ");
        String website = sc.nextLine();

        if(website.endsWith(".com")) {
            System.out.println("It is a Commercial Website");
        }
        else if(website.endsWith(".org")) {
            System.out.println("It is an Organisation Website");
        }
        else if(website.endsWith(".in")) {
            System.out.println("It is an Indian Website");
        }
        sc.close();
    }
}