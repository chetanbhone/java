package secprogram;
import java.util.Scanner;
public class account {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	       double accbalance=30000, subs,add, deposite;
	       String name;
	       long accNumer;
	       int choice,transcationtype,cashWithdrwal;
	         
	       System.out.println("Select account type");
	       System.out.println("1.saving:");
	       System.out.println("2.current:");
	       System.out.println("3.salary");
	       System.out.println("Enter your choice(1/2/3):");
	       choice=sc.nextInt();
	       
	       while(choice==1 ||choice==2 ||choice==3 ) {
	    	   System.out.println("\n Select Transcation");
	    	   transcationtype=sc.nextInt();
		       System.out.println("1.withdrwal:");
		       System.out.println("2.Deposite:");
		       System.out.println("3. Check Balance");
		       System.out.println("Enter your choice(1/2/3):");
		       
		       
		       switch (transcationtype) {
		    	   
		       case 1: 
		       System.out.println("withdrwal transaction");
		       System.out.println("Enter Amount :");
		       cashWithdrwal=sc.nextInt();
		       if(accbalance<cashWithdrwal) {
					System.out.println("Insufficient balance.");
				}
		       
				else if(accbalance>cashWithdrwal)
				{
					 subs=accbalance-cashWithdrwal;
				    System.out.println("Congratulation your withdrwal is successful & \nyour current balnce is ."+subs);
				 }
		       break;
		       
		       case 2:
		    	   System.out.println("2.Deposite:");
		    	   deposite= sc.nextDouble();
		    	   public class 
		    	   add=accbalance+deposite;
		    	   System.out.println("Amount successfully Deposite :"+add);
		       break;
		       
		       case 3:
		    	   System.out.println("Total balance is:"+add);
		           break;
		           
		       default :
		    	   System.out.println("Invalid choice . Please enter valid choice!!");
		    	   
		       }
	       }


	}

}