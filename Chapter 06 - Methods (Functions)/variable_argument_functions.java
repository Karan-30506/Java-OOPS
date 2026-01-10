public class variable_argument_functions {
    public static void main(String[] args) {
        // varargs = allow a method to accept variable number of arguments
        //           avoids the need of method overloading
        //           all the arguments will be packed into an array
        //           (...) ellipses are used

        System.out.println(add(1, 2, 3, 4, 5, 6, 7));
    }

    static int add(int... nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    }
}
