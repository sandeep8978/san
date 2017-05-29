import java.util.ArrayList;
import java.util.Iterator;

public class Fin {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(25);
		al.add(5);
		al.add(12);
		al.add(50);
		al.add(18);
		al.add(1);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			int x=(Integer)itr.next();
			if(x>25)
				itr.remove();
		}
		System.out.println("modified array"+al);
		
	}
	

}
