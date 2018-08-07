import java.util.Scanner;

class bankAccount{
    int acc_no, min_bal;
    float balance;
    bankAccount(int acc_no,int balance){
        this.acc_no = acc_no;
        this.balance = balance;
    }
    void transaction(float val){
        balance = balance + val;
        System.out.println("Updated balance is: "+ balance);
    }
    void transaction(float val,int min_bal){
        if(balance-val>min_bal){
            balance = balance - val;
        }
        else System.out.println("Insufficient Balance");
    }
    void check(float open_balance){
        if(open_balance<min_bal){
            System.out.println("Opening balance should be greater than 500");
            val = sc.nextFloat();
        }
    }
    void interest(float savings_int){
        balance = balance + (savings_int*balance);
        System.out.println(balance);
    }
    void interest(int kids_current_int){
        balance = balance + (kids_current_int*balance);
        System.out.println(balance);
    }
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.out);
        System.out.println("Which kind of account do you want to open");
        System.out.println("Enter 1 for Savings, 2 for Current and 3 for kids");
        int opt;
        opt = sc1.nextInt();
        if(opt==1){
            Saving savings = new Savings();
        }
        else if(opt==2){
            kids kid = new kids();
        }
        else if(opt==3){
            System.out.println("Invalid option selected, please try again!");
            opt= sc1.nextInt();
        }
    }
}
class Savings extends bankAccount{
    float interest_savings = 6.5;
    System.out.println("Enter the balance");
    float val;
    Scanner sc = new Scanner(System.out);
    val = sc.nextFloat();
    super.check(val);
    System.out.println("Enter desired account number");
    int acc;
    acc = sc.nextInt();
    super.bankAccount(acc,val);
    super.interest(interest_savings);
    System.out.println("Do you want to add money? Please enter amount");
    int credit;
    credit = sc.nextInt();
    super.transaction(credit);
    System.out.println("Enter amount to debit");
    int debit;
    debit = sc.nextInt();
    super.transaction(debit,500);
}
class kids extends bankAccount{
    int interest_kids = 3;
    System.out.println("Enter the balance");
    float val;
    Scanner sc = new Scanner(System.out);
    val = sc.nextInt();
    super.check(val);
    System.out.println("Enter desired account number");
    int acc;
    acc = sc.nextInt();
    super.bankAccount(acc,val);
    super.interest(interest.kids);
    System.out.println("Do you want to add money? Please enter amount");
    int credit;
    credit = sc.nextInt();
    super.transaction(credit);
    System.out.println("Enter amount to debit");
    int debit;
    debit = sc.nextInt();
    super.transaction(debit,500);
}