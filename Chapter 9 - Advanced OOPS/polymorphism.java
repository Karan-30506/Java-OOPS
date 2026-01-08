public class polymorphism {
    public static void main(String[] args) {
        // Polymorphism ==> Exists in different forms and shapes
        //                  We have seen polymorphism in constructor and method overloading as well

        // Consider the example of one abstract Shape class and different Shpes of it such as Cirlce, Square, Triangle etc
        // This is nothing but Polymorphism 

        Circle circle = new Circle(5);
        Square square = new Square(7);

        // The same shape class is existing in different forms and we can group them into one array of shapes
        Shape[] shapes = {circle, square};

        for(Shape shape : shapes) {
            System.out.printf("Area of the shape is %.2f\n", shape.area());
        }
    }
}
