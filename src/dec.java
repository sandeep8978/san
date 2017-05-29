import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dec {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(101);
		al.add(5);
		al.add(80);
		al.add(2);
		System.out.println("before sorting"+al);
		Collections.sort(al);
		System.out.println("After sorting:"+al);

	}

}
