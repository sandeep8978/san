import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arr {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			int x=(Integer)itr.next();
			if(x<3)
				itr.remove();
		}
		System.out.println("after Modification"+al);
	}

}
