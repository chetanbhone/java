
public class Wrapercla 

    ss {

    public static void main(String[] args) {
        // Autoboxing: primitive to object
        Integer num = 10;  // int → Integer
        Double pi = 3.14;  // double → Double

        // Unboxing: object to primitive
        int value = num;  // Integer → int
        double piValue = pi;  // Double → double

        // Using utility methods
        int parsedNum = Integer.parseInt("123");  // String → int
        String str = num.toString();  // Integer → String

        System.out.println("Value: " + value);
        System.out.println("Parsed Num: " + parsedNum);
        System.out.println("String representation: " + str);
    }
}
