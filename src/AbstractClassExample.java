abstract class AbstractClassExample {
	abstract void run();

}
class Honda extends AbstractClassExample{
	void run()
	{
		System.out.println("running safely.....");
	}
	public static void main(String[] args) {
		AbstractClassExample obj=new Honda();
		obj.run();
		
	}
	
}
