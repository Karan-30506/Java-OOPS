// Abstract class
abstract class Shape {

    // abstract method 
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // abstract method which is required to be implemented by overwriting it
    @Override
    double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return Math.pow(side, 2);
    }
}

public class abstraction {
    public static void main(String[] args) {
        // abstract (keyword) ==> Used to implement abstract classes and methods 
        //                        Abstraction is the process of hiding implment details from the user
        //                        Abstract classes can't be instantiated into objects directly
        //                        They can contain 'abstract' methods which must be implemented by the child classes
        //                        They can contain 'concrete' methods which are inherited directly by child classes

        Circle circle = new Circle(7);
        Square square = new Square(4);
        System.out.println(circle.radius);
        System.out.println(square.area());
    }
}