

class Mathoperation {

    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;

}

class subclass extends Mathoperation {

    int sum() {
        return super.a + super.b + super.c + super.d;
    }
}

public class SingleInheritance {

    public static void main(String args[]) {
        subclass s1 = new subclass();
        int res = s1.sum();
        System.out.println(res);
    }
}
