import java.util.*;
public class bank{
    public static void main(String args[]){
        int currbal=10000;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Amount for Widthdraw here ...");
        int x= scn.nextInt();
        if(x>currbal){
            System.out.println("insufficient amount ! current balance :"+ currbal + "\nFor Successfull Widthdraw you need "+ (x-currbal));
        }else{
            System.out.printf("Widthdraw successfull Amount of Rupees : "+x);
        }
    }
}