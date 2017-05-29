import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class decending {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("z");
		al.add("c");
		al.add("b");
		al.add("w");
		al.add("a");
		List<String> al1=new ArrayList<>();
		al1.add("a");
		al1.add("sai");
		al1.add("mahesh");
		al1.add("narendra");
		al.retainAll(al1);
		System.out.println("iterating the elements after retaining the elements of al2...");
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}

}
