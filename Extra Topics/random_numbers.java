import java.util.Random;

public class random_numbers {
    public static void main(String[] args) {
        Random r = new Random();
        
        int random = r.nextInt(1, 7); // [1, 7) --> 1 - 6
        System.out.println("Random Numebr: " + random);
    }   
}