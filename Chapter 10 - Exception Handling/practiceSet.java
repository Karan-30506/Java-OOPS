import java.util.ArrayList;
import java.util.Scanner;

class Ch10_Question_1 {
    // Illegal argument Exception example
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter username: ");
        String name = sc.nextLine();

        System.out.printf("Enter age: ");
        int age = sc.nextInt();

        userInfo(name, age);
        
        sc.close();
    }

    public static void userInfo(String username, int age) {
        if(username.isBlank() || age <= 0) {
            throw new IllegalArgumentException("Invalid User Details");
        }
        else {
            System.out.printf("Username: %s,\nAge: %d\n", username, age);
        }
    }
}

class Ch10_Question_2 {
    // Try-catch inside a loop
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();

        System.out.println("Enter the number of elements of the array: ");
        int lena = sc.nextInt();

        System.out.printf("Enter the array Elements: ");
        for(int i = 0; i < lena; i++) {
            a.add(sc.nextInt());
        }

        int retries = 5;
        while(retries > 0) {
            try {
                // sc.nextLine();
                System.out.printf("Enter an array index: ");
                int index = sc.nextInt();

                System.out.printf("Element Accessed: %d\n", a.get(index));
            }
            catch(Exception e) {
                System.out.println("Invalid input try again");
                retries--;
            }
        }
        sc.close();
        if(retries == 0) {
            throw new Exception("You are out of tries\n");
        }
    }
}