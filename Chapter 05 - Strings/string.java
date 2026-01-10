public class string {
    public static void main(String[] args) {
        
        String str = "Karan Ahuja";

        // String Methods
        // 1. string.length() ==> returns the length of the string
        System.out.println("Length: " + str.length());
        
        // 2. toLowerCase() ==> converts the string to lower case
        System.out.println("LowerCase: " + str.toLowerCase());

        // 3. toUpperCase() ==> converts the string to upper case
        System.out.println("LowerCase: " + str.toUpperCase());

        // 4. trim() ==> removes leading and trailing whitespace
        System.out.println("Result: " + str.trim());

        // 5. substring(int startID, int endID) ==> returns a substring
        System.out.println("Substring: " + str.substring(0, 5));

        // 6. replace(arg1, arg2) ==> replace arg1 with arg2 throughout the string
        System.out.println("Replaced String: " + str.replace("a", "u"));

        // 7. startsWith(arg1) ==> returns true if the string starts with the given arg
        System.out.println("Result: " + str.startsWith("Kar"));

        // 8. endsWith(arg1) ==> returns true if the string ends with the given arg
        System.out.println("Result: " + str.endsWith("ja"));

        // 9. charAt(int index) ==> returns the char at the given index
        System.out.println("Char: " + str.charAt(4));

        // 10. indexOf(string arg) ==> returns the first index of the given string arg
        System.out.println("Index: " + str.indexOf("n"));

        // 11. equals(string arg) ==> checks if the given strings are equal or not
        System.out.println("Result: " + str.equals("Karan Ahuja"));
        // equalsIgnoreCase() ==> ignores the case while checking

        // 12. compareTo(string arg) ==> compare the 2 strings
        System.out.println("Result: " + str.compareTo("Abcd"));
        // compareToIgnoreCase() ==> ignores the case while checking

        // 13. isEmpty() ==> checks if the string is empty or not
        System.out.println("Empty: " + str.isEmpty());
    }
}
