import java.util.ArrayList;
import java.util.List;

public class A {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(500);
		al.add(200);
		al.add(10);
		al.add(5);
		al.add(25);
		al.add(60);
		al.remove(2);
		al.add(2, 50);
		System.out.println("After elements"+al);

	}

}
