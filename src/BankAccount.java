
public class BankAccount {
	
	private String name;
	private String accNum;
	private int balance;
	private double money;
	
	public BankAccount() {
		
		money = 0;
	}
	
	public BankAccount(String name, String accNum, int balance) {
		
		name = "" + 1;
		accNum = "" + 1;
		balance = 0;
		money = 0;
		
	}
	public void deposit() {
		
		money = balance;
		balance = balance + 100;
		
		
	}
	
    public void withdraw() {
		
		money = balance;
		balance = balance - 100;
		
		
	}
    

}
