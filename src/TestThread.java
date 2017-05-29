
class TestThread extends Thread{
	public void run(){
		System.out.println("running...");
	}
	public static void main(String[] args) {
		TestThread t1=new TestThread();
		t1.start();
		t1.start();
		
		
		
	}

}
