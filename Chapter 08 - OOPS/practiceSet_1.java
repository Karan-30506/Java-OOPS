// Question 1
// Create a class Employee
class Employee {
    private int salary;
    private String name;

    int getSalary() {
        return this.salary;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }
}

// Question 2
class Cellphone {
    void ringing() {
        System.out.println("Your phone linging...");
    }

    void vibrating() {
        System.out.println("Your phone linging in silent mode...");
    }
}

// Quesiton 3
class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    double calculateArea() {
        return this.side * this.side;
    }

    double calculatePerimeter() {
        return 4 * this.side;
    }
}

// Quesiton 4
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
