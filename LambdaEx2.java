
public class LambdaEx2 {

    public static void main(String[] args) {

        Area rarea = (l, b) -> (l * b);
        System.out.println("the area of rectange is " + rarea.rect(10, 50));

    }

    @FunctionalInterface
    interface Area {

        int rect(int l, int b);
    }

}
