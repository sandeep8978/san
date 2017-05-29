import java.util.HashSet;
import java.util.Iterator;

public class HashSettest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<>();
		set.add("sandeep");
		set.add("narendra");
		set.add("ajay");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}
