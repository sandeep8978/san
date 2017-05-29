import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Synchronizationdemo {
	public static void main(String[] args) {
		
		List<String> al=new ArrayList<>();
		al.add("relience");
		al.add("tata");
		al.add("hdfc");
		al.add("icici");
		al.add("tech");
		Collections.synchronizedList(al);
			Iterator<String> itr=al.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
				
			}
			
		}
		
	}


