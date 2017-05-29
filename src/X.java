import java.util.Iterator;
import java.util.LinkedHashSet;

public class X {
	public static void main(String[] args) {
		LinkedHashSet<String> al=new LinkedHashSet<>();
		al.add("sandeep");
		al.add("zebra");
		al.add("apple");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
