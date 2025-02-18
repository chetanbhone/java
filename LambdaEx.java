
public class LambdaEx {

    public static void main(String[] args) {

        Addition carea = (r) -> (int) (r * r * 3.14F);
        System.out.println("the area is " + carea.area(10));

    }
}

@FunctionalInterface
interface Addition {

    int area(int r);
}
