import java.util.*;
public class exscn{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number here ...");
        int a=scn.nextInt();
        if(a%2==0){
            System.out.println(a+"is even number");
        }else{
            System.out.println(a+"is odd number");
        }
    }
}