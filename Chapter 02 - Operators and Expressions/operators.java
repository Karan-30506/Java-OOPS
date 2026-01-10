public class operators {
    public static void main(String[] args) {
        int num1 = 30, num2 = 24;
        
        // Arithmetic Operators --> +, -, *, /, %, ++, --
        System.out.println(num1 + num2); // Addition Operator
        System.out.println(num1 - num2); // Subtraction Operator
        System.out.println(num1 * num2); // Multiply Operator
        System.out.println(num1 / num2); // Division Operator
        System.out.println(num1 % num2); // Modulo Operator
        System.out.println(num1++); // Increment Operator --> first use then Increment
        System.out.println(++num1); // first Increment then use
        System.out.println(num1--); // Decrement Operator --> first use then Decrement
        System.out.println(--num1); // first Decrement then use
        
        // Assignment Operators --> =, +=, -=, *=, /=

        // Comparison Operators --> ==, !=, >=, >, <=, <
        System.out.println(num1 == num2); // Equal to Operator
        System.out.println(num1 != num2); // Not Equal to Operator
        System.out.println(num1 > num2); // greater than
        System.out.println(num1 >= num2); // greater than eqaul to
        System.out.println(num1 < num2); // less than 
        System.out.println(num1 <= num2); // less than equal to 

        // Logical Operators --> &&, ||, !
        System.out.println(true && true); // Logical AND
        System.out.println(false || true); // Logical OR
        System.out.println(!true); // Logical NOT

        // Bitwise Operators --> &, |, >>, <<
        System.out.println(num1 & 2); // takes bitwise AND operation of each individual bits
        System.out.println(num2 | 4); // takes bitwise OR operation of each individual bits
        System.out.println(num1 >> 2); // Left SHift Operator
        System.out.println(num1 << 2); // Right Shift Operator
    }
}
