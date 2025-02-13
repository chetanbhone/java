
class parent {

    int a = 10;
    int b = 20;

    int add() {
        return (a + b);
    }

}

class subclass extends parent {

    void add(int x) {
        int sum = super.add();
        int res = sum + x;
        System.out.println("Result = " + res);
    }
}

public class Inherit {

    public static void main(String args[]) {

        subclass s1 = new subclass();
        s1.add(10);

    }

}
