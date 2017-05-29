import java.util.ArrayList;
import java.util.Collections;

public class Reversse {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("sandeep");
		al.add("narendra");
		al.add("manu");
		al.add("suresh");
		al.add("father");
		System.out.println("before sorting"+al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("after sorting"+al);
	}

}
