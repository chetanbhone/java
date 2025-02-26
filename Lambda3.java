
public class Lambda3 {

    public static void main(String[] args) {

        Arithmatic farheniate = (c) -> (c * 9 / 5 + 32);
        Arithmatic celcius = (c) -> ((c - 32) * 5 / 9);
        Arithmatic kelvin = (c) -> ((int) (c + 273.15));
        Arithmatic celciuss = (c) -> ((int) (c - 273.15));

        System.out.println("Celcius to farheniate " + farheniate.value(50));
        System.out.println("Farheniate to celcius" + celcius.value(100));
        System.out.println("Celcius to kelvin " + kelvin.value(60));
        System.out.println("kelvin to celcius" + celciuss.value(45));
    }

}

@FunctionalInterface
interface Arithmatic {

    int value(int c);
}
