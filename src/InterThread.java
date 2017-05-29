class coustmer{
	int amount=1000;
	synchronized void withdraw(int amount){
		System.out.println("going to withdraw...");
		if(this.amount<amount){
			System.out.println("less balance,waiting for deposit");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.amount -=amount;
		System.out.println("withdraw completed...");
	}
	synchronized void deposit(int amount){
		System.out.println("going to deposit....");
		this.amount +=amount;
		System.out.println("deposit is complete");
		notify();
	}

}
public class InterThread {
	public static void main(String[] args) {
		 final coustmer c=new coustmer();
		 new Thread(){
			 public void run(){
				 c.withdraw(1500);
				 
			 }
		
			
			 
		 }
		 .start();
		 new Thread(){
			 public void run(){
				 c.deposit(100);
			 }
		 }
		 .start();
	
	}

}
