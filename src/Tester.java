class sandeep{
	int amount=20000;
	synchronized void withdraw(int amount){
		System.out.println("going to withdraw.....");
		if(this.amount<amount){
			System.out.println("less balance,waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount -=amount;
		System.out.println("withdraw is completed");
	}
	synchronized void deposit(int amount){
		System.out.println("going to deposit");
		this.amount +=amount;
		System.out.println("deposit is completed");
		notify();
	}
}
public class Tester {
	public static void main(String[] args) {
		final sandeep c=new sandeep();
		new Thread(){
			public void run(){
				c.withdraw(1000);
			}
		}
		.start();
		new Thread(){
			public void run(){
				c.deposit(200);
			}
		}
		.start();
	}

}
