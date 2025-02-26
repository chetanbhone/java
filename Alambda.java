
public class Alambda {

    public static void main(String[] args) {

        Arithmatic add = (a, b) -> (a + b);
        Arithmatic sub = (a, b) -> (a - b);
        Arithmatic mul = (a, b) -> (a * b);
        Arithmatic div = (a, b) -> (a / b);

        System.out.println("sum is " + add.value(100, 200));
        System.out.println("substraction is" + sub.value(100, 400));
        System.out.println("Multiplication is" + mul.value(60, 50));
        System.out.println("Division  is" + div.value(500, 50));

    }

}

@FunctionalInterface
interface Arithmatic {

    int value(int a, int b);
}
