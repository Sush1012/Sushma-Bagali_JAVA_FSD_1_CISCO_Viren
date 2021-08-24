package Day6;

class Customer{
	int amt=10000;
	synchronized void withdraw(int amt) {
		System.out.println("Going to withdraw...");
		
		if(this.amt<amt) { //this.amt=>10000 amt==>input amt
			System.out.println("Less balance: Waiting for deposit...");
		    System.out.println("---------------------------------------------------");

			try {
				wait();
			}
			catch (Exception e) {
            System.out.println(e);	
            }
		}
			this.amt-=amt;
			System.out.println(amt +"  is deduted");
			System.out.println("Withdraw is successful!!! The Current balance is "+this.amt);
		    System.out.println("---------------------------------------------------");
	}
	synchronized void Deposit(int amt) {
		System.out.println("Going to deposit the amount...");
		this.amt+=amt;
		
		System.out.println("Deposit is successful!!! The Current balance is "+this.amt);
	    System.out.println("---------------------------------------------------");

		notify();
	}
}



public class Simple_Wait_NotifyExample {

	public static void main(String[] args) {
     Customer c=new Customer();
//     ---Annonymous class---
     new Thread() {
    	 public void run() {
			c.withdraw(5000);
		}
     }.start();
     
     new Thread() {
    	 public void run() {
			c.withdraw(2000);
		}
     }.start();
     
     new Thread() {
    	 public void run() {
			c.withdraw(15000);
		}
     }.start();
     
     new Thread() {
    	 public void run() {
			c.Deposit(20000);
		}
     }.start();
	
	}

}
