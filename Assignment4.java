package assignment;
import java.util.*;
class Account{
	Scanner sc=new Scanner(System.in);
	Account(){
		System.out.println("Account has been created successfully");
	}
	int amount=0;
	public void Deposit() {
		System.out.println("How much do u want to deposit: ");
		int deposit=sc.nextInt();
		amount=amount+deposit;
		System.out.println("Successfully deposited the amount of RS."+deposit);
	}
	public void Withdraw() {
		System.out.println("How much do u want to withdraw: ");
		int withdraw=sc.nextInt();
		if(amount>=withdraw) {
		   amount=amount-withdraw;
		   System.out.println("Successfully withdrawn the amount of RS."+withdraw);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	public int balance(){
		System.out.print("the balance amount is RS.");
		return amount;
	}
	
}

public class Assignment4 {
	public static void main(String[] args) {
		Account a1=new Account();
		a1.Deposit();
		a1.Withdraw();
		System.out.println(a1.balance());
		
	}
}
