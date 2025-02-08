import java.util.Scanner;

public class ATM {
    public static void main(String args[]) {
        int currBal = 5000;

        System.out.println("Select your bank type");
        System.out.println("Press 1 for Savings");
        System.out.println("Press 2 for Current");
        System.out.println("Press 3 for Salary");

        Scanner scn = new Scanner(System.in);
        int transactionType = scn.nextInt();

        switch (transactionType) {
            case 1:
                System.out.println("Savings Account");
                System.out.println("Your current balance is: " + currBal);
                break;

            case 2:
                System.out.println("Current Account");
                System.out.println("Your current balance is: " + currBal);
                break;

            case 3:
                System.out.println("Salary Account");
                System.out.println("Your current balance is: " + currBal);
                break;

            default:
                System.out.println("Invalid option! Please select a valid account type.");
                return;
        }

        scn.nextLine(); 

        System.out.println("Enter your Name Here...");
        String name = scn.nextLine();

        System.out.println("Enter your Account Number...");
        int num = scn.nextInt();

     

        System.out.println("Choose the operation that you want to perform");
        System.out.println("Press 1 for Withdraw\nPress 2 for Deposit");
        int choice = scn.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Amount for Withdrawal");
                int wd = scn.nextInt();
                if (wd > currBal) {
                    System.out.println("Insufficient Amount!");
                } else {
                    currBal -= wd;
                    System.out.println("Amount of " + wd + " successfully withdrawn");
                    System.out.println("Updated Account Balance: " + currBal);
                }
                break;

            case 2:
                System.out.println("Enter Amount to Deposit");
                int dep = scn.nextInt();
                if (dep <= 0) {
                    System.out.println("invalid deposit amount...");
                } else {
                    System.out.println("amount of " + dep + " deposited successfully");
                    System.out.println("updated account aalance:  " + (currBal+dep));
                }
                break;

            default:
                System.out.println("invalid choice!");
                break;
        }

       
    }
}
