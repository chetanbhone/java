import java.util.*;
public class student{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter your roll number here...");
        int roll = scn.nextInt();
        System.out.println("enter your name here...");
        scn.nextLine();
        String s = scn.nextLine();

        System.out.println("------------- Student Data -----------");
        System.out.println("Student number " +roll);
        System.out.println("Student name"+s);
    }
}