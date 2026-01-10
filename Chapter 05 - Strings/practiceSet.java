import java.util.Scanner;

class Ch5_Question_1 {
    public static void main(String[] args) {
        // Convert a String to Lowercase
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a String: ");
        String str = sc.nextLine();

        System.out.printf("LowerCased String: %s\n", str.toLowerCase());

        sc.close();
    }
}

class Ch5_Question_2 {
    public static void main(String[] args) {
        // Replace " " with "_"
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a String with whitespaces: ");
        String str = sc.nextLine();

        System.out.printf("Resultant String: %s\n", str.replace(" ", "_"));

        sc.close();
    }
}

class Ch5_Question_3 {
    public static void main(String[] args) {
        // Fill a letter template
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Your Name: ");
        String name = sc.nextLine();
        
        // Method 1
        String letter1 = "Dear <|name|>, Thanks a Lot!";
        System.out.printf("Resultant String: %s\n", letter1.replace("<|name|>", name));

        // Method 2
        String letter2 = String.format("Dear %s, Thanks a Lot!", name);
        System.out.println(letter2);

        sc.close();
    }
}

class Ch5_Question_4 {
    // Seperate the domain of the Email
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter your Email: ");
        String email = sc.nextLine();

        System.out.println("Domain: " + email.substring(email.indexOf("@")));

        sc.close();
    }    
}