import java.util.Scanner;

class Sphere {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        if(radius > 0) {
            this.radius = radius;
        }
        else {
            System.out.println("Invalid Radius");
        }
    }

}

public class practiceSet_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter the value of the radius: ");
        double radius = sc.nextDouble();

        Sphere sp = new Sphere(radius);

        System.out.printf("A Sphere with radius %.2f was created\n", radius);

        double surfaceArea = (4) * (Math.PI) * (Math.pow(sp.getRadius(), 2));

        double volume = (4 / 3.00) * (Math.PI) * (Math.pow(sp.getRadius(), 3));

        System.out.printf("Surface Area = %.2f\nVolume = %.2f\n", surfaceArea, volume);
        
        sc.close();
    }
}