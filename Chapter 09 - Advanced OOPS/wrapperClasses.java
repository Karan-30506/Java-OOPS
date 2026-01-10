public class wrapperClasses {
    public static void main(String[] args) {
        // Wrapper Classes ==> They allow Primitive data types (int, char, double, float, boolean)
        //                     to be used as objects by "wrapping them in an object".
        //                     generally we dont wrap primitive data types inside objects unless we really need to
        //                     Allows use of collection frameworks and utility static methods

        // Autoboxing
        Integer a = 30;
        Double d = 24.30;
        Character ch = 'K';
        String s = "Karan";

        System.out.println(a);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(s);

        // Unboxing
        int x = a;
        System.out.println(x);

        // Useful utility methods
        int i = Integer.parseInt("123");
        double j = Double.parseDouble("30.24");
        boolean b = Boolean.parseBoolean("true");
        char c = "Karan".charAt(2);

        System.out.println(i);
        System.out.println(j);
        System.out.println(b);
        System.out.println(c);

        String str1 = Integer.toString(345);
        String str2 = Double.toString(78.25);
        String str3 = Character.toString('7');
        String str4 = Boolean.toString(false);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
