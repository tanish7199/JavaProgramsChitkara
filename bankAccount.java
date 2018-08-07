import java.util.Scanner;

class bankAccount{
	int account_number;
	int balance;
	int min_bal = 500;
	bankAccount(int no,int mbalance){
		this.account_number = no;
		this.balance = mbalance;
		if(balance > min_bal){
			this.balance = balance;
			System.out.println("New account successfully created");
			}
		else 
			System.out.println("Unsufficient balance");
	}
	void creditAmount(int bal){
		int x;
		x= bal;
		this.balance += x; 		
		System.out.println(this.balance);
	}
	void debitAmount(int bal){
		int x;
		x = bal;
		if( x < min_bal && ((this.balance-x)<500) )
			System.out.println("Unsufficient balance");
		else 
			this.balance -= x;
		System.out.println(this.balance);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number, balance;
		number = sc.nextInt();
		balance = sc.nextInt();
		bankAccount bc = new bankAccount(number,balance);
		System.out.println("Enter amount to be added");
		int credit;
		credit = sc.nextInt();
		bc.creditAmount(credit);
		System.out.println("Enter amount to be subtracted");
		int debit;
		debit = sc.nextInt();
		bc.debitAmount(debit);
	}
}
	