import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class as {
	public static void main(String[] args) {
		List<Integer> al1=new ArrayList<Integer>();
		List<Integer> al=new ArrayList<>();
		al.add(21);
		al.add(15);
		al.add(21);
		al.add(25);
		al.add(63);
		al.add(15);
		System.out.println(al);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()){
			Integer itr1=(Integer)itr.next();
			if(al1.contains(itr1)==false)
				al1.add(itr1);
		}
		System.out.println(al1);
	}

}
