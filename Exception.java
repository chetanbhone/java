
public class Exception {

    static void division(int a, int b) {
        try {
            System.out.println(a + "/" + b + "=" + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("getmessage" + e.getMessage());
            e.printStackTrace();
        }
    }

    static void divArray(int[] arr) {
        try {
            int res = arr[0] / arr[1];
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Always Executes");
        }
    }

    static void multiplication(int[] arr) {
        if ((arr[0] != 0) && (arr[2] != 0)) {
            int res = arr[0] * arr[1];
        } else {
            throw new ArithmeticException("multipliocation with Zero");
        }
    }

    public static void main(String[] args) {
        // Exception.division(5, 0);
        // System.out.println("After Method Executes...");
        int[] arr = {0, 0, 2};
        try {
            Exception.multiplication(arr);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("After Methods Executes");
    }

}
