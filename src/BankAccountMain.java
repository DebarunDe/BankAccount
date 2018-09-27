import java.util.*;
public class BankAccountMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		BankAccount hold = new BankAccount();
		
		System.out.println("What is your name");
		String name = in.nextLine();
		
		System.out.println("Welcome " + name + ". What is your Account Number?");
		String accNum = in.nextLine();
		System.out.println(accNum + ", what would you like to do?");
		System.out.println("1. Deposit /n 2. Withdraw /n 3.getBalance /n 4.toString");
		
		String choice = in.nextLine();
		
		if(choice == "" + 1) {
			
			
			BankAccount.deposit();
		}

	}

}
