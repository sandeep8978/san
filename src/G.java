import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class G {
	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("A");
		al.add("c");
		al.add("b");
		al.add("A");
		System.out.println("before removing duplicate Elements"+al);
		HashSet<String> hs=new HashSet<>();
		hs.addAll(al);
		al.clear();
		al.addAll(hs);
		System.out.println("after removing duplicate Elements"+al);
	}

}
