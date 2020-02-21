package teja;

import java.util.Scanner;
import java.lang.Exception;

public  class Sai  {
	static double balance =1000;
	public   static Scanner sc;
	 public static void main(String[] args)  {
 sc = new Scanner(System.in);
 try
 {
 System.out.println("select the follwing options");
 System.out.println("press 1  to checkingAccount");
 System.out.println("press 2  to withdrawl"); 
 System.out.println("press 3  to Doubledeposit"); 
 int ik = sc.nextInt();
 if(ik==1)
 {
	 checkingAccount() ; 
 }
 else if(ik==2)
 {
 System.out.println(" enter withdrawl amount");
 withdrawl();
 
 }
 else if(ik==3)
 {
 System.out.println(" enter deposit amount");
 deposit();
 }
 else
 {
	System.out.println("invalid option");
}
 }
 catch(Exception e) {
	 e.printStackTrace();
 }
 }	 
	 public static  void checkingAccount() 
	 { 
		 System.out.println("Enter account number");
		 int i = sc.nextInt();
		 if(i==123456789)  {
			 System.out.println("welcome to ***** bank");
			 System.out.println( "your balance is " + balance); 
			 withdrawl();
			 getbalance();
			 
		 }
		 
		 else
		 {
			 System.out.println("Incorrect account number");
		 }
	 }
	 
	 
	 public static  void withdrawl()
	 {
		 System.out.println("  2 .enter withdrawl amount");
	     try
	     {
		 double amount ;
	       amount = sc.nextDouble();
	       if(amount>balance)
	       {
	    	   System.out.println("insuffient balance"); 
	       }
	       else
	       {
	    	   balance = balance - amount;
	    	   System.out.println("your balance is " + balance);
	    	   deposit();
	       }
	     }
	     catch(Exception e)
	     {
	    	 System.out.println("invalid amount");
	     }
		 }
	 public static  void deposit()
	 {
		 System.out.println(" 3.enter deposit amount");
		 try
		 {
	       double deposit ;
	       deposit = sc.nextDouble();
	          balance = balance + deposit;
	    	   System.out.println("your deposit  balance is " + balance);
	    	   
	       } 
		 catch(Exception e)
		 {
			 System.out.println("enter correct value");
		 }
	 }
	 

	 public void  setbalance(double balance)
	 {
		this.balance= balance;
		 
	 }
	 
	 
	 public static  double getbalance()
	 {
		
		return balance;
		 
	 }
	 
}



	
   

