import java.util.ArrayList;
import java.util.Iterator;

public class high {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(5);
		al.add(80);
		al.add(55);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()){
			int x=(Integer)itr.next();
			if(x<55)
				itr.remove();
		}
		System.out.println("afetr "+al);
		
	}

}
