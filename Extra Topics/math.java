public class math {

    private static double getCompoundInterest(double principle, double roi, int n) {
        double amt = principle * Math.pow((1 + (roi / 100)), n);
        return amt - principle;
    }
    public static void main(String[] args) {
        System.out.println("Pi: " + Math.PI);
        System.out.println("e: " + Math.E);

        // also we have various functions like 
        // pow(base, exp)
        // max()
        // min() 
        // abs()
        // sqrt()

        // Compound Interest Calculator

        System.out.printf("Compound Interest = %.2f\n", getCompoundInterest(10000, 2.5, 1));
    }
}
