package com.codegnan.constructorexam;

public class Bank_Overload {
	double balance;
	//double balance=5000;
//public void Bank_Overload(){
//	System.out.println("Bank Balance is : "+balance);
//}
	
public Bank_Overload(double balance){
		this.balance=balance;
		System.out.println("Bank Balance is : "+balance);
}
public void deposit(double amount) {
	balance+=amount;
	System.out.println("Deposit amount by cash : "+amount);
}

public void deposit(double amount,long cheque) {
	balance+=amount;
	System.out.println("Deposit amount is : "+amount+" via Cheque number is : "+cheque);
}

public void deposit(double amount,long id,String bank_name) {
	balance+=amount;
	System.out.println("Deposit amount via UPI is : "+amount);
	System.out.println("Transaction ID is : "+id+" Bank name is : "+bank_name);
}
public void Show_Balance() {
	System.out.println("Your Account Balance is : "+balance);
}

	public static void main(String[] args) {
		Bank_Overload b=new Bank_Overload(5000);
        //b.Bank_Overload(5000);
       // Bank_Overload b=new Bank_Overload();
        b.deposit(2000);
        b.deposit(1000,98765432);
        b.deposit(1500,123456,"Union Bank");
        b.Show_Balance();
	}

}
