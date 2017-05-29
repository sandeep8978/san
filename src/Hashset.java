import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("zebra");
		hs.add("monkey");
		hs.add("apple");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
