class people{
	int amount=5000;
	synchronized void withdraw(int amount){
		System.out.println("going to deposit");
		if(this.amount<amount){
			System.out.println("less balance,waiting to deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount -=amount;
		System.out.println("withdraw completed");
	}
	synchronized void deposit(int amount){
		System.out.println("going to deposit");
		this.amount +=amount;
		System.out.println("deposit is completed...");
		notify();
	}
}

public class TestInter {
	public static void main(String[] args) {
		final people c=new people();
		new Thread(){
			public void run(){
				c.withdraw(200);
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
