public class methods {
    public static void main(String[] args) {
        System.out.println(add(30, 24));
    }

    // Method Overloading ==> Functions having the same name but different number of parameters

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }
}