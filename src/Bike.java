
abstract class Bike {
	abstract void run();

}
class Spender extends Bike{

	void run() {
		System.out.println("Safely Running");
		
	}
	public static void main(String[] args) {
		Bike obj=new Spender();
		obj.run();
		
	}

}
