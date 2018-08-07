import java.util.Scanner;
import java.lang.*;

class Account{
	int accountNumber;
	double balance = 0.0;
	Account(int accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	Account(int accountNumber){
		this.accountNumber = accountNumber;
	}
	int getAccountNumber(){
		return accountNumber;
	}
	double getBalance(){
		return Math.round(balance*100)/100;
	}
	void setBalance(double balance){
		this.balance = balance;
	}
	void credit(double amount){
		balance = balance + amount;
	}
	void debit(double amount){
		if(balance>=amount)
			balance = balance - amount;
		else
			System.out.println("amount withdrawn exceeds the current balance");
	}

	@Override
	public String toString(){
		return "A/C no:"+getAccountNumber()+", Balance =$"+getBalance();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int accountNumber;
		double balance;
		System.out.println("Enter the account number");
		accountNumber = sc.nextInt();
		System.out.println("Enter the balance");
		balance = sc.nextFloat();
		Account ac = new Account(accountNumber, balance);
		System.out.println("Enter amount you want to credit");
		double amount;
		amount = sc.nextDouble();
		ac.credit(amount);
		System.out.println("Enter amount you want to debit");	
		amount = sc.nextDouble();
		ac.debit(amount);	
			
	}
}