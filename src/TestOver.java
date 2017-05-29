class add{
	static int add(int a, int b){
		return a+b;
		
	}
	static int add(int a,int b, int c){
		return a+b+c;
	}
}
public class TestOver {
	public static void main(String[] args) {
		System.out.println(add.add(22, 25));
		System.out.println(add.add(50, 78));
	}

}
