import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(101);
		al.add(5);
		al.add(10);
		al.add(25);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			int x=(Integer)itr.next();
			if(x>25)
			itr.remove();
		}
		System.out.println("modified arraylist:"+al);

	}

}
